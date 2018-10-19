<%-- 
    Document   : kid
    Created on : Oct 17, 2018, 8:43:07 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>kids & toys </title>
    </head>
    <body>
       <style>
            table{
            margin-left: 10px; margin-right: 10px;
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
        <h1 style="color: crimson; text-align: center;">Kids  world</h1><hr>
      
    </hgroup>
  </header>
        <nav><table ><tr>
                    <td><a href="kid1.jsp"><img src="Images\girlkid.jpg" alt="girl dress" width="300" height="300"></a> </td>
                    <td><a href="kid2.jsp"><img src="Images\toy.jpg" alt="toy" width="300" height="300"></a> </td>  
                    <td><a href="kid3.jsp"><img src="Images\boykid.jpg" alt="boy dress" width="300" height="300"></a></td>
                    <td><a href="kid4.jsp"><img src="Images\teddy.jpg" alt="teddy doll" width="300" height="300"></a></td>
                </tr>
                <tr>
                    <td  ><b>₹799</b><a href="kid1.jsp"><p> Samsara couture Ball Gown  (Red) </p></a></td>
                    <td > <b>₹256</b><a href="kid2.jsp"><p>Kids Choice Plastic duck</p></a></td>
                    <td ><b>₹1,200</b><a href="kid3.jsp"><p>My NewBorn Baby Boy's Kurta Pyjama Set</p></a></td>
                    <td ><b>₹350</b><a href="kid4.jsp"><p>Teddy doll for kids</p></a></td>
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
