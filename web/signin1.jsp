<%@page import="dao.BloodDAO, signinmodel.signin" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registration Result</title>
</head>
<body>
    <jsp:useBean id="s" class="signinmodel.signin">
        <jsp:setProperty name="s" property="*"/>
    </jsp:useBean>

    <%
        BloodDAO bd = new BloodDAO();
        if(bd.signin(s)){
            out.println("Successfully Registered");
        } else {
            out.println("Registration failed. Please try again.");
        }
    %>
</body>
</html>
