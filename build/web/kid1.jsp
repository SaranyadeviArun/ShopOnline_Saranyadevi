<%-- 
    Document   : kid1
    Created on : Oct 17, 2018, 8:43:16 PM
    Author     : peter
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.*"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<style>
            table{
            margin-left: 10px; margin-right: 10px;
        }
        </style>
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
                <td><img src="Images\girlkid.jpg" width="300" height="350">
</div></td>
    <td><h2>Samsara couture Ball Gown  (Red)</h2><p><b>Rs.799</b></p><h4><b> Highlights</b></h4><ul>
            <li>Ideal For: Baby Girl's</li>
            <li>Fabric: Silk</li>
            <li>Color: Red</li>
            <li>Pattern: Solid</li>
<li>Type: Ball Gown</li></ul>
            Quantity<input type="number" name="quantity"
                           min="0" max="10" step="1" value="1"></td></tr>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='kid1'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr><td align="center"><br><br><br><br>
          
          <input type="hidden" value="kid1" name="pid">
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
