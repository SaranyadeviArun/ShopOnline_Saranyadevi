<%-- 
    Document   : HomePage
    Created on : Oct 12, 2018, 12:27:37 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>table{
    margin-left: 10px;
    margin-right: 10px;
}
td{
    padding: 10px;
    text-align: center;
}
th{
    text-align: center;
}</style>
    </head>
    <body style="background-color: whitesmoke">
      <jsp:include page="header.jsp"></jsp:include> 
     <div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
          <a href="men.jsp"><img src="Images\watchcarosel.jpg" alt="Watch fashion" style="width:100%;"></a>
      </div>

      <div class="item">
          <a href="mobile.jsp"><img src="Images\samsungcarosel.jpg" alt="New arrival Mobile" style="width:100%;"></a>
      </div>
    
      <div class="item">
          <a href="women.jsp"><img src="Images\fashioncarosel.jpg" alt="Brand" style="width:100%;"></a>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
    <header>
    <hgroup>
        <h1 style="color: navy; text-align: center;">Shop By Category</h1><hr>
      
    </hgroup>
  </header>
     
    <table><thead text-align="center">
            <tr>
                <th>Electronics, Appliances & TV </th>
                <th>Mobiles, Computers</th>
                <th>Women Fashion</th>
                <th>Men Clothing</th>
                <th>Home & Furniture</th>
                <th>Kids World</th>
            </tr>
        </thead>
        <tr>
            <td><a href='tv.jsp' ><img src='E:\ProjectImages\tv.jpg' width='200' height='200'></a></td>
            <td> <a href='mobile.jsp'><img src='E:\ProjectImages\mobile.jpg' width='200' height='200'></a></td>
            <td><a href='women.jsp'><img src='E:\ProjectImages\women.jpg' width='200' height='200'></a></td>
            <td><a href='men.jsp'><img src='E:\ProjectImages\men.jpg' width='200' height='200'></a></td>
            <td><a href='hnf.jsp'><img src='E:\ProjectImages\home.jpg' width='200' height='200'></a></td>
            <td><a href='kid.jsp'><img src='E:\ProjectImages\kids.jpg' width='200' height='200'></a></td>
            </tr>
        
    </table>
    <br><br><br><br><br>
    <td width="100">
         <br><br><br><br><br>
     <jsp:include page="footer.jsp"></jsp:include>   
    </body>
</html>