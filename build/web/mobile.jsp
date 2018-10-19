<%-- 
    Document   : mobile
    Created on : Oct 17, 2018, 10:16:41 AM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mobiles and laptops </title>
        <style>
            table{
            margin-left: 10px;
        }
            td{
                text-align: center;
                padding: 10px;
            }
        </style>
     </head>
    <body style="background-color: lightcyan">
    <jsp:include page='header.jsp'></jsp:include>
        <header>
    <hgroup>
        <h1 style="color: crimson; text-align: center;">Mobiles & Accessories</h1><hr> 
    </hgroup>
   </header>
        <table ><tr>
                    <td><a href="mobile1.jsp"><img src="Images\iphonered.jpg" alt="iphonered" width="300" height="300"></a> </td>
                    <td><a href="mobile2.jsp"><img src="Images\laptop.jpg" alt="laptop" width="300" height="300"></a> </td>  
                    <td><a href="mobile3.jsp"><img src="Images\android.png" alt="android" width="300" height="300"></a></td>
                    <td><a href="mobile4.jsp"><img src="Images\redmi5cover.jpg" alt="redmicover" width="250" height="300"></a></td>
                </tr>
                <tr>
                    <td  ><b>₹59,050</b><a href="mobile1.jsp"><p>Iphone red color</p></a></td>
                    <td > <b>₹48,999</b><a href="mobile2.jsp"><p>Acer Laptop blue </p></a></td>
                    <td ><b>₹18,099</b><a href="mobile3.jsp"><p>Redmi MI</p></a></td>
                    <td ><b>₹259</b><a href="mobile4.jsp"><p>Redmi MI 5 cover</p></a></td>
                </tr>
                <tr>
                    <td><a href="mobile1.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="mobile2.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="mobile3.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="mobile4.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                </tr>
            </table></nav>
        <br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.jsp"></jsp:include>
        
    </form>
    </body>
</html>
