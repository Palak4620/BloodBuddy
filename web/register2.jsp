<%-- 
    Document   : register2
    Created on : 8 May, 2024, 3:46:29 PM
    Author     : hp
--%>
<jsp:useBean class="model.Donar" id="b">
    <jsp:setProperty name="b" property="*"></jsp:setProperty>
</jsp:useBean>

<%@page import="dao.BloodDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    </body>
     <%
    String name=null,email=null,pass=null;
//      name=request.getParameter("name");
//     email= request.getParameter("email");
//     pass=request.getParameter("pass");
     if(name!=null && email!=null && pass!=null)
     {
         BloodDAO bd=new BloodDAO();
         if(bd.rinsertData(b))
         {
          out.print("data inserted");
         }
         else
         {
             out.print("not inserted");
         }
         
     }
    %>
</html>
