package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BloodDAO;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <a href=\"AddBloodBank.jsp\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-calendar\"></i>\n");
      out.write("            <span>Add BloodBank</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"login.jsp\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
      out.write("            <i class=\"fas fa-sign-in-alt\"></i>\n");
      out.write("            <span>Hospital Login</span>\n");
      out.write("          </a>\n");
      out.write("          <a href=\"campregister.jsp\" class=\"flex items-center space-x-1 hover:text-red-200 transition-colors\">\n");
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Blood Management Login</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            padding: 0;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background: url('blood4.jpg') no-repeat center center fixed;\n");
      out.write("            background-size: cover;\n");
      out.write("            height: 100vh;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("            padding: 20px;\n");
      out.write("            margin-left: 400px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            justify-content: center;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);\n");
      out.write("            width: 300px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-container h2 {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-group input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-button {\n");
      out.write("            background-color: #d9534f;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 10px 15px;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .login-button:hover {\n");
      out.write("            background-color: #c9302c;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"login-container\">\n");
      out.write("        <h2>Hospital Login</h2>\n");
      out.write("        <form action=\"#\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"username\">Username:</label>\n");
      out.write("                <input type=\"text\" id=\"username\" name=\"username\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"password\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"login-button\">Login</button>\n");
      out.write("        </form>\n");
      out.write("             ");

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
        
      out.write("\n");
      out.write("    </div>\n");
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
