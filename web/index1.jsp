<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blood Donation Management System</title>
    <style>
        /* General Styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f7f7f7;
            color: #333;
            line-height: 1.6;
        }

        a {
            text-decoration: none;
        }

        /* Navigation Bar */
        nav {
            background-color: #c0392b;
            padding: 15px 20px;
            text-align: center;
        }

        nav a {
            color: #ecf0f1;
            padding: 12px 25px;
            font-size: 18px;
            margin: 0 15px;
            display: inline-block;
            border-radius: 5px;
        }

        nav a:hover {
            background-color: #e74c3c;
        }

        /* Logo Section */
        .logo {
            text-align: center;
            margin: 20px 0;
        }

        .logo img {
            width: 150px;
        }

        /* Hero Section */
        .hero {
            background: linear-gradient(to bottom, rgba(192, 57, 43, 0.8), rgba(192, 57, 43, 0.8)), url('./Images/hero-bg.jpg') no-repeat center center/cover;
            color: white;
            padding: 80px 20px;
            text-align: center;
        }

        .hero h1 {
            font-size: 50px;
            margin-bottom: 20px;
        }

        .hero p {
            font-size: 22px;
            margin-bottom: 30px;
        }

        .hero a {
            background-color: #e74c3c;
            color: white;
            padding: 15px 40px;
            text-decoration: none;
            font-size: 20px;
            border-radius: 5px;
        }

        .hero a:hover {
            background-color: #c0392b;
        }

        /* Cards Section */
        .cards {
            display: flex;
            justify-content: space-around;
            margin: 40px 20px;
            flex-wrap: wrap;
            gap: 30px;
        }

        .card {
            background-color: #fff;
            padding: 25px;
            width: 250px;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            transition: transform 0.3s ease;
        }

        .card:hover {
            transform: scale(1.05);
        }

        .card img {
            width: 60px;
            margin-bottom: 20px;
        }

        .card h3 {
            font-size: 22px;
            margin-bottom: 15px;
        }

        .card p {
            font-size: 16px;
            color: #555;
        }

        /* Footer Section */
        footer {
            background-color: #c0392b;
            color: #ecf0f1;
            padding: 40px 20px;
            text-align: center;
        }

        footer .footer-column {
            display: inline-block;
            margin: 20px;
            vertical-align: top;
        }

        footer ul {
            list-style-type: none;
            padding: 0;
        }

        footer ul li {
            margin: 10px 0;
        }

        footer ul li a {
            text-decoration: none;
            color: #ecf0f1;
            font-size: 16px;
            transition: color 0.3s;
        }

        footer ul li a:hover {
            color: #e74c3c;
        }

        /* Media Queries for Responsiveness */
        @media (max-width: 768px) {
            nav a {
                font-size: 16px;
                padding: 10px 20px;
            }

            .cards {
                flex-direction: column;
                align-items: center;
            }

            .card {
                width: 80%;
                margin-bottom: 20px;
            }

            .hero h1 {
                font-size: 36px;
            }

            .hero p {
                font-size: 18px;
            }

            footer {
                font-size: 14px;
            }
        }

        @media (max-width: 480px) {
            .logo img {
                width: 120px;
            }

            .hero h1 {
                font-size: 30px;
            }

            .hero p {
                font-size: 16px;
            }

            .card {
                width: 90%;
            }
        }
    </style>
</head>
<body>

<!-- Navigation Bar -->
<nav>
    <a href="#">Home</a>
    <a href="aboutUs.jsp">About Us</a>
    <a href="#">Contact Us</a>
    <a href="bloodavailability.jsp">Blood Availability</a>
    <a href="campregister.jsp">Camp Register</a>
    <a href="bloodbanklogin.jsp">Blood Bank Login</a>
</nav>

<!-- Logo Section -->
<div class="logo">
    <a href="index.jsp">
        <img src="./Images/bb_logo(white).png" alt="Blood Buddy Logo">
    </a>
</div>

<!-- Hero Section -->
<div class="hero">
    <h1>Save a Life, Donate Blood</h1>
    <p>Your blood donation can save someone's life. Join us in making a difference.</p>
    <a href="donate_blood.jsp">Donate Now</a>
</div>

<!-- Cards Section -->
<div class="cards">
    <div class="card">
        <img src="./Images/drop.png" alt="Blood Donation">
        <h3>What We Do?</h3>
        <p>We connect blood donors with recipients in need, facilitating life-saving donations.</p>
    </div>
    <div class="card">
        <img src="./Images/innovation.png" alt="Innovation">
        <h3>Innovative Approach</h3>
        <p>Our system uses technology to ensure that blood donation is efficient and transparent.</p>
    </div>
    <div class="card">
        <img src="./Images/network.png" alt="Blood Network">
        <h3>Extensive Network</h3>
        <p>We have partnered with hospitals and blood banks to maximize donation efforts.</p>
    </div>
</div>

<!-- Footer Section -->
<footer>
    <div class="footer-column">
        <h3>Looking for Blood?</h3>
        <ul>
            <li><a href="bloodavailability.jsp">Check Availability</a></li>
            <li><a href="Bloodbank.jsp">Find Blood Banks</a></li>
        </ul>
    </div>
    <div class="footer-column">
        <h3>Want to Donate?</h3>
        <ul>
            <li><a href="login.jsp">Login</a></li>
            <li><a href="donate_blood.jsp">How to Donate</a></li>
        </ul>
    </div>
    <div class="footer-column">
        <h3>For Blood Banks</h3>
        <ul>
            <li><a href="bloodbanklogin.jsp">Blood Bank Login</a></li>
            <li><a href="AddBloodBank.jsp">Add Your Blood Bank</a></li>
        </ul>
    </div>
    <div class="footer-column">
        <h3>About Us</h3>
        <ul>
            <li><a href="aboutUs.jsp">About Blood Buddy</a></li>
            <li><a href="#">FAQ</a></li>
            <li><a href="#">Contact</a></li>
        </ul>
    </div>
</footer>

</body>
</html>
