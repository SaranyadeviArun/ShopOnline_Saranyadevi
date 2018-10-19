<%-- 
    Document   : women
    Created on : Oct 17, 2018, 12:12:03 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Women-fashion Page</title>
    <title>women fashion </title>
        <style>
            
            td{
                text-align: center;
                padding: 20px;
            }
        </style>
     </head>
    <body style="background-color: whitesmoke">
        <jsp:include page='header.jsp'></jsp:include>
        <header>
    <hgroup>
        <h1 style="color: crimson; text-align: center;">Women's Clothing and Accessories</h1><hr> 
    </hgroup>
   </header>       
        
   <nav><table ><tr>
                    <td><a href="women1.jsp"><img src="Images\saree.png" alt="saree" width="300" height="300"></a> </td>
                    <td><a href="women2.jsp"><img src="Images\earing.jpg" alt="earing" width="300" height="300"></a> </td>  
                    <td><a href="women3.jsp"><img src="Images\watch.jpg" alt="watch" width="200" height="300"></a></td>
                    <td><a href="women4.jsp"><img src="Images\bracelet.jpg" alt="bracelet" width="300" height="300"></a></td>
                </tr>
                <tr>
                    <td  ><b>₹499</b><a href="women1.jsp"><p>Trendz Style Striped Fashion Tussar Silk Saree  (Multicolor)</p></a></td>
                    <td > <b>₹250</b><a href="women2.jsp"><p>You Bella Ethnic Party Wear Jewellery Alloy Dangle Earring </p></a></td>
                    <td ><b>₹415</b><a href="women3.jsp"><p>AUREX AX-LR533-PKC AWESOME PINK DIAL GIRL'S Watch - For Women</p></a></td>
                    <td ><b>₹379</b><a href="women4.jsp"><p>White stone fashioned bracelet</p></a></td>
                </tr>
                <tr>
                    <td><a href="women1.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="women2.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                    <td><a href="women3.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>
                  <td><a href="women4.jsp"><input type="image" src="Images/clickhere.png" alt="productinfo" width="200" height="50"></a></td>

                </tr>
            </table></nav>
        <br><br><br><br><br><br><br><br><br>
        <jsp:include page="footer.jsp"></jsp:include>
        </form>
    </body>
</html>
