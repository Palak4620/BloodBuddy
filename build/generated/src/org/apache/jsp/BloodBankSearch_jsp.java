package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.bloodbankDAO;
import model.bloodbank;
import java.util.*;
import model.Donar;
import dao.BloodDAO;

public final class BloodBankSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <title>Nearest Blood Bank</title>\n");
      out.write("        <style>\n");
      out.write("            .box {\n");
      out.write("                border: 2px solid;\n");
      out.write("                height: 100%;\n");
      out.write("                box-shadow: 0 0 2px white;\n");
      out.write("                margin: auto;\n");
      out.write("                width: 80vw;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #heading {\n");
      out.write("                background-color: #DC143C;\n");
      out.write("                color: black;\n");
      out.write("                height: 30px;    \n");
      out.write("                margin-top: -20px;\n");
      out.write("            }\n");
      out.write("            .cb {\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-left: 90px;\n");
      out.write("            }\n");
      out.write("            #button {\n");
      out.write("                cursor: pointer;\n");
      out.write("                height: 30px;\n");
      out.write("                width: 80px;\n");
      out.write("                color: black;\n");
      out.write("                margin-left: 90px;\n");
      out.write("            }\n");
      out.write("            #button:hover {\n");
      out.write("                background-color: blue;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .content1 {\n");
      out.write("                padding-left: 100px;\n");
      out.write("                padding-right: 100px;\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("            #head{\n");
      out.write("                color: black;\n");
      out.write("                background-color: #DC143C;\n");
      out.write("                padding: 900px;\n");
      out.write("                height: 50px;\n");
      out.write("                width: 200px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #table{\n");
      out.write("                width: 90 vw;\n");
      out.write("                height: 120px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            #last{\n");
      out.write("                font-size: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .ftr{\n");
      out.write("                background-color: rgba(0,0,0,0.4);\n");
      out.write("                height: 200px;\n");
      out.write("                margin-top:  400px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa {\n");
      out.write("                padding: 20px;\n");
      out.write("                font-size: 40px;\n");
      out.write("                width: 30px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 5px 2px;\n");
      out.write("            }\n");
      out.write("            .fa:hover {\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa-facebook {\n");
      out.write("                background: #3B5998;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa-twitter {\n");
      out.write("                background: #55ACEE;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .fa-youtube {\n");
      out.write("                background: #bb0000;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .fa-instagram {\n");
      out.write("                background: #125688;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .cont{\n");
      out.write("                    font-family: \"NTR\", sans-serif; \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            input{\n");
      out.write("                border: 1px solid black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"cont\">\n");
      out.write("        <div class=\"content1\">\n");
      out.write("            <h1 style=\"color:darkred\">Nearest Blood Bank</h1>\n");
      out.write("            <hr><br><br>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div id=\"heading\"><h3 style=\"font-weight: 600\">Search Blood Stock</h3></div>\n");
      out.write("                <div class=\"cb\">\n");
      out.write("                    <form method=\"post\" action=\"BloodBankSearch.jsp\">\n");
      out.write("                        Enter City: <input type=\"text\" name=\"city\">\n");
      out.write("                        <input type=\"submit\" id=\"button\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            List<bloodbank> mylist = new ArrayList<bloodbank>();
//                  Donar B=new Donar();
            String str1 = null, str2 = null;
            str1 = request.getParameter("city");
            if (str1 != null) {
                bloodbankDAO bd = new bloodbankDAO();
                mylist = bd.searchByCity(str1);
                if (!mylist.isEmpty()) {
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    <center>\n");
      out.write("        <table border=\"1\" id=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr id=\"head\" >\n");
      out.write("                    <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>\n");
      out.write("                    <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>\n");
      out.write("                    <th>City</th><th>Address</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("\n");
      out.write("                ");

                    for (bloodbank B : mylist) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( B.getLicno());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getBname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getHname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getCategory() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getContact_person());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getContact_no());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getEmail());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getHelplineno());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getState());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getCity());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( B.getPass());
      out.write("</td>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    ");

            } else {
                out.print("Record not found");
            }
        }
    
      out.write("\n");
      out.write("        <footer class=\"ftr\">\n");
      out.write("        <center><h1>JOIN OUR CAUSE</h1></center>\n");
      out.write("        <p>Donating blood or platelets can be intimidating and even scary. Time to put those \n");
      out.write("            hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>\n");
      out.write("        <center>\n");
      out.write("            <a href=\"#\" class=\"fa fa-facebook\"></a>\n");
      out.write("            <a href=\"#\" class=\"fa fa-twitter\"></a>\n");
      out.write("            <a href=\"#\" class=\"fa fa-youtube\"></a>\n");
      out.write("        </center>\n");
      out.write("    </footer>\n");
      out.write("        </div>\n");
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
