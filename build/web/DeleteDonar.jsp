<%@include file='header.jsp' %>
<%@page import="model.Donar"%>
<%@page import="dao.BloodDAO"%>
<%! Donar B=new Donar();
 int did;
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Delete Blood Donor</title>
<style>
  body {
     margin: 0;
    padding: 0;
    background-image: url('blood3.jpg');
    background-size: cover;
    background-position: center;
    font-family: Arial, sans-serif;
  }
  .container {
    max-width: 400px;
    margin: auto;
    background-color: rgba(255, 255, 255, 0.8);
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
  }
  .container h1 {
    text-align: center;
    margin-bottom: 20px;
  }

  table {
    width: 100%;
    border-collapse: collapse;
    margin-bottom: 15px;
  }

  th, td {
    border: 1px solid #ccc;
    padding: 8px;
    text-align: left;
  }

  th {
    background-color: #f2f2f2;
  }

  input[type="text"], input[type="email"], input[type="tel"], input[type="date"], select {
    width: 100%;
    padding: 10px;
    margin-bottom: 15px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
  }

  label {
    font-weight: bold;
  }

  .submit-btn {
    background-color: #4CAF50;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
  }

  .submit-btn:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>
<div class="container">
  <h2>Delete Blood Donor</h2>
  <form action="DeleteDonar.jsp" method="post">
    <label for="donorId">Enter Donor ID:</label>
    <input type="text" id="donorId" name="did" required>
    <td><input type="submit" value="Delete"></td>
      </form>
</div>
           <%
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
        %> 
        <br><br><br><br><br><br>
                <form method="post" action="delete.jsp"> 
       <table border="1">
            <tr>
                <th>Donar ID</th><th>Name</th><th>Father Name</th><th>Mother Name</th>
                <th>Phone no.</th><th>Email ID</th><th>Blood Group</th><th>Gender</th>
                <th>City</th> <th>Address</th>
            </tr>
            <tr>
                <td><%= B.getDid() %></td>
                <td><%= B.getName()%></td>
                <td><%= B.getFname()%></td>
                <td><%= B.getMname()%></td>
                <td><%= B.getPhoneno()%></td>
                <td><%= B.getEmail()%></td>
                <td><%= B.getBgroup()%></td>
                <td><%= B.getGender()%></td>
                <td><%= B.getCity()%></td>
                <td><%= B.getAddress()%></td>
                <td><input type="submit" value="Delete"></td>
            </tr> 
        </table> 
        </form>
                       <%
               }
               else
                   out.println("Record not found");
           }
                %>
</body>
</html>
