<%-- 
    Document   : WelcomeAdmin
    Created on : Oct 13, 2018, 12:57:22 AM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Admin Page</title>
<style>
            body{
                background-color: whitesmoke;
            }</style>
        <script>
function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('txt').innerHTML =
    h + ":" + m + ":" + s;
    var t = setTimeout(startTime, 500);
}
function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}
</script>
    </head>
    <body onload="startTime()">
        <jsp:include page="header.jsp"></jsp:include>
        
        <h2 align="center" color="lightcoral">WELCOME ADMIN!!</h2>
        <div id="txt" align="center">Time:</div>
        <ul align="center" class="w3-blue">
            <li><a href="viewproduct.jsp">View Products</a></li>
            <li><a href="addproduct.jsp">Add New Products</a></li>
            <li><a href="deleteproduct.jsp">Delete Existing Products</a></li>
            <li><a href="editproduct.jsp">Edit Product Details</a></li>
        </ul>
        <br>
        <br> <br> <br> <br> <br> <br><br> <br> <br> <br>  <br>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
