<%-- 
    Document   : hnf2
    Created on : Oct 17, 2018, 3:58:39 PM
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
                <td><img src="Images\sofa2.jpeg" width="400" height="350">
</div></td>
    <td><h2>Home by Nilkamal Rays Three Seater Recliner</h2><p><b>Rs.36,899</b></p><h4><b> Highlights</b></h4><ul>
            <li>Jute</li>
            <li>Symmetrical</li>
            <li>Filling Material: Foam</li>
            <li>W x H x D: 77 cm x 180 cm x 69 cm (2 ft 6 in x 5 ft 10 in x 2 ft 3 in)</li>
<li>DIY - Basic assembly to be done with simple tools, comes with instructions</li></ul>
            Quantity<input type="number" name="quantity"
   min="0" max="10" step="1" value="1"></td></tr>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='hnf2'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr><td align="center">
          
          <input type="hidden" value="hnf2" name="pid">
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