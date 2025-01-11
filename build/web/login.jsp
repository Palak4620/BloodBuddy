<%@include file='header.jsp' %>
<%@page import="dao.BloodDAO"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Management Login</title>
    <style>
        body {
            padding: 0;
            font-family: Arial, sans-serif;
            background: url('blood4.jpg') no-repeat center center fixed;
            background-size: cover;
            height: 100vh;
            justify-content: center;
            align-items: center;
        }

        .login-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            margin-left: 400px;
            margin-top: 50px;
            justify-content: center;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
            width: 300px;
            text-align: center;
        }

        .login-container h2 {
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        .login-button {
            background-color: #d9534f;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 3px;
            cursor: pointer;
            width: 100%;
        }

        .login-button:hover {
            background-color: #c9302c;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h2>Hospital Login</h2>
        <form action="#" method="post">
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="login-button">Login</button>
        </form>
             <%
           String user=null,pass=null,msg;
           user=request.getParameter("username");
           pass=request.getParameter("password");
           if(user!=null && pass!=null){
               BloodDAO bd=new BloodDAO();
               if(bd.checklogin(user, pass)){
                   response.sendRedirect("DeleteDonar.jsp");
               }else{
                     out.println("<font color=red size=4>Invalid UserID or Password</font>");
               }
           }
        %>
    </div>
</body>
</html>
