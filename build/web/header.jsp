<%-- 
    Document   : header
    Created on : Oct 12, 2018, 12:41:25 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="StyleSheet" href="ESS.css">
<style>
* {box-sizing: border-box;}

body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: lightgrey;
}

.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: coral;
  color: black;
}

.topnav a.active {
  background-color: lightsteelblue;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: whitesmoke;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}

</style>
   
</head>
<body><table border='0' bgcolor='#20B2AA' align='top' width='100%' height:75px >
        <tr><td width='150'><img  src='Images\logo.jpg' alt='logo'  width='140' height='120'align='right'></td>
                <td bgcolor='gray' align='center' width='1000'><font size="10" color="whitesmoke" family='Italic'><b>SHOP ONLINE</b></font> </TD>
                <td><div class="cartof">
                        <center><h3 style="color: lightcoral;">Welcome!! <% out.print(session.getAttribute("user"));%></h3>
                                <form action="LogOutServlet" method="post">
                                <input name="logout" type="submit" value="Logout"></input>
                        </form>
                        </center>
                    </div></td>
                <td><a href='cart.jsp'><img src='E:\ProjectImages\cart.png'width='75' height='120' alt="cart"></a></td>
            </tr></table>
            <div class="topnav">
  <a href=tv.jsp>Electronics Gadgets</a>
  <a href=mobile.jsp>Mobiles & Laptops</a>
  <a href=hnf.jsp>Home Furniture</a>
  <a href=women.jsp>Women fashion</a>
  <a href=men.jsp>Men Fashion</a>
   <a href=kid.jsp>kids</a>
  <div class="search-container">
    <form action=#>
      <input type="text" placeholder="Search.." name="search">
      
    </form>
  </div>
</div>

    </body>
</html>
