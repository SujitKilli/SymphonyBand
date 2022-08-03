const queryString = window.location.search;

const urlParams = new URLSearchParams(queryString);
const curUserId = urlParams.get('user_id')


// api url
const api_url =
  "http://localhost:8080/elaboratedconcerts/findByCustomerAndTimeline/" + curUserId;

const api_url2 =
  "http://localhost:8080/concert/createConcert";

$(document).ready(function () {
  getpast();
  getfuture();

  $("#request_concert").submit(function (e) {
    e.preventDefault();
    var formData = {
      custid: curUserId,
      amount: $("#amount").val(),
      concert_date: $("#concert_date").val(),
      concert_time: $("#concert_time").val()+':00',
      loc_id: $("#loc_id").val(),
      concert_type: $("#concert_type").val()
    }
    console.log(formData);


    fetch(api_url2, {
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
        getfuture();
      });

  });

});

function getpast() {
  fetch(api_url + "/Past")
    .then((response) => {
      return response.json();
    })
    .then((data) => {
      console.log(data);
      const tbody = document.getElementById("past-concert-body")
      tbody.innerHTML = ''
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
};
function getfuture() {
  fetch(api_url + "/Future")
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log(data);
    const tbody = document.getElementById("upcoming-concert-body")
    tbody.innerHTML = ''
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


};


