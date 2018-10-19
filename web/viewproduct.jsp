<%-- 
    Document   : viewproduct
    Created on : Oct 18, 2018, 11:36:08 AM
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
<body style="background-color: whitesmoke">
    <jsp:include page="header.jsp"></jsp:include>
<h2 align="center"><font><strong>List of All Products in database</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor=lightseagreen;>
<td><b>Product ID</b></td>
<td><b>Product Name</b></td>
<td><b>Quantity</b></td>
<td><b>Price</b></td>

</tr>
<%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT * FROM product";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="lightcoral">

<td><%=resultSet.getString("pid") %></td>
<td><%=resultSet.getString("productname") %></td>
<td><%=resultSet.getString("quantity") %></td>
<td><%=resultSet.getString("mrp") %></td>

</tr>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>