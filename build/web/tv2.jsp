<%-- 
    Document   : tv2
    Created on : Oct 15, 2018, 3:48:59 PM
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
                <td><img src="Images\smarttvpage.jpeg" width="400" height="300"></td>
                <td><h2>CloudWalker 139 cm (55 inches) 4K Ready 55SFX2 Full HD Smart LED TV</h2>
                    </h2><p><b>Rs.23,570</b></p><h4><b> Highlights</b></h4><ul><li>20 W Speaker Output</li>
            <li>3840 x 2160 Ultra HD - 4X resolution of Full HD- More depth in every picture</li>
            <li>60 Hz : Standard refresh rate for blur-free picture quality</li>
            <li>3 x HDMI : For set top box, consoles and Blu-ray players</li>
            <li>2 x USB : Easily connect your digital camera, camcorder or USB device</li></ul>
        <h4><b> Product Description</b></h4>
        <p>Spend the weekend with a bucket of popcorn, enjoying the much-awaited TV show on Netflix in 4K clarity on this Thomson 4K TV. Taking your entertainment experience to the next level is its HDR content and Thin Bezel Design. It features 20 W speakers to give you an incredible home theatre feel. Also, with the Miracast feature, you can connect your smartphone and share its content on the big screen of this television.</p>
            Quantity<input type="number" name="quantity"
   min="0" max="10" step="1" value="1"></td></tr>
          
          <%
try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='tv2'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr><td align="center">
          
          <input type="hidden" value="tv2" name="pid">
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
