const queryString = window.location.search;

const urlParams = new URLSearchParams(queryString);
const curUserId = urlParams.get('user_id')


// api url
const api_url =
  "http://localhost:8080/elaboratedconcerts/findByManagerAndTimeline/"+curUserId;

  const api_url2 =
  "http://localhost:8080/managerempmapping/findByManager/"+curUserId;

  const api_url3 =
  "http://localhost:8080/elaboratedconcerts/futureRequests";

$(document).ready(function () {

  fetch(api_url+"/Past")
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log(data);
    const tbody=document.getElementById("past-concert-body")
    for (const item of data) { 
      tbody.innerHTML +=
        `<tr align="center">
        <td>${item.concert_id}</td>
        <td>${item.actual_type}</td>
        <td>${item.concert_status}</td>
        <td>${item.concert_date}</td>
        <td>${item.concert_time}</td>
        <td>${item.location_name}</td>
        </tr>` 
      }
    
  });

  getFutureConcerts();

  fetch(api_url2)
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log(data);
    const tbody=document.getElementById("employee-body")
    for (const item of data) { 
    tbody.innerHTML +=
    `<tr align="center">
    <td>${item.manager}</td>
    <td>${item.employee}</td>
    <td>${item.rolename}</td>
    </tr>` 
    }
  });


});

function approve(id){
    const approve_url = "http://localhost:8080/concert/approveConcert"
    var formData = {
        concertID: id,
        managerID: curUserId 
      }
      console.log(formData);
  
  
      fetch(approve_url, {
        method: 'POST',
        headers: {
          'Content-type': 'application/json'
        },
        body: JSON.stringify(formData)
      })
        .then((response) => {
          return response.json();
        })
        .then((myJson) => {
          console.log(myJson);
          getFutureConcerts();
        });
  
};

function reject(id){
    const reject_url = "http://localhost:8080/concert/rejectConcert"
    var formData = {
        concertID: id,
        managerID: curUserId 
      }
      console.log(formData);
  
  
      fetch(reject_url, {
        method: 'POST',
        headers: {
          'Content-type': 'application/json'
        },
        body: JSON.stringify(formData)
      })
        .then((response) => {
          return response.json();
        })
        .then((myJson) => {
          console.log(myJson);
          getFutureConcerts();
        });
    
};

function getFutureConcerts(){
    fetch(api_url3) 
    .then((response) => {
      return response.json();
    })
    .then((data) => {
      console.log(data);
      const tbody=document.getElementById("upcoming-concert-body")
      tbody.innerHTML=''
      for (const item of data) { 
      tbody.innerHTML +=
      `<tr align="center">
      <td>${item.concert_id}</td>
      <td>${item.actual_type}</td>
      <td>${item.concert_status}</td>
      <td>${item.concert_date}</td>
      <td>${item.concert_time}</td>
      <td>${item.location_name}</td>
      <td><button onclick="approve(${item.concert_id})">Approve</button></td>
      <td><button onclick="reject(${item.concert_id})">Reject</button></td>
      </tr>` 
      }
    });
}