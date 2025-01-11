<%@include file='header.jsp' %>
<%@page import="dao.bloodbankDAO"%>
<%@page import="model.bloodbank"%>
<%@page import="java.util.*"%>
<%@page import="model.Donar"%>
<%@page import="dao.BloodDAO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Nearest Blood Bank</title>
        <style>
            .box {
                border: 2px solid;
                height: 100%;
                box-shadow: 0 0 2px white;
                margin: auto;
                width: 80vw;
                background-color: white;
            }
            
            #heading {
                background-color: #DC143C;
                color: black;
                height: 30px;    
                margin-top: -20px;
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
                margin-top: 30px;
            }
            #head{
                color: black;
                background-color: #DC143C;
                padding: 900px;
                height: 50px;
                width: 200px;

            }
            #table{
                width: 90 vw;
                height: 120px;
                text-align: center;
            }
            #last{
                font-size: 50px;
                text-align: center;
            }


            .ftr{
                background-color: rgba(0,0,0,0.4);
                height: 200px;
                margin-top:  400px;
            }

            .fa {
                padding: 20px;
                font-size: 40px;
                width: 30px;
                text-align: center;
                text-decoration: none;
                margin: 5px 2px;
            }
            .fa:hover {
                opacity: 0.7;
            }

            .fa-facebook {
                background: #3B5998;
                color: white;
            }

            .fa-twitter {
                background: #55ACEE;
                color: white;
            }


            .fa-youtube {
                background: #bb0000;
                color: white;
            }

            .fa-instagram {
                background: #125688;
                color: white;
            }
            
            .cont{
                    font-family: "NTR", sans-serif; 
            }
            
            input{
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <div class="cont">
        <div class="content1">
            <h1 style="color:darkred">Nearest Blood Bank</h1>
            <hr><br><br>
            <div class="box">
                <div id="heading"><h3 style="font-weight: 600">Search Blood Stock</h3></div>
                <div class="cb">
                    <form method="post" action="BloodBankSearch.jsp">
                        Enter City: <input type="text" name="city">
                        <input type="submit" id="button">
                    </form>
                </div>
            </div>
        </div>

        <%
            List<bloodbank> mylist = new ArrayList<bloodbank>();
//                  Donar B=new Donar();
            String str1 = null, str2 = null;
            str1 = request.getParameter("city");
            if (str1 != null) {
                bloodbankDAO bd = new bloodbankDAO();
                mylist = bd.searchByCity(str1);
                if (!mylist.isEmpty()) {
        %>
        <br>
        <br>
    <center>
        <table border="2" id="table">
            <thead>
                <tr id="head" >
                    <th> License No. </th><th>Blood Bank Name</th><th>Hospital Name</th><th>Category</th>
                    <th>Contact Person </th><th>Contact No.</th><th>Email</th><th> Help Line No.</th>
                    <th>State</th><th>City</th><th>Address</th>
                </tr>
            </thead>
            <tbody>

                <%
                    for (bloodbank B : mylist) {
                %>

                <tr>
                    <td><%= B.getLicno()%></td>
                    <td><%= B.getBname()%></td>
                    <td><%= B.getHname()%></td>
                    <td><%= B.getCategory() %></td>
                    <td><%= B.getContact_person()%></td>
                    <td><%= B.getContact_no()%></td>
                    <td><%= B.getEmail()%></td>
                    <td><%= B.getHelplineno()%></td>
                    <td><%= B.getState()%></td>
                    <td><%= B.getCity()%></td>
                    <td><%= B.getPass()%></td>
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
        <footer class="ftr">
        <center><h1>JOIN OUR CAUSE</h1></center>
        <p>Donating blood or platelets can be intimidating and even scary. Time to put those 
            hesitations and fears aside. Learn from Blood Buddy and platelet donors how simple and easy it is to roll up a sleeve and help save lives.</p>
        <center>
            <a href="#" class="fa fa-facebook"></a>
            <a href="#" class="fa fa-twitter"></a>
            <a href="#" class="fa fa-youtube"></a>
        </center>
    </footer>
        </div>
</body>
</html>