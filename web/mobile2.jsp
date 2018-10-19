<%-- 
    Document   : mobile2
    Created on : Oct 17, 2018, 10:17:06 AM
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
                <td><img src="Images\laptop.jpg" width="400" height="300"></td>
                <td><h2>Acer Switch SW110-1CT 10.1-inch Laptop (Intel_atom/2GB/32GB/Windows 10/Integrated Graphics), Blue</h2>
        <p><b>Rs.48,999</b></p><h4><b> Highlights</b></h4><ul><li>1.44GHz Intel intel_atom processor</li>
            <li>2GB DDR3 RAM</li>
            <li>32GB hard drive</li>
            <li>10.1-inch screen, Intel Integrated HD 400 graphics</li>
            <li>Windows 10 operating system</li>
            <li>1.10kg laptop</li>
                        <p>The Acer IdeaPad 320E (80XH01GEIN) Notebook renders performance and multi-tasking efficiency with its integrated 4 GB RAM. This device is powered by the robust 2.0 GHz Intel Core i3-6006U processor that takes care of all its processing needs. Also, this laptop features a convenient 15.6-inch display that provides a clear view of files, applications, and documents.</p>

<li>1 year manufacturer warranty for device and in-box accessories including batteries from the date of device activation</li></ul>
            Quantity<input type="number" name="quantity"
                           min="0" max="10" step="1" value="1"></td></tr><br><br><br><br><br>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='mobile2'";
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

