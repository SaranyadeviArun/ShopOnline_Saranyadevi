<%-- 
    Document   : men
    Created on : Oct 17, 2018, 1:04:47 PM
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
                    <td><a href="men1.jsp"><img src="Images\tshirt.jpeg" alt="tshirt" width="300" height="300"></a> </td>
                    <td><a href="men2.jsp"><img src="Images\menwatch.jpg" alt="watch" width="300" height="300"></a> </td>  
                    <td><a href="men3.jsp"><img src="Images\menshoe.jpg" alt="shoe" width="300" height="300"></a></td>
                </tr>
                <tr>
                    <td  ><b>₹499</b><a href="men1.jsp"><p> Cenizas Men's Half Sleeves V Neck Henly Casual Tshirt/T-Shirt</p></a></td>
                    <td > <b>₹757</b><a href="men2.jsp"><p>Espoir Analog Blue Dial Men's Watch-ESP12457</p></a></td>
                    <td ><b>₹1,200</b><a href="men3.jsp"><p>Sneakers For Men  (Blue)</p></a></td>
                </tr>
                 <tr>
                    <td><a href="men1.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="men2.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="men3.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                 </tr>
               </table>
               
            </nav>
        <br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.jsp"></jsp:include>
        </form>
    </body>
</html>