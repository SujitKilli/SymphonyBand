// api url
const api_url =
  "http://localhost:8080/user/register";

$(document).ready(function () {

  $("#register").submit(function (e) {
    e.preventDefault();
    var formData = {
      fname: $("#fname").val(),
      lname: $("#lname").val(),
      pwd: $("#pwd").val(),
      phno: $("#phno").val(),
      security_question: $("#security_question").val(),
      security_ans: $("#security_ans").val()
    }
    console.log(formData);


    fetch(api_url, {
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
        location.href = 'LoginPage.html';
      });

  });
});