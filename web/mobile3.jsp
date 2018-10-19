<%-- 
    Document   : mobile3
    Created on : Oct 17, 2018, 10:17:15 AM
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
    <body><table>
        <jsp:include page="header.jsp"></jsp:include>
        <form action="CartServlet" method="post">
          <h1 align="center">PRODUCT DETAILS</h1><hr>
          
              <tr>
                <td><img src="Images\android.png" width="400" height="300"></td>
                <td><h2>Redmi MI</h2>
        <p><b>Rs.18,099</b></p><h4><b> Highlights</b></h4><ul><li>16MP AI-Selfie camera with LED selfie light</li>
            <li>12MP + 5MP AI dual camera, AI-based Beautify 4.0</li>
            <li>5.99" HD+ 18:9 full-screen display</li>
            <li>Snapdragon 625 octa-core processor</li>
            <li>4GB RAM with 64GB storage expandable up to 128GB</li>
            <li>MIUI 9.5 based on Android Oreo</li>
            <li>3080mAH lithium-polymer battery  </li>    
            
            Quantity<input type="number" name="quantity"
   min="0" max="10" step="1" value="1"></td></tr>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='mobile3'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr><td align="center">
          
          <input type="hidden" value="mobile3" name="pid">
          <input type="hidden" value="<%=resultSet.getString("productname")%>" name="pname">
          <input type="hidden" value="<%=resultSet.getInt("mrp")%>" name="price" >
          <input type="image"  src="Images/addtocart.png" alt="submit">
    </td></tr>
        
<% 
}
} catch (Exception e) {
e.printStackTrace();
}
%>
</form>
</table>
    </body>
    <jsp:include page="footer.jsp"></jsp:include>
</html>
