// api url
const api_url =
  "http://localhost:8080/user/pwdchange";

$(document).ready(function () {

  $("#forget_pwd").submit(function (e) {
    e.preventDefault();
    var formData = {
      phoneno: $("#phoneno").val(),
      pwd: $("#pwd").val(),
      question: $("#question").val(),
      ans: $("#ans").val()
    }
    console.log(formData);


    fetch(api_url, {
      method: 'POST',
      headers: {
        'Content-type': 'application/json'
      },
      body: JSON.stringify(formData)
    })
    .catch(error => {
        location.href = 'Invalidpassword.html';
    })
      .then((response) => {
        return response.json();
      })
      .then((user) => {
        console.log(user);
       location.href='LoginPage.html'
      });

  });
});