<%-- 
    Document   : delete
    Created on : Aug 26, 2023, 4:36:43 PM
    Author     : Asus
--%>

<%@page import="dao.BloodDAO"%>
<%@page import="model.Donar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           int did;
         HttpSession s2=request.getSession();
         did= Integer.parseInt(s2.getAttribute("did").toString());
         
         BloodDAO bd= new BloodDAO();
         if(bd.deleteStudent(did))
             out.println("Record deleted");
         else
             out.println("Record not deleted");
       %>
    </body>
</html>
