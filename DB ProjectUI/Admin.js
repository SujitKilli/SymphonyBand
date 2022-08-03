const queryString = window.location.search;

const urlParams = new URLSearchParams(queryString);
const curUserId = urlParams.get('user_id')


// api url
const api_url =
  "http://localhost:8080/elaboratedconcerts/all";

  const api_url2 =
  "http://localhost:8080/managerempmapping/all";

$(document).ready(function () {

  fetch(api_url)
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log(data);
    const tbody=document.getElementById("concert-body")
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

