<%-- 
    Document   : mobile1
    Created on : Oct 17, 2018, 10:16:55 AM
    Author     : peter
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>

<%
String id = request.getParameter("userId");
String driverName = "org.apache.derby.jdbc.ClientDriver";
String url="jdbc:derby://localhost:1527/ShopOnline;create=true;user=Saranyadevi;password=12345";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <form action="CartServlet" method="post">
          <h1 align="center">PRODUCT DETAILS</h1><hr>
          <table>
              <tr>
                <td><img src="Images\iphonered.jpg" width="400" height="300"></td>
                <td><h2>Apple iPhone 8 (Red, 64GB)</h2>
        <p><b>Rs.59,050</b></p><h4><b> Highlights</b></h4><ul><li>12MP primary camera and 7MP front facing camera</li>
            <li>11.93 centimeters (4.7-inch) capacitive touchscreen with 1334 x 750 pixels resolution</li>
            <li>iOS v11 operating system with 1.2GHz Apple A11 Bionic hexa core processor, 2GB RAM, 64GB internal memory, single SIM</li>
            <li>39.6 cm (15.6") HD 1366 x 768 | DOS</li><li>All (PRODUCT)RED Purchases Help Provide Testing, Counseling and Treatment for Tens of Millions of People Living with HIV/AIDS. iPhone 8 (PRODUCT)RED Special Edition comes in a stunning red glass enclosure, matching aluminum band and sleek black front</li>
<li>1 year manufacturer warranty for device and in-box accessories including batteries from the date of device activation</li></ul>It features 20 W speakers to give you an incredible home theatre feel. Also, with the Miracast feature, you can connect your smartphone and share its content on the big screen of this television.</p>
            Quantity<input type="number" name="quantity"
                           min="0" max="10" step="1" value="1"></td></tr>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='mobile1'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<tr><td align="center">
          <input type="hidden" value="mobile1" name="pid">
          <input type="hidden" value="<%=resultSet.getString("productname")%>" name="pname">
          <input type="hidden" value="<%=resultSet.getInt("mrp")%>" name="price" >
          <input type="image"  src="Images/addtocart.png" alt="submit">
    </td></tr>
        </form>
<% 
}
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
    </body>
    <jsp:include page="footer.jsp"></jsp:include>
</html>
