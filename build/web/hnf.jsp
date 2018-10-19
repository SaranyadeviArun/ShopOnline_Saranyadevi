<%-- 
    Document   : hnf
    Created on : Oct 17, 2018, 3:58:22 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home design</title>
    <style>
        table{
            margin-left: 30px; margin-right: 20px;
        }
            td{
                text-align: center;
                padding: 10px;
            }
        </style>
     </head>
    <body style="background-color: whitesmoke">
        
        <jsp:include page='header.jsp'></jsp:include>
        <header>
    <hgroup>
        <h1 style="color: crimson; text-align: center;">Home Decorations & Furniture</h1><hr> 
    </hgroup>
   </header>
        <nav><table><tr>
                    <td><a href="hnf1.jsp"><img src="Images\furniture.png" alt="furniture" width="300" height="350" align="left"></a> </td>
                    <td><a href="hnf2.jsp"><img src="Images\sofa2.jpeg" alt="sofa" width="300" height="350" align="middle"></a> </td>  
                    <td><a href="hnf3.jsp"><img src="Images\chair.jpg" alt="chair" width="300" height="350" align="right"></a></td>
                    <td><a href="hnf4.jsp"><img src="Images\mirror.jpg" alt="mirror" width="300" height="350" align="right"></a></td>
                </tr>
                <tr>
                    <td  ><b>₹34,199</b><a href="hnf1.jsp"><p>CK Handicraft Teak Finished Solid  <p>Sheesham Wood </p></p></a></td>
                    <td > <b>₹36,899</b><a href="hnf2.jsp"><p>@Home by Nilkamal Rays Three Seater Recliner (Brown) </p></a></td>
                    <td ><b>₹5,099</b><a href="hnf3.jsp"><p>Real chairs purple soft cushion</p></a></td>
                    <td ><b>₹2,033</b><a href="hnf4.jsp"><p>Mirror bedroom furniture </p></a></td>
                </tr>
                <tr>
                    <td><a href="hnf1.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="hnf2.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="hnf3.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="hnf4.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>

                </tr>
            </table></nav>
        <br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.jsp"></jsp:include>
        </form> 
    </body>
</html>