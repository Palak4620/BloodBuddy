<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Bank Login</title>
        <style>
            /* General Styles */
            body {
                font-family: Arial, sans-serif;
                background-color: #f7f7f7;
                color: #333;
                line-height: 1.6;
            }

            /* Form Box */
            .box {
                box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);
                padding: 30px;
                height: 400px;
                width: 35%;
                background-color: #fafafa;
                margin: 60px auto;
                border-radius: 8px;
                border: 1px solid #dcdcdc;
                color: #2c3e50;
            }

            h1 {
                text-align: center;
                color: #c0392b;
                margin-bottom: 30px;
                font-size: 24px;
                font-weight: bold;
            }

            .header {
                font-size: 18px;
                color: #7f8c8d;
                margin-bottom: 30px;
            }

            input[type="text"], input[type="password"] {
                width: 100%;
                padding: 12px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 5px;
                font-size: 16px;
                box-sizing: border-box;
            }

            input[type="submit"] {
                background-color: #c0392b;
                color: white;
                padding: 12px 20px;
                font-size: 18px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                width: 100%;
                transition: background-color 0.3s ease;
            }

            input[type="submit"]:hover {
                background-color: #e74c3c;
            }

            .register-link {
                text-align: center;
                font-size: 16px;
                margin-top: 20px;
            }

            .register-link a {
                color: #c0392b;
                text-decoration: none;
                font-weight: bold;
            }

            .register-link a:hover {
                text-decoration: underline;
            }

        </style>
    </head>
    <body>

        <div class="box">
            <h1>Blood Bank Login</h1>
            <form method="post" action="">
                <div class="header">
                    <label for="username">Username:</label>
                    <input type="text" name="username" id="username" required>
                    <br><br>
                    <label for="password">Password:</label>
                    <input type="password" name="password" id="password" required>
                    <br><br>
                    <input type="submit" value="Login">
                </div>
            </form>
            <div class="register-link">
                <p>Don't have an account? <a href="signin.jsp">Register here</a></p>
            </div>
        </div>

    </body>
</html>
