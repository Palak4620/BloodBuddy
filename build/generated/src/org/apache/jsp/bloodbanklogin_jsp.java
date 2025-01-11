package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bloodbanklogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <style>\n");
      out.write("          body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f7f7f7;\n");
      out.write("            color: #333;\n");
      out.write("            line-height: 1.6;\n");
      out.write("        }\n");
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
      out.write("  </style>\n");
      out.write("    <body>\n");
      out.write("     <nav>\n");
      out.write("    <a href=\"#\">Home</a>\n");
      out.write("    <a href=\"aboutUs.jsp\">About Us</a>\n");
      out.write("    <a href=\"#\">Contact Us</a>\n");
      out.write("    <a href=\"bloodavailability.jsp\">Blood Availability</a>\n");
      out.write("      <a href=\"campregister.jsp\">Camp Register</a>\n");
      out.write("    <a href=\"bloodbanklogin.jsp\">Blood Bank Login</a>\n");
      out.write("      </nav> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Blood Bank Login</title>\n");
      out.write("        <style>\n");
      out.write("            /* General Styles */\n");
      out.write("            body {\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                background-color: #f7f7f7;\n");
      out.write("                color: #333;\n");
      out.write("                line-height: 1.6;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Form Box */\n");
      out.write("            .box {\n");
      out.write("                box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.2);\n");
      out.write("                padding: 30px;\n");
      out.write("                height: 400px;\n");
      out.write("                width: 35%;\n");
      out.write("                background-color: #fafafa;\n");
      out.write("                margin: 60px auto;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                border: 1px solid #dcdcdc;\n");
      out.write("                color: #2c3e50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #c0392b;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header {\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: #7f8c8d;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"], input[type=\"password\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 12px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"] {\n");
      out.write("                background-color: #c0392b;\n");
      out.write("                color: white;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"submit\"]:hover {\n");
      out.write("                background-color: #e74c3c;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-link {\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-link a {\n");
      out.write("                color: #c0392b;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .register-link a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <h1>Blood Bank Login</h1>\n");
      out.write("            <form method=\"post\" action=\"\">\n");
      out.write("                <div class=\"header\">\n");
      out.write("                    <label for=\"username\">Username:</label>\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"username\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    <label for=\"password\">Password:</label>\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" required>\n");
      out.write("                    <br><br>\n");
      out.write("                    <input type=\"submit\" value=\"Login\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class=\"register-link\">\n");
      out.write("                <p>Don't have an account? <a href=\"signin.jsp\">Register here</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
