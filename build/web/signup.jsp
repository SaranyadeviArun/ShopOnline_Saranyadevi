<%-- 
    Document   : signup
    Created on : Oct 12, 2018, 12:47:21 PM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp Page</title>
        <link rel="StyleSheet" href="ESS.css">
        <style>
            body{
                background-color: whitesmoke;
            }
            h2{
                color: navy; font-size: 50px;text-align:center;
            }
            
            td{
                padding: 10px;
                border:2px antiquewhite;
            }
            #button{
                margin-left: 740px;
            }
            .tableform{
                padding: 16px;
            }
            
        </style>
        <script type="text/javascript">  
function validation(){  
     var name=document.signupform.signuser.value;
var firstpassword=document.signupform.signpass1.value;  
var secondpassword=document.signupform.signpass2.value;  
     
if (name==null || name==""){ 
    document.signupform.signuser.focus();
  alert("Name can't be blank");  
  return false;  
}else if(firstpassword.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
if(firstpassword==secondpassword){  
return true;  
}  
else{  
alert("password must be same!");  
return false;  
}  
}

function reset() {
    document.getElementByName("signupform").reset();
}
</script>  
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <h2>Sign Up Page</h2>
        
        <form name='signupform' target="_self" method='post' action="SignUpServlet" onsubmit="return validation()">

            <table cellspacing='10' align='center'>
                <tr><h4 align="center" color:lightcoral > Enter the Details to become part of Shop Online</h4></tr>
            <tr><td>Name:</td> <td><input type="text" name='signuser' ></td></tr>
                 <tr><td>Email:</td><td><input type="email" name='signemail'></td></tr>
                 <tr><td>Password:</td><td><input type="password" name='signpass1'></td></tr>
                 <tr><td>Repeat Password:</td><td><input type="password" name='signpass2'></td></tr>
                 <tr><td><input type="submit" value='SignUp' ></td>
                     <td><input type="reset" value='Cancel' onclick="reset()"></td></tr>
            </table> 
      
        </form>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
