package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Front_005fPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>Blood Buddy</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css\">\n");
      out.write("  <style>\n");
      out.write("    .navbar { background-color: #dc2626; }\n");
      out.write("    .navbar a:hover { color: #fca5a5; }\n");
      out.write("    .hero-overlay { background-color: rgba(185, 28, 28, 0.7); }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-gray-100\">\n");
      out.write("  <!-- Navbar -->\n");
      out.write("  <nav class=\"navbar text-white shadow-lg fixed w-full z-50\">\n");
      out.write("    <div class=\"max-w-7xl mx-auto px-4\">\n");
      out.write("      <div class=\"flex justify-between items-center h-16\">\n");
      out.write("        <div class=\"flex items-center space-x-2\">\n");
      out.write("          <i class=\"fas fa-tint fa-2x\"></i>\n");
      out.write("          <span class=\"text-2xl font-bold\">Blood Buddy</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hidden md:flex space-x-8\">\n");
      out.write("          <a href=\"#\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-search\"></i>\n");
      out.write("            <span>Blood Availability</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"#\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("            <span>Blood Banks</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"#\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-calendar\"></i>\n");
      out.write("            <span>Donation Camps</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"#\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-sign-in-alt\"></i>\n");
      out.write("            <span>Donor Login</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"#\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-user-plus\"></i>\n");
      out.write("            <span>Register Camp</span>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"md:hidden\">\n");
      out.write("          <i class=\"fas fa-bars text-xl\"></i>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("  <!-- Hero Section -->\n");
      out.write("  <div class=\"relative h-screen\">\n");
      out.write("    <div class=\"absolute inset-0\">\n");
      out.write("      <img src=\"https://images.unsplash.com/photo-1615461066841-6116e61058f4?auto=format&fit=crop&q=80\" alt=\"Blood Donation\" class=\"w-full h-full object-cover\">\n");
      out.write("      <div class=\"absolute inset-0 hero-overlay\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"relative max-w-7xl mx-auto px-4 h-full flex items-center\">\n");
      out.write("      <div class=\"text-white max-w-2xl\">\n");
      out.write("        <h1 class=\"text-5xl font-bold mb-6\">Donate Blood, Save Lives</h1>\n");
      out.write("        <p class=\"text-xl mb-8\">Your donation can give someone another chance at life. Join our mission to ensure blood availability for all who need it.</p>\n");
      out.write("        <button class=\"bg-white text-red-600 px-8 py-3 rounded-full font-semibold text-lg hover:bg-red-100 transition-colors flex items-center space-x-2\">\n");
      out.write("          <i class=\"fas fa-heart\"></i>\n");
      out.write("          <span>Donate Now</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Features Section -->\n");
      out.write("  <div class=\"py-20 bg-white\">\n");
      out.write("    <div class=\"max-w-7xl mx-auto px-4\">\n");
      out.write("      <div class=\"text-center mb-16\">\n");
      out.write("        <h2 class=\"text-3xl font-bold text-gray-900 mb-4\">Our Services</h2>\n");
      out.write("        <p class=\"text-gray-600 max-w-2xl mx-auto\">We provide comprehensive blood donation services to help connect donors with those in need.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"grid md:grid-cols-2 lg:grid-cols-4 gap-8\">\n");
      out.write("        <div class=\"p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow\">\n");
      out.write("          <div class=\"text-red-600 mb-4\">\n");
      out.write("            <i class=\"fas fa-search fa-2x\"></i>\n");
      out.write("          </div>\n");
      out.write("          <h3 class=\"text-xl font-semibold mb-2\">Blood Availability Search</h3>\n");
      out.write("          <p class=\"text-gray-600\">Find blood availability in real-time across multiple blood banks in your area.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow\">\n");
      out.write("          <div class=\"text-red-600 mb-4\">\n");
      out.write("            <i class=\"fas fa-map-marker-alt fa-2x\"></i>\n");
      out.write("          </div>\n");
      out.write("          <h3 class=\"text-xl font-semibold mb-2\">Blood Bank Directory</h3>\n");
      out.write("          <p class=\"text-gray-600\">Access a comprehensive directory of verified blood banks and donation centers.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow\">\n");
      out.write("          <div class=\"text-red-600 mb-4\">\n");
      out.write("            <i class=\"fas fa-calendar fa-2x\"></i>\n");
      out.write("          </div>\n");
      out.write("          <h3 class=\"text-xl font-semibold mb-2\">Donation Camps</h3>\n");
      out.write("          <p class=\"text-gray-600\">Find upcoming blood donation camps and events in your locality.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"p-6 bg-white rounded-xl shadow-md hover:shadow-lg transition-shadow\">\n");
      out.write("          <div class=\"text-red-600 mb-4\">\n");
      out.write("            <i class=\"fas fa-users fa-2x\"></i>\n");
      out.write("          </div>\n");
      out.write("          <h3 class=\"text-xl font-semibold mb-2\">Join Our Community</h3>\n");
      out.write("          <p class=\"text-gray-600\">Register as a donor or organize a blood donation camp in your area.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
