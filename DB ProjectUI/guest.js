// api url
const api_url =
  "http://localhost:8080/guestconcerts/findBy";

$(document).ready(function () {

  fetch(api_url)
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

