<%-- 
    Document   : index
    Created on : Oct 13, 2018, 9:31:47 AM
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
        
       <table border='1' bgcolor='pink' align='top' width='100%' height:75px >
        <tr><td width='150'><img  src='Images\logo.jpg' alt='logo'  width='140' height='120'align='right'></td>
                <td bgcolor='gray' align='center' width='1000'><font size="10" color="Orangered" family='Italic'><b>SHOP ONLINE</b></font> </TD>
            <td><a href='cart.jsp'><img src='E:\ProjectImages\cart.png'width='75' height='120' alt="cart"></a></td>
                </tr></table> 
        <table width="200" border="0" align="center">
  <tr>
    <td>
    	<form action="login.jsp" method="post">
		<input type="submit" value="LogIn">
		</form>
	</td>
    <td>
    	<form action="signup.jsp" method="post">
		<input type="submit" value="Register">
		</form>
	</td>
  </tr>  
</table>
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
    </body>
</html>