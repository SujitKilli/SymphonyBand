// api url
const api_url =
  "http://localhost:8080/user/login";

$(document).ready(function () {

  $("#login_form").submit(function (e) {
    e.preventDefault();
    var formData = {
      phoneNo: $("#phoneNo").val(),
      pwd: $("#pwd").val()
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
      .then((user) => {
        console.log(user);
        if (user.role_name=='Manager') {
          location.href = 'Manager.html?user_id='+user.user_id
        }
        else if (user.role_name=='Admin') {
          location.href = 'Admin.html?user_id='+user.user_id
          
        }
        else if (user.role_name=='Technician') {
          location.href = 'Technician.html?user_id='+user.user_id
          
        }
        else if (user.role_name=='Musician') {
          location.href = 'Musician.html?user_id='+user.user_id
          
        }
        else if (user.role_name=='Customer') {
          location.href = 'userlogin.html?user_id='+user.user_id
        }
        else
        location.href = 'Invalidpassword.html';
      }).catch(error =>{location.href = 'Invalidpassword.html'});

  });
});