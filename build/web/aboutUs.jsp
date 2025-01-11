<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%@include file='header.jsp' %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About Us - Blood Buddy</title>
    <style>
        /* Global Styles */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
            color: #333;
            line-height: 1.6;
        }

        /* Header Section */
        header {
            background-color: #c62828;
            color: white;
            padding: 20px;
            text-align: center;
            font-size: 36px;
            font-weight: bold;
        }

        /* Container Styles */
        .container {
            max-width: 1200px;
            margin: 30px auto;
            padding: 30px;
            background: white;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        .container h1 {
            color: #c62828;
            text-align: center;
            margin-bottom: 30px;
        }

        /* Content Styling */
        .content {
            font-size: 18px;
            text-align: justify;
        }

        .content h2 {
            color: #c62828;
            margin-top: 20px;
        }

        .content p {
            margin: 10px 0;
        }

        /* Features Section */
        .features {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
            margin-top: 30px;
        }

        .feature-box {
            background-color: #fbe9e7;
            margin: 10px;
            padding: 20px;
            border: 1px solid #c62828;
            border-radius: 8px;
            flex: 1 1 300px;
            text-align: center;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }

        .feature-box h3 {
            color: #c62828;
            margin-bottom: 10px;
        }

        /* Footer Section */
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 15px 0;
            margin-top: 30px;
            font-size: 14px;
        }

        footer a {
            color: #c62828;
            text-decoration: none;
        }

        /* Team Section */
        .team {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            margin-top: 30px;
        }

        .team-member {
            background-color: #fbe9e7;
            margin: 10px;
            padding: 20px;
            border: 1px solid #c62828;
            border-radius: 8px;
            text-align: center;
            width: 280px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .team-member h3 {
            color: #c62828;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    
    <div class="container">
        <h1>Welcome to Blood Buddy</h1>
        <div class="content">
            <p><strong>Blood Buddy</strong> is a cutting-edge blood donation management system designed to revolutionize the way blood donation is managed and facilitated. It connects donors, blood banks, and hospitals seamlessly, ensuring a fast, reliable, and transparent process for saving lives.</p>

            <h2>What is Blood Buddy?</h2>
            <p>Blood Buddy is more than just a platform; it?s a life-saving network. With the demand for blood donations constantly increasing, Blood Buddy steps in as a comprehensive system to bridge the gap between those in need of blood and donors willing to help. Our user-friendly system ensures efficiency and ease for all users, fostering a community of dedicated donors.</p>

            <h2>Our Mission</h2>
            <p>Our mission is to ensure no life is lost due to the unavailability of blood. We aim to create a network where blood donations are facilitated effortlessly, empowering communities and ensuring timely access to life-saving resources.</p>

            <h2>Our Vision</h2>
            <p>We envision a world where every individual can access the blood they need, anywhere and at any time. Through technology and community collaboration, we strive to eliminate blood shortages globally.</p>

            <h2>Key Features</h2>
            <div class="features">
                <div class="feature-box">
                    <h3>Donor Registration</h3>
                    <p>Simple and quick donor registration, enabling individuals to join the network and save lives.</p>
                </div>
                <div class="feature-box">
                    <h3>Real-Time Availability</h3>
                    <p>Track available blood types in nearby blood banks and hospitals in real-time.</p>
                </div>
                <div class="feature-box">
                    <h3>Emergency Requests</h3>
                    <p>Handle emergency requests instantly, ensuring quick blood allocation for critical cases.</p>
                </div>
                <div class="feature-box">
                    <h3>Secure Data</h3>
                    <p>All donor and recipient data is securely managed and stored to maintain privacy.</p>
                </div>
                <div class="feature-box">
                    <h3>Advanced Search</h3>
                    <p>Search for donors or blood banks based on location, blood type, and availability.</p>
                </div>
                <div class="feature-box">
                    <h3>Donation Scheduling</h3>
                    <p>Schedule donations conveniently, allowing for better planning and management.</p>
                </div>
            </div>

            <h2>Meet Our Team</h2>
            <div class="team">
                <div class="team-member">
                    <h3>Dhairya Bhatia</h3>
                    <p>Project Lead</p>
                </div>
                <div class="team-member">
                    <h3>Jane Doe</h3>
                    <p>Frontend Developer</p>
                </div>
                <div class="team-member">
                    <h3>John Smith</h3>
                    <p>Backend Developer</p>
                </div>
                <div class="team-member">
                    <h3>Emily White</h3>
                    <p>Database Administrator</p>
                </div>
            </div>
        </div>
    </div>
    <footer>
        © 2024 Blood Buddy | <a href="contact.jsp">Contact Us</a>
    </footer>
</body>
</html>
