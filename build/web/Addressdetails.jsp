<%-- 
    Document   : Addressdetails
    Created on : Oct 17, 2018, 1:13:07 AM
    Author     : peter
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type=number]{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: lightseagreen;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: lightcoral;
}


</style>
<body>
    <table border='0' bgcolor='#20B2AA' align='top' width='100%' height:75px >
        <tr><td width='150'><img  src='Images\logo.jpg' alt='logo'  width='140' height='120'align='right'></td>
                <td bgcolor='gray' align='center' width='1000'><font size="10" color="whitesmoke" family='Italic'><b>SHOP ONLINE</b></font> </TD>
                <td><div class="cartof">
                        <center><h3 style="color: lightcoral;">Welcome!! <% out.print(session.getAttribute("user"));%></h3>
                                <form action="LogOutServlet" method="post">
                                <input name="logout" type="submit" value="Logout"></input>
                        </form>
                        </center>
                    </div></td>
                <td><a href='cart.jsp'><img src='E:\ProjectImages\cart.png'width='75' height='120' alt="cart"></a></td>
            </tr></table>
<h2 align="center" color="lightcoral">Checkout Form</h3>
<h4>Only Cash/Card on Delivery option available for this Product</h4>
<div>
  <form action="Thankyou.jsp">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name.." required="">

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname" placeholder="Your last name.." required="">

    <label for="contact">Contact</label>
    <input type="number" id="contact" name="contact" placeholder="Your phone number.." required="">
    
    <label for="address">Shipping Address</label>
    <input type="text" id="address" name="address" placeholder="Your Address here.." required="">
    
    <label for="city">City</label>
    <input type="text" id="city" name="city" placeholder="Your city .." required="">
    
    <label for="zipcode">Zip Code</label>
    <input type="number" id="code" name="code" placeholder="postal code.." required="">
    
    
  
    <input type="submit" value="Submit">
  </form>
</div>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
