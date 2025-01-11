<%@page import="dao.BloodDAO"%>
<%@page import="java.util.*"%>
<%@page import="model.Donar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file='header.jsp' %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blood Stock Availability</title>
        <style>
            .box {
                border: 2px solid;
                height: 100%;
                box-shadow: 0 0 2px white;
                margin: auto;
                width: 1000px;
                background-color: white;
            }
            h1 {
                color: darkred;
            }
            #heading {
                background-color: #c0392b;
                color: white;
                height: 50px;
                padding: 5px;
            }
            .cb {
                padding: 20px;
                margin-left: 90px;
            }
            #button {
                cursor: pointer;
                height: 30px;
                width: 80px;
                color: black;
                margin-left: 90px;
            }
            #button:hover {
                background-color: blue;
                color: white;
            }
            .content1 {
                padding-left: 100px;
                padding-right: 100px;
            }
            #head{
                color: black;
                background-color: #DC143C;
                padding: 900px;
                height: 50px;
                
            }
            #table{
                width: 60px;
                height: 120px;
            }
            #last{
                font-size: 50px;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="content1">
            <h1>Blood Stock Availability</h1>
            <hr>
            <div class="box">
                <div id="heading"><h3>Search Blood Stock</h3></div>
                <div class="cb">
                    <form method="post" action="">
                        Enter City: <input type="text" name="text">
                        <label for="bloodGroup">Blood Group:</label>
                        <select id="bloodGroup" name="bgroup" required>
                            <option value="A+">A+</option>
                            <option value="B+">B+</option>
                            <option value="AB+">AB+</option>
                            <option value="O+">O+</option>
                            <option value="A-">A-</option>
                            <option value="B-">B-</option>
                            <option value="AB-">AB-</option>
                            <option value="O-">O-</option>
                        </select>
                        <input type="submit" id="button">
                    </form>
                </div>
            </div>
        </div>

        <%
            List<Donar> mylist = new ArrayList<Donar>();
            String str1 = request.getParameter("text");
            String str2 = request.getParameter("bgroup");
            if (str1 != null && str2 != null) {
                BloodDAO bd = new BloodDAO();
                mylist = bd.searchByCity(str1, str2);
                if (!mylist.isEmpty()) {
        %>
        <br>
        <br>
    <center>
        <table border="1" id="table">
            <thead>
                <tr id="head">
                    <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>
                    <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>
                    <th>City</th><th>Address</th>
                </tr>
            </thead>
            <tbody>
        <%
                for (Donar B : mylist) {
        %>
                <tr>
                    <td><%= B.getDid() %></td>
                    <td><%= B.getName() %></td>
                    <td><%= B.getFname() %></td>
                    <td><%= B.getMname() %></td>
                    <td><%= B.getPhoneno() %></td>
                    <td><%= B.getEmail() %></td>
                    <td><%= B.getBgroup() %></td>
                    <td><%= B.getGender() %></td>
                    <td><%= B.getCity() %></td>
                    <td><%= B.getAddress() %></td>
                </tr>
        <%
                }
        %>
            </tbody>
        </table>
    </center>
   
        <%
                } else {
                    out.print("Record not found");
                }
            }
        %>
    </body>
</html>
