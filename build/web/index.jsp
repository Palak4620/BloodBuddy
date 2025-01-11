<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Blood Donation</title>
        <style>
            nav a{
                text-decoration: none;
                color: black;
                margin: 30px;

            }
            nav{
                /*                background-color: lightgoldenrodyellow;*/
                color: black;
                padding: 40px;
                float: right;
                font-size:25px;
                padding-top: 40px;


            }
            .logo{
                display: inline;
                height: 20px;
                width: 40px;
            }
            .content{
                background-color: lightcoral;
            }
            .dropdown {
                display: inline-block;
                position: relative;
            }

            .dropdown-options {
                display: none;
                position: absolute;
                overflow: auto;
                background-color: #f9f9f9;
                box-shadow: 15px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-options a {
                padding: 5px 2px;
                text-decoration: none;
                display: block;
            }

            .dropdown:hover .dropdown-options {
                display: block;
                font-size: 20px;
            }
            
            .dropdown:hover .dropdown-options a:hover{
                color: #C23314;
                animation: slide;
            }
            
            #abt{
                font-style: Brush Script MT;
            }
            #c1{
                transition: 2s;
                box-shadow: 0 0 15px rgba(0,0,0,0.2);
                border-radius: 5px;
                width: 25%;
                display: inline-block;
                margin: 2%;
            }
            #c1:hover{
                transform: scale(1.05,1.05);
/*                transform: rotate(5deg);*/
/*                transform: translate(10px,10px);*/
/*                  transform: skew(250deg);*/
            }
            .image img {
           width: 50%;
           }

           h3 {
         font-family: "Alegreya Sans SC", sans-serif;
          }
          #c1 p{
              padding: 3px;
  text-align: center;
  padding-top: 10px;
  border-radius: 2.8rem;
  margin: 10px;
  font-family: "NTR", sans-serif;
  font-size: 1.2rem;
          }
          .img{
              float: right;
              width: 40%;
  height: 100%;
          }
          li{
              font-weight: bold;
          }
          p{
              margin-left: 10px;
            
          }
          .f{
              width: 100%;
              background-color: black;
              color: white;
              height: 10%;
            
              
          }
          #f1{
           display: inline-block;
           margin: 10px;
             margin-left:150px;
             margin-top:-30px;
          }
          .fimg img{
              margin-top: -90px;
              height: 300px;
          }
          .f {
    width: 100%;
    background-color: black;
    color: white;
    padding: 40px;
    box-sizing: border-box;
}

.footer-column {
    width: 23%;
    display: inline-block;
    vertical-align: top;
    margin-right: 2%;
}

.footer-column h3 {
    margin-bottom: 15px;
    font-size: 1.2rem;
}

.footer-column ul {
    list-style-type: none;
    padding: 0;
}

.footer-column ul li {
    margin-bottom: 10px;
}

.footer-column ul li a {
    text-decoration: none;
    color: white;
    font-size: 1rem;
    transition: color 0.3s;
}

.footer-column ul li a:hover {
    color: #C23314;
}

        </style>
    </head>
    <body>


        <header class="main-header">
            <div class="content">

                <div class="logo">
                    <a href="FrontPage.jsp" >
                        <img src="./Images/bb_logo(white).png" style="height:110px"></a>
                </div>
                <nav class="menu">
                    <a href="#">About Us</a>
                    <div class="dropdown">
                        <a href="#">Looking For Blood</a>
                        <div class="dropdown-options">
                            <a href="bloodavailability.jsp">Blood Availability</a><hr>
                            <a href="Bloodbank.jsp">Blood Bank Directory</a>
                        </div>
                    </div>
                    <div class="dropdown">
                    <a href="#">Want To Donate Blood</a>
                    <div class="dropdown-options">
                            <a href="login.jsp">Donar Login</a><hr>
                            <a href="#">Blood Donation Camps</a><hr>
                            <a href="#">About Blood Donation</a><hr>
                            <a href="#">Register Donation Camp</a>
                    </div>
                    </div>
                    <div class="dropdown">
                    <a href="bloodbanklogin.jsp">Blood Bank Login</a>
                    <div class="dropdown-options">
                        <a href="bloodbanklogin.jsp">Bloodbank Login</a><hr>
                        <a href="AddBloodBank.jsp">Add Your Bloodbank</a>  
                   
                </nav>
            </div>
            <div>
                <img src="./Images/blood.jpg" class="img">
            </div>
                   
                    <center>
                        
                    <h1>How Blood Type Is Determined And Why You Need To Know</h1>
                    <p>Blood types are determined by the presence or absence of certain antigens ? substances that can trigger an immune response if they are foreign to the body.  Since some antigens can trigger a patient's immune system to attack the transfused blood, safe blood transfusions depend on careful blood typing and cross-matching. Do you know what blood type is safe for you if you need a transfusion?</p>
                    
                    <p>There are four major blood groups determined by the presence or absence of two antigens, A and B, on the surface of red blood cells. In addition to the A and B antigens, there is a protein called the Rh factor, which can be either present (+) or absent (?), creating the 8 most common blood types (A+, A-,  B+, B-,  O+, O-,  AB+, AB-).</p>
                    <h2> Blood Types and Transfusion</h2>
                    <p>There are very specific ways in which blood types must be matched for a safe transfusion. The right blood transfusion can mean the difference between life and death. Use the interactive graphic below to learn more about matching blood types for transfusions.</p>
                    <p>Also, Rh-negative blood is given to Rh-negative patients, and Rh-positive or Rh-negative blood may be given to Rh-positive patients. The rules for plasma are the reverse. </p>
                     </center>
                    <ul>
                        <li>The universal red cell donor has Type O negative blood.</li>
                    <li>The universal plasma donor has Type AB blood.</li>
                    </ul>
                    <center>
                    <h1>What Is A Universal Blood Donor?</h1></center>
                    <p>Universal donors are those with an O negative blood type.  Why?  O negative blood can be used in transfusions for any blood type.</p>
                    <p>Type O is routinely in short supply and in high demand by hospitals ? both because it is the most common blood type and because type O negative blood is the universal blood type needed for emergency transfusions and for immune deficient infants.</p>
                    <p>Approximately 45 percent of Caucasians are type O (positive or negative), but 51 percent of African-Americans and 57 percent of Hispanics are type O. Minority and diverse populations, therefore, play a critical role in meeting the constant need for blood.</p>
                    <p>Types O negative and O positive are in high demand.  Only 7% of the population are O negative. However, the need for O negative blood is the highest because it is used most often during emergencies. The need for O+ is high because it is the most frequently occurring blood type (37% of the population).</p>
                    <p>The universal red cell donor has Type O negative blood. The universal plasma donor has Type AB blood. For more about plasma donation, visit the plasma donation facts.</p>
                  
