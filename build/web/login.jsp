<%-- 
    Document   : login
    Created on : Oct 12, 2018, 12:47:03 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
        
        <style>
            body{
                background-color: whitesmoke;
            }
            
            button:hover {
    opacity: 0.8;
}
.submitbutton{
    padding:14px 20px;
    background-color: green;
}
.submitbutton, .resetbutton{
    float:left;
    width:50%
}

h2{
                color: navy; font-size: 50px;text-align:center;
            }
            
        </style>
        <script>
function changeImage() {
    var image = document.getElementById('myImage');
    if (image.src.match("Images\login.png")) {
        image.src = "Images/logout.jpg";
    } else {
        image.src = "Images\login.png";
    }
}
</script>
<script type="text/javascript">
    function login(){
        var name=document.loginform.username.value;
        if(name.length>2){
            alert("Welcome " +name+"!");
            return true;
    }}
</script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <form name="loginform" action="LoginServlet" method="post" onsubmit="return login()">
            <table >
                <tr>
                    <h2 >LOGIN FORM</h2>
                </tr>
            </table>  
            <table cellspacing='50' align='center'>
                <tr><td>User Name:</td>
                    <td colspan='2'><input type='text' name='signuser' placeholder="Enter name" required autofocus></td>
                </td></tr>
                 <tr><td >Password:</td>  
                     <td colspan='2'> <input type='password' name='signpass1' placeholder="Enter password" required autofocus></td>
                </tr> 
                <tr><td> Role:</td><td><input type="radio" value="administrator" name="role">Administrator
                    <input type="radio" value="users" name="role">User</td></tr>
            <tr colspan='2'><td><input type='submit' value='login' >
                    <td><input type='reset' value='cancel'></tr>
                    <tr> <td><a href="signup.jsp">New User</a></td></tr>
            </table>
        </form>
    </body>
</html>
