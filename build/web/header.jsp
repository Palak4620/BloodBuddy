<%-- 
    Document   : header
    Created on : 2 Jun, 2024, 3:58:47 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css">
  <style>
    .navbar { background-color: #dc2626; 
     position: relative;
    }
    .navbar a:hover { color: #fca5a5; }

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
        
  </style>
    <body>
<!--     <nav>
    <a href="#">Home</a>
    <a href="aboutUs.jsp">About Us</a>
    <a href="#">Contact Us</a>
    <a href="bloodavailability.jsp">Blood Availability</a>
      <a href="campregister.jsp">Camp Register</a>
    <a href="bloodbanklogin.jsp">Blood Bank Login</a>
      </nav> -->

<nav class="navbar text-white shadow-lg fixed w-full z-50">
    <div class="max-w-7xl mx-auto px-4">
      <div class="flex justify-between items-center h-16">
        <div class="flex items-center space-x-2">
          <i class="fas fa-tint fa-2x"></i>
          <span class="text-2xl font-bold">Blood Buddy</span>
        </div>
        <div class="hidden md:flex space-x-8">
          <a href="SearchDonar.jsp" class="flex items-center space-x-1 hover:text-red-200 transition-colors">
            <i class="fas fa-search"></i>
            <span>Blood Availability</span>
          </a>
          <a href="BloodBankSearch.jsp" class="flex items-center space-x-1 hover:text-red-200 transition-colors">
            <i class="fas fa-map-marker-alt"></i>
            <span>Blood Banks</span>
          </a>
          <a href="AddBloodBank.jsp" class="flex items-center space-x-1 hover:text-red-200 transition-colors">
            <i class="fas fa-calendar"></i>
            <span>Add BloodBank</span>
          </a>
          <a href="login.jsp" class="flex items-center space-x-1 hover:text-red-200 transition-colors">
            <i class="fas fa-sign-in-alt"></i>
            <span>Hospital Login</span>
          </a>
          <a href="campregister.jsp" class="flex items-center space-x-1 hover:text-red-200 transition-colors">
            <i class="fas fa-user-plus"></i>
            <span>Register Camp</span>
          </a>
        </div>
        <button class="md:hidden">
          <i class="fas fa-bars text-xl"></i>
        </button>
      </div>
    </div>
  </nav>
    </body>
</html>
