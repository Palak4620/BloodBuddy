package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class campregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/tailwindcss/2.2.19/tailwind.min.css\">\n");
      out.write("  <style>\n");
      out.write("    .navbar { background-color: #dc2626; \n");
      out.write("     position: relative;\n");
      out.write("    }\n");
      out.write("    .navbar a:hover { color: #fca5a5; }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Navigation Bar */\n");
      out.write("        nav {\n");
      out.write("            background-color: #c0392b;\n");
      out.write("            padding: 15px 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a {\n");
      out.write("            color: #ecf0f1;\n");
      out.write("            padding: 12px 25px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            margin: 0 15px;\n");
      out.write("            display: inline-block;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        nav a:hover {\n");
      out.write("            background-color: #e74c3c;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("  </style>\n");
      out.write("    <body>\n");
      out.write("<!--     <nav>\n");
      out.write("    <a href=\"#\">Home</a>\n");
      out.write("    <a href=\"aboutUs.jsp\">About Us</a>\n");
      out.write("    <a href=\"#\">Contact Us</a>\n");
      out.write("    <a href=\"bloodavailability.jsp\">Blood Availability</a>\n");
      out.write("      <a href=\"campregister.jsp\">Camp Register</a>\n");
      out.write("    <a href=\"bloodbanklogin.jsp\">Blood Bank Login</a>\n");
      out.write("      </nav> -->\n");
      out.write("\n");
      out.write("<nav class=\"navbar text-white shadow-lg fixed w-full z-50\">\n");
      out.write("    <div class=\"max-w-7xl mx-auto px-4\">\n");
      out.write("      <div class=\"flex justify-between items-center h-16\">\n");
      out.write("        <div class=\"flex items-center space-x-2\">\n");
      out.write("          <i class=\"fas fa-tint fa-2x\"></i>\n");
      out.write("          <span class=\"text-2xl font-bold\">Blood Buddy</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hidden md:flex space-x-8\">\n");
      out.write("          <a href=\"SearchDonar.jsp\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-search\"></i>\n");
      out.write("            <span>Blood Availability</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"BloodBankSearch.jsp\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Camp Registration</title>\n");
      out.write("        <style>\n");
      out.write("            /* General Styles */\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Header Box Styling */\n");
      out.write("            .header {\n");
      out.write("                box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);\n");
      out.write("                padding: 30px;\n");
      out.write("                width: 60%;\n");
      out.write("                background-color: #fafafa;\n");
      out.write("                margin: 30px auto;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                color: #2c3e50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #c0392b;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                font-size: 28px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Form Layout */\n");
      out.write("            .form-container {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Left and Right Section */\n");
      out.write("            .left, .right {\n");
      out.write("                width: 48%;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .left input, .right input {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .left input:focus, .right input:focus {\n");
      out.write("                border-color: #c0392b;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-container {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-container input {\n");
      out.write("                background-color: #c0392b;\n");
      out.write("                color: white;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 50%;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .submit-container input:hover {\n");
      out.write("                background-color: #e74c3c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Responsive Design */\n");
      out.write("            @media (max-width: 768px) {\n");
      out.write("                .form-container {\n");
      out.write("                    flex-direction: column;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .left, .right {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"insertCampData.jsp\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <h1>Camp Registration</h1>\n");
      out.write("                <div class=\"form-container\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <label for=\"Organizationname\">Organization Name:</label>\n");
      out.write("                        <input type=\"text\" name=\"Organization_name\" id=\"Organizationname\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"Organizername\">Organizer Name:</label>\n");
      out.write("                        <input type=\"text\" name=\"Organizer_name\" id=\"Organizername\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"phnno\">Organizer Mobile No:</label>\n");
      out.write("                        <input type=\"text\" name=\"Organizer_no\" id=\"phnno\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"email\">Organizer Email Id:</label>\n");
      out.write("                        <input type=\"text\" name=\"Organizer_Email_Id\" id=\"email\" required><br>\n");
      out.write("                                             \n");
      out.write("                        <label for=\"Campaddress\">Camp Address:</label>\n");
      out.write("                        <input type=\"text\" name=\"Camp_Address\" id=\"Campaddress\" required><br>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <label for=\"Campname\">Camp Name:</label>\n");
      out.write("                        <input type=\"text\" name=\"Camp_Name\" id=\"Campname\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"Cityname\">City Name:</label>\n");
      out.write("                        <input type=\"text\" name=\"City_name\" id=\"Cityname\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"Campproposedate\">Camp Proposed Date:</label>\n");
      out.write("                        <input type=\"text\" name=\"Camp_date\" id=\"Campproposedate\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"estimatedparticipants\">Estimated Participants:</label>\n");
      out.write("                        <input type=\"number\" name=\"Estimated_participants\" id=\"estimatedparticipants\" required><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"state\">State:</label>\n");
      out.write("                        <input type=\"text\" name=\"State\" id=\"state\" required><br>\n");
      out.write("                                          \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"submit-container\">\n");
      out.write("                    <input type=\"submit\" value=\"Register Camp\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
