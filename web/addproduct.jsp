<%-- 
    Document   : addproduct
    Created on : Oct 18, 2018, 1:16:26 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add product Page</title>
    </head>
    <body style="background-color: whitesmoke">
        <jsp:include page="header.jsp"></jsp:include>
        
        <h1 align="center" color:lightcoral > Enter the Product Details to add</h1>
        <form action="addproduct" method="post">
            <tr><td>Product ID:</td> <td><input type="text" name='pid' ></td></tr>
                 <tr><td>Product Name:</td><td><input type="text" name='pname'></td></tr>
                 <tr><td>Quantity:</td><td><input type="number" name='qty'></td></tr>
                 <tr><td>Price:</td><td><input type="number" name='price'></td></tr>
                 <tr><td><input type="submit" value='ADD' ></td>
                     <td><input type="reset" value='Cancel'></td></tr>
                 </form>
        
<jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
