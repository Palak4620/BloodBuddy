<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Camp Registration</title>
        <style>
            /* General Styles */
            body {
                font-family: Arial, sans-serif;
                background-color: #f9f9f9;
                margin: 0;
                padding: 0;
                color: #333;
            }

            /* Header Box Styling */
            .header {
                box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
                padding: 30px;
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

            /* Form Layout */
            .form-container {
                display: flex;
                justify-content: space-between;
                flex-wrap: wrap;
            }

            /* Left and Right Section */
            .left, .right {
                width: 48%;
                margin-bottom: 20px;
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
        <form method="post" action="insertCampData.jsp">
            <div class="header">
                <h1>Camp Registration</h1>
                <div class="form-container">
                    <div class="left">
                        <label for="Organizationname">Organization Name:</label>
                        <input type="text" name="Organization_name" id="Organizationname" required><br>
                        
                        <label for="Organizername">Organizer Name:</label>
                        <input type="text" name="Organizer_name" id="Organizername" required><br>
                        
                        <label for="phnno">Organizer Mobile No:</label>
                        <input type="text" name="Organizer_no" id="phnno" required><br>
                        
                        <label for="email">Organizer Email Id:</label>
                        <input type="text" name="Organizer_Email_Id" id="email" required><br>
                                             
                        <label for="Campaddress">Camp Address:</label>
                        <input type="text" name="Camp_Address" id="Campaddress" required><br>
                    </div>

                    <div class="right">
                        <label for="Campname">Camp Name:</label>
                        <input type="text" name="Camp_Name" id="Campname" required><br>
                        
                        <label for="Cityname">City Name:</label>
                        <input type="text" name="City_name" id="Cityname" required><br>
                        
                        <label for="Campproposedate">Camp Proposed Date:</label>
                        <input type="text" name="Camp_date" id="Campproposedate" required><br>
                        
                        <label for="estimatedparticipants">Estimated Participants:</label>
                        <input type="number" name="Estimated_participants" id="estimatedparticipants" required><br>
                        
                        <label for="state">State:</label>
                        <input type="text" name="State" id="state" required><br>
                                          
                    </div>
                </div>

                <div class="submit-container">
                    <input type="submit" value="Register Camp">
                </div>
            </div>
        </form>
    </body>
</html>
