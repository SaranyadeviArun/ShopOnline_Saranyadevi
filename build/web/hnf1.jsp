<%-- 
    Document   : hnf1
    Created on : Oct 17, 2018, 3:58:30 PM
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
    <body style="background-color:whitesmoke">
        <jsp:include page="header.jsp"></jsp:include>
        <form action="CartServlet" method="post">
          <h1 align="center">PRODUCT DETAILS</h1><hr>
          <table>
              <tr>
                <td><img src="Images\furniture.png" width="300" height="350">
</div></td>
    <td><h2>SCK Handicraft Teak Finished Solid</h2><p><b>Rs.34,199</b></p><h4><b> Highlights</b></h4><ul>
            <li>Table Top Material: Solid Wood</li>
<li>Chair Frame: Solid Wood</li>
<li>Upholstery Included</li>
<li>Table (W x H x D): 150 cm x 75 cm x 90 cm (4 ft 11 in x 2 ft 5 in x 2 ft 11 in)</li>
<li>Knock Down - Delivered in non-assembled pieces, installation by service partner</li></ul>
            Quantity<input type="number" name="quantity"
   min="0" max="10" step="1" value="1"></td></tr>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='hnf1'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr><td align="center">
          
          <input type="hidden" value="hnf1" name="pid">
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