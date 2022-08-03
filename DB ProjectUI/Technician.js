const queryString = window.location.search;

const urlParams = new URLSearchParams(queryString);
const curUserId = urlParams.get('user_id')


// api url
const api_url =
  "http://localhost:8080/involvedconcerts/findByUserandTimeLine/"+curUserId;

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

  fetch(api_url+"/Future")
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log(data);
    const tbody=document.getElementById("upcoming-concert-body")
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

});

