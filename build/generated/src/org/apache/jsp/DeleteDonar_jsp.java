package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Donar;
import dao.BloodDAO;

public final class DeleteDonar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Donar B=new Donar();
 int did;

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Delete Blood Donor</title>\n");
      out.write("<style>\n");
      out.write("  body {\n");
      out.write("     margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    background-image: url('blood3.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("    font-family: Arial, sans-serif;\n");
      out.write("  }\n");
      out.write("  .container {\n");
      out.write("    max-width: 400px;\n");
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
      out.write("\n");
      out.write("  table {\n");
      out.write("    width: 100%;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  th, td {\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    padding: 8px;\n");
      out.write("    text-align: left;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  th {\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  input[type=\"text\"], input[type=\"email\"], input[type=\"tel\"], input[type=\"date\"], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 10px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  label {\n");
      out.write("    font-weight: bold;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .submit-btn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  .submit-btn:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>Delete Blood Donor</h2>\n");
      out.write("  <form action=\"DeleteDonar.jsp\" method=\"post\">\n");
      out.write("    <label for=\"donorId\">Enter Donor ID:</label>\n");
      out.write("    <input type=\"text\" id=\"donorId\" name=\"did\" required>\n");
      out.write("    <td><input type=\"submit\" value=\"Delete\"></td>\n");
      out.write("      </form>\n");
      out.write("</div>\n");
      out.write("           ");

          String str=null;
          str=request.getParameter("did");
          HttpSession s1=request.getSession(true);
          if(str!=null)
          {
             did=Integer.parseInt(str);
             BloodDAO sd=new BloodDAO();
             
             B=sd.searchByID(did);
             
             if(B!=null)
             {
                    s1.setAttribute("did", B.getDid());
        
      out.write(" \n");
      out.write("        <br><br><br><br><br><br>\n");
      out.write("                <form method=\"post\" action=\"delete.jsp\"> \n");
      out.write("       <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>\n");
      out.write("                <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>\n");
      out.write("                <th>City</th> <th>Address</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( B.getDid() );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getFname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getMname());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getPhoneno());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getBgroup());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getGender());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getCity());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( B.getAddress());
      out.write("</td>\n");
      out.write("                <td><input type=\"submit\" value=\"Delete\"></td>\n");
      out.write("            </tr> \n");
      out.write("        </table> \n");
      out.write("        </form>\n");
      out.write("                       ");

               }
               else
                   out.println("Record not found");
           }
                
      out.write("\n");
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
