<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donor Registration</title>
        <style>
            /* General Styles */
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 0;
                color: #333;
            }

            /* Header Box Styling */
            .header {
                box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);
                padding: 30px;
                height: auto;
                width: 60%;
                background-color: #fafafa;
                margin: 30px auto;
                border-radius: 8px;
                border: 1px solid #ddd;
                color: #2c3e50;
            }

            h1 {
                text-align: center;
                color: #c0392b;
                margin-bottom: 30px;
                font-size: 28px;
                font-weight: bold;
            }

            .form-container {
                display: flex;
                justify-content: space-between;
            }

            /* Left Section */
            .left, .right {
                width: 48%;
            }

            .left input, .right input {
                width: 100%;
                padding: 12px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 5px;
                font-size: 16px;
            }

            .left input:focus, .right input:focus {
                border-color: #c0392b;
                outline: none;
            }

            .submit-container {
                text-align: center;
                margin-top: 20px;
            }

            .submit-container input {
                background-color: #c0392b;
                color: white;
                padding: 12px 20px;
                font-size: 18px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                width: 50%;
                transition: background-color 0.3s ease;
            }

            .submit-container input:hover {
                background-color: #e74c3c;
            }

            /* Responsive Design */
            @media (max-width: 768px) {
                .form-container {
                    flex-direction: column;
                }

                .left, .right {
                    width: 100%;
                }
            }
        </style>
    </head>
   
    <body>
        <form method="post" action="signin1.jsp">
            <div class="header">
                <h1>Donor Registration</h1>
                <div class="form-container">
                    <div class="left">
                        <label for="name">Name:</label>
                        <input type="text" name="name" id="name" required><br>
                        
                        <label for="pass">Password:</label>
                        <input type="text" name="pass" id="pass" required><br>
                        
                        <label for="gender">Gender:</label>
                        <input type="text" name="gender" id="gender" required><br>
                        
                        <label for="mobile">Mobile:</label>
                        <input type="text" name="mobile" id="mobile" required><br>
                        
                        <label for="state">State:</label>
                        <input type="text" name="state" id="state" required><br>
                        
                        <label for="address">Address:</label>
                        <input type="text" name="address" id="address" required><br>
                    </div>
                    <div class="right">
                        <label for="age">Age:</label>
                        <input type="text" name="age" id="age" required><br>
                        
                        <label for="fname">Father's Name:</label>
                        <input type="text" name="fname" id="fname" required><br>
                        
                        <label for="email">Email:</label>
                        <input type="text" name="email" id="email" required><br>
                        
                        <label for="district">District:</label>
                        <input type="text" name="district" id="district" required><br>
                        
                        <label for="pincode">Pin Code:</label>
                        <input type="text" name="pincode" id="pincode" required><br>
                    </div>
                </div>
                <div class="submit-container">
                    <input type="submit" value="Sign Up">
                </div>
            </div>
        </form>
    </body>
</html>
