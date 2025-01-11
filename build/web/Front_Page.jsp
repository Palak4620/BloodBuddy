<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Blood Buddy</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css">
  <style>
    .navbar { background-color: #dc2626; }
    .navbar a:hover { color: #fca5a5; }
    .hero-overlay { background-color: rgba(185, 28, 28, 0.7); }
  </style>
</head>
<body class="bg-gray-100">
  <!-- Navbar -->
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
          <a href="SearchCamp.jsp" class="flex items-center space-x-1 hover:text-red-200 transition-colors">
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

  <!-- Hero Section -->
  <div class="relative h-screen">
    <div class="absolute inset-0">
      <img src="https://images.unsplash.com/photo-1615461066841-6116e61058f4?auto=format&fit=crop&q=80" alt="Blood Donation" class="w-full h-full object-cover">
      <div class="absolute inset-0 hero-overlay"></div>
    </div>
    <div class="relative max-w-7xl mx-auto px-4 h-full flex items-center">
      <div class="text-white max-w-2xl">
        <h1 class="text-5xl font-bold mb-6">Donate Blood, Save Lives</h1>
        <p class="text-xl mb-8">Your donation can give someone another chance at life. Join our mission to ensure blood availability for all who need it.</p>
        <button class="bg-white text-red-600 px-8 py-3 rounded-full font-semibold text-lg hover:bg-red-100 transition-colors flex items-center space-x-2">
          <i class="fas fa-heart"></i>
          <span>Donate Now</span>
        </button>
      </div>
    </div>
  </div>

  <!-- Features Section -->
  <div class="py-20 bg-white">
    <div class="max-w-7xl mx-auto px-4">
      <div class="text-center mb-16">
        <h2 class="text-3xl font-bold text-gray-900 mb-4">Our Services</h2>
        <p class="text-gray-600 max-w-2xl mx-auto">We provide comprehensive blood donation services to help connect donors with those in need.</p>
      </div>
      <div class="grid md:grid-cols-2 lg:grid-cols-4 gap-8">
        <div class="p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow">
          <div class="text-red-600 mb-4">
            <i class="fas fa-search fa-2x"></i>
          </div>
          <h3 class="text-xl font-semibold mb-2">Blood Availability Search</h3>
          <p class="text-gray-600">Find blood availability in real-time across multiple blood banks in your area.</p>
        </div>
        <div class="p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow">
          <div class="text-red-600 mb-4">
            <i class="fas fa-map-marker-alt fa-2x"></i>
          </div>
          <h3 class="text-xl font-semibold mb-2">Blood Bank Directory</h3>
          <p class="text-gray-600">Access a comprehensive directory of verified blood banks and donation centers.</p>
        </div>
        <div class="p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow">
          <div class="text-red-600 mb-4">
            <i class="fas fa-calendar fa-2x"></i>
          </div>
          <h3 class="text-xl font-semibold mb-2">Donation Camps</h3>
          <p class="text-gray-600">Find upcoming blood donation camps and events in your locality.</p>
        </div>
        <div class="p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow">
          <div class="text-red-600 mb-4">
            <i class="fas fa-users fa-2x"></i>
          </div>
          <h3 class="text-xl font-semibold mb-2">Join Our Community</h3>
          <p class="text-gray-600">Register as a donor or organize a blood donation camp in your area.</p>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
