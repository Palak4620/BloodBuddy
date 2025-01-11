<%@include file='header.jsp' %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Blood Donor Form</title>
<style>
  body {
    margin: 0;
    padding: 0;
    background-size: crop;
    background-position: center;
    font-family: Arial, sans-serif;
  }
  .container {
    max-width: 900px;
    margin: auto;
    background-color: rgba(255, 255, 255, 0.8);
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
  }
  .container h1 {
    text-align: center;
    margin-bottom: 20px;
  }
  .form-group {
    margin-bottom: 15px;
  }
  label {
    font-weight: bold;
  }
  input[type="text"],
  input[type="email"],
  select {
    width: 100%;
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }
  select {
    height: 38px;
  }
  input[type="radio"] {
    margin-right: 5px;
  }
  .btn-submit {
    width: 100%;
    background-color: #e74c3c;
    color: white;
    border: none;
    padding: 10px;
    border-radius: 4px;
    cursor: pointer;
  }
  .btn-submit:hover {
    background-color: #c0392b;
  }
  .ftr{
    background-color: rgba(0,0,0,0.4);
    height: 200px;
}

.fa {
  padding: 20px;
  font-size: 20px;
  width: 30px;
  text-align: center;
  text-decoration: none;
  margin: 5px 2px;
}
.fa:hover {
    opacity: 0.7;
}

.fa-facebook {
  background: #3B5998;
  color: white;
}

.fa-twitter {
  background: #55ACEE;
  color: white;
}


.fa-youtube {
  background: #bb0000;
  color: white;
}

.fa-instagram {
  background: #125688;
  color: white;
}

.content{
        background-image: url('./Images/img09.jpg');
}
</style>
</head>
<body>
    <div class="content">
<div class="container">
  <h1>Blood Donor Form</h1>
  <form method="post" action="insertData.jsp">
    <div class="form-group">
      <label for="donorId">Donor ID:</label>
      <input type="text" id="donorId" name="did" required>
    </div>
    <div class="form-group">
      <label for="fullName">Full Name:</label>
      <input type="text" id="fullName" name="name" required>
    </div>
    <div class="form-group">
      <label for="fatherName">Father Name:</label>
      <input type="text" id="fatherName" name="fname" required>
    </div>
    <div class="form-group">
      <label for="motherName">Mother Name:</label>
      <input type="text" id="motherName" name="mname" required>
    </div>
    <div class="form-group">
      <label for="phone">Phone No.:</label>
      <input type="tel" id="phone" name="phoneno" required>
    </div>
    <div class="form-group">
      <label for="email">Email ID:</label>
      <input type="email" id="email" name="email" required>
    </div>
    <div class="form-group">
      <label for="bloodGroup">Blood Group:</label>
      <select id="bloodGroup" name="bgroup" required>
        <option value="A+">A+</option>
        <option value="B+">B+</option>
        <option value="AB+">AB+</option>
        <option value="O+">O+</option>
        <option value="A-">A-</option>
        <option value="B-">B-</option>
        <option value="AB-">AB-</option>
        <option value="O-">O-</option>
      </select>
    </div>
    <div class="form-group">
      <label>Gender:</label>
      <input type="radio" id="male" name="gender" value="male" required>
      <label for="male">Male</label>
      <input type="radio" id="female" name="gender" value="female">
      <label for="female">Female</label>
    </div>
    <div class="form-group">
      <label for="city">City:</label>
      <input type="text" id="city" name="city" required>
    </div>
    <div class="form-group">
      <label for="address">Address:</label>
      <input type="text" id="address" name="address" required>
    </div>
    <button type="submit" class="btn-submit">Register</button>
  </form>
</div>
        </div>   
 
    <footer class="ftr">
            <center><h1>JOIN OUR CAUSE</h1></center>
            <p>Donating blood or platelets can be intimidating and even scary. Time to put those 
                hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>
            <center>
                <a href="#" class="fa fa-facebook"></a>
                <a href="#" class="fa fa-twitter"></a>
                <a href="#" class="fa fa-youtube"></a>
            </center>
        </footer>
</body>
</html>
