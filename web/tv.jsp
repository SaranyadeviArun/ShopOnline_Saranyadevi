<%-- 
    Document   : tv
    Created on : Oct 13, 2018, 10:19:17 AM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Electronics and Television</title>
        <link type="text/css" rel="stylesheet" href="ExternalStylesheet/ExternalStylesheet.css"/>
        <style>
            
            td{
                text-align: center;
                padding:20px;
            }
            .zoom:hover {
    -ms-transform: scale(0.7); /* IE 9 */
    -webkit-transform: scale(1.0); /* Safari 3-8 */
    transform: scale(1.1);} 
        </style>
          </head>
    <body style="background-color:whitesmoke">
        <jsp:include page='header.jsp'></jsp:include>
        <header>
    <hgroup>
        <h1 style="color: crimson; text-align: center;">Television & Home Entertainment</h1><hr>
      
    </hgroup>
  </header>
        <nav><table><tr>
                    <td><a href="tv1.jsp"><div class="zoom"><img src="Images\treetvpage.jpg" alt="smarttv" width="400" height="250"></div></a> </td></div>
                    <td><a href="tv2.jsp"> <div class="zoom"><img src="Images\smarttvpage.jpeg" alt="smarttv" width="400" height="250"></div></a> </td>  
                    <td><a href="tv3.jsp"> <div class="zoom"><img src="Images\cycletvpage.jpg" alt="smarttv" width="400" height="250"></div></a></td>
                </div>
                    </tr>
                <tr>
                    <td  ><b>₹37,490</b><a href="tv1.jsp"><p>Samsung Full HD LED TV (Black) TV</p></a></td>
                    <td > <b>₹23,570</b><a href="tv2.jsp"><p>CloudWalker 139 cm (55 inches) 4K Ready 55SFX2 Full HD Smart LED TV</p></a></td>
                    <td ><b>₹40,099</b><a href="tv3.jsp"><p>TCL 109.3 cm (43 inches) L43P2US 4K UHD LED Smart TV (Golden)</p></a></td>
                </tr>
                <tr>
                    <td><a href="tv1.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="tv2.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="tv3.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                
               </table>
               
            </nav>
        <br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.jsp"></jsp:include>
        </form>
    </body>
</html>

