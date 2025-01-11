<%@page import="java.util.*"%>
<%@page import="dao.bloodbankDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="model.bloodbank" id="b">
    <jsp:setProperty name="b" property="*"></jsp:setProperty>
</jsp:useBean>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <%
//            int did;
//            String name, fname, mname, phoneno, email, bgroup,gender, city, address;
//            Date dob;
          bloodbankDAO bd= new bloodbankDAO();
          if(bd.insertdata(b)){
              out.println("<br><br><font size=5 color= green>Your Record Has Been Inserted</font>");
          }else{
               out.println("Record not Inserted");
          } 
        %>
    </center>
    </body>
</html>