</header>
    <center>
        <div class="fimg">
            <img src="./Images/flogo1.gif">
        </div>
    </center>
            <div>
                <center>
                    <b><h1 id="abt">What is this all about?</h1></b>
                <p  style="text-shadow:0px 0px 10px grey" >We solve the problem of blood emergencies by connecting blood donors directly with people in blood need.</p>
                </center>
            </div>
            <center>
            <div class="cards1">
                <div id="c1">
                    <div class="image"><img src="./Images/drop.png"></div>
                     <h3>What we do ?</h3>
                        <p>We connect blood donors with recipients, without any intermediary such as blood banks, for an
                            efficient and seamless process.</p>
                </div>
                 <div id="c1">
                     <div class="image"><img src="./Images/innovation.png"></div>
                        <h3>Innovative</h3>
                        <p>Blood Buddy is an innovative approach to address global health.We provide immediate
                                access to blood donors.</p>
                </div>
                 <div id="c1">
                      <div class="image"><img src="./Images/netwotk.png"></div>
                      <h3>Network</h3>
                        <p>Blood Buddy is one of several community organizations working together as a network that
                            responds to emergencies in an efficient manner.</p>
                </div>
            </div>
                <div class="cards2">
                    <div id="c1">
                        <div class="image">
                            <img src="./Images/noti.png">
                        </div>
                        <h3>Get notified</h3>
                        <p>Blood Buddy Connect works with network partners to connect blood donors and recipients
                            through an automated SMS service and a mobile app.</p>
                </div>
                 <div id="c1">
                    <div class="image">
                            <img src="./Images/cost.png">
                        </div>
                        <h3>Totally Free</h3>
                        <p>Blood Budyy's ultimate goal is to provide an easy -to-use, easy-to-access, fast, efficient,
                            and reliable way to get life-saving blood, totally <span>Free of cost.</span></p>
                </div>
                 <div id="c1">
                    <div class="image">
                            <img src="./Images/save.png">
                        </div>
                        <h3>Save Life</h3>
                        <p>We are a non profit foundation and our main objective is to make sure that everything is done
                            to protect vulnerable persons.<span>Help
                                us by making a gift!</span></p>
                </div>
                    </div>
                </center>
        <footer>
            <div class="f">
                <div id="f1" ><h3>Looking for Blood</h3>
                     Blood Availability<br>
                    Blood Bank Directory<br>
                    Thalassemia Request<br></div>
                <div id="f1"><h3>Want to Donate Blood</h3>
                    Blood Donation Camps<br>
                    About Blood Donation<br>
                   Register VBD Camp<br></div>
                <div id="f1"><h3>Blood Bank Login</h3>
                     eRaktkosh Login<br>
                     Add your Blood Bank</div>
                <div id="f1"><h3>About Us</h3>
                  About eRaktkosh<br>
                   Notifications<br>
                  Eraktkosh FAQs<br>
                  Gallery<br>
                  Contact Us</div>
            </div>
        </footer>
    </body>
</html>