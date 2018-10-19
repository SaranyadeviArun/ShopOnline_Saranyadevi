<%-- 
    Document   : cart
    Created on : Oct 13, 2018, 9:48:28 PM
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
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript">
function func() {
var selectBox = document.getElementById("selectBox");
var selectedValue = selectBox.options[selectBox.selectedIndex].value;
var price=$('#price').val();
var total=price*selectedValue;
$("#totalprice").val(total);
alert("Are you sure you want to add "+selectedValue+" items in your cart");

}
</script>
</head>
<body style="background-color:whitesmoke;">
    <jsp:include page="header.jsp"></jsp:include>
    
<a href="HomePage.jsp">BACK</a>
<div>
<table align="center" cellpadding="10" cellspacing="5" border="0">
<tr bgcolor="lightseagreen">
<td><b>Product ID</b></td>
<td><b>Product Name</b></td>
<td><b>Quantity</b></td>
<td><b>Price</b></td>
<td><b>Remove</b></td>
</tr>
<%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT * from Carttable where Status='incomplete'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="lightcoral">
<td><%=resultSet.getString("pid") %></td>
<td><%=resultSet.getString("productname")%></td>
<td><select id="selectBox" onChange="func();">
  <option value="1">1</option>
  <option value="2">2</option>
  <option value="3">3</option>
  <option value="4">4</option>
  <option value="5">5</option>
  <option value="6">6</option>
</select>
</td>
<td><input type="hidden" id="price" value="<%=resultSet.getInt("mrp") %>"/>
<input type="text" id="totalprice" value="<%=resultSet.getInt("mrp") %>" readonly="readonly"/></td>
<td>
<form action="RemoveServlet" method="post"><button type="submit" value="<%=resultSet.getString("pid")%>" name="remove">Remove</button></form></td>
</tr>
<%
}
} catch (Exception e) {
e.printStackTrace();
}
%>
<tr align="center">
    <td>
<form action="PaymentServlet" method="post">
    <input type="submit" value="CHECKOUT" ></form></td></tr></table>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<jsp:include page="footer.jsp"></jsp:include>
</body>