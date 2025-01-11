package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddDonar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<title>Blood Donor Form</title>\n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background-size: crop;\n");
      out.write("    background-position: center;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("    max-width: 900px;\n");
      out.write("    margin: auto;\n");
      out.write("    background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);\n");
      out.write("  }\n");
      out.write("  .container h1 {\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("  }\n");
      out.write("  .form-group {\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("  }\n");
      out.write("  label {\n");
      out.write("    font-weight: bold;\n");
      out.write("  }\n");
      out.write("  input[type=\"text\"],\n");
      out.write("  input[type=\"email\"],\n");
      out.write("  select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 8px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  }\n");
      out.write("  select {\n");
      out.write("    height: 38px;\n");
      out.write("  }\n");
      out.write("  input[type=\"radio\"] {\n");
      out.write("    margin-right: 5px;\n");
      out.write("  }\n");
      out.write("  .btn-submit {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #e74c3c;\n");
      out.write("    color: white;\n");
      out.write("    border: none;\n");
      out.write("    padding: 10px;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("  .btn-submit:hover {\n");
      out.write("    background-color: #c0392b;\n");
      out.write("  }\n");
      out.write("  .ftr{\n");
      out.write("    background-color: rgba(0,0,0,0.4);\n");
      out.write("    height: 200px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa {\n");
      out.write("  padding: 20px;\n");
      out.write("  font-size: 20px;\n");
      out.write("  width: 30px;\n");
      out.write("  text-align: center;\n");
      out.write("  text-decoration: none;\n");
      out.write("  margin: 5px 2px;\n");
      out.write("}\n");
      out.write(".fa:hover {\n");
      out.write("    opacity: 0.7;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-facebook {\n");
      out.write("  background: #3B5998;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-twitter {\n");
      out.write("  background: #55ACEE;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".fa-youtube {\n");
      out.write("  background: #bb0000;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".fa-instagram {\n");
      out.write("  background: #125688;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".content{\n");
      out.write("        background-image: url('./Images/img09.jpg');\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"content\">\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h1>Blood Donor Form</h1>\n");
      out.write("  <form method=\"post\" action=\"insertData.jsp\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"donorId\">Donor ID:</label>\n");
      out.write("      <input type=\"text\" id=\"donorId\" name=\"did\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"fullName\">Full Name:</label>\n");
      out.write("      <input type=\"text\" id=\"fullName\" name=\"name\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"fatherName\">Father Name:</label>\n");
      out.write("      <input type=\"text\" id=\"fatherName\" name=\"fname\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"motherName\">Mother Name:</label>\n");
      out.write("      <input type=\"text\" id=\"motherName\" name=\"mname\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"phone\">Phone No.:</label>\n");
      out.write("      <input type=\"tel\" id=\"phone\" name=\"phoneno\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"email\">Email ID:</label>\n");
      out.write("      <input type=\"email\" id=\"email\" name=\"email\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"bloodGroup\">Blood Group:</label>\n");
      out.write("      <select id=\"bloodGroup\" name=\"bgroup\" required>\n");
      out.write("        <option value=\"A+\">A+</option>\n");
      out.write("        <option value=\"B+\">B+</option>\n");
      out.write("        <option value=\"AB+\">AB+</option>\n");
      out.write("        <option value=\"O+\">O+</option>\n");
      out.write("        <option value=\"A-\">A-</option>\n");
      out.write("        <option value=\"B-\">B-</option>\n");
      out.write("        <option value=\"AB-\">AB-</option>\n");
      out.write("        <option value=\"O-\">O-</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label>Gender:</label>\n");
      out.write("      <input type=\"radio\" id=\"male\" name=\"gender\" value=\"male\" required>\n");
      out.write("      <label for=\"male\">Male</label>\n");
      out.write("      <input type=\"radio\" id=\"female\" name=\"gender\" value=\"female\">\n");
      out.write("      <label for=\"female\">Female</label>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"city\">City:</label>\n");
      out.write("      <input type=\"text\" id=\"city\" name=\"city\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("      <label for=\"address\">Address:</label>\n");
      out.write("      <input type=\"text\" id=\"address\" name=\"address\" required>\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" class=\"btn-submit\">Register</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("        </div>   \n");
      out.write(" \n");
      out.write("    <footer class=\"ftr\">\n");
      out.write("            <center><h1>JOIN OUR CAUSE</h1></center>\n");
      out.write("            <p>Donating blood or platelets can be intimidating and even scary. Time to put those \n");
      out.write("                hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>\n");
      out.write("            <center>\n");
      out.write("                <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("                <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("                <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("            </center>\n");
      out.write("        </footer>\n");
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
