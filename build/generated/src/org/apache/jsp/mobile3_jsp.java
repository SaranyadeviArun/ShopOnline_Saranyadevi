package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class mobile3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write("\n");
      out.write("    <body><table>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <form action=\"CartServlet\" method=\"post\">\n");
      out.write("          <h1 align=\"center\">PRODUCT DETAILS</h1><hr>\n");
      out.write("          \n");
      out.write("              <tr>\n");
      out.write("                <td><img src=\"Images\\android.png\" width=\"400\" height=\"300\"></td>\n");
      out.write("                <td><h2>Redmi MI</h2>\n");
      out.write("        <p><b>Rs.18,099</b></p><h4><b> Highlights</b></h4><ul><li>16MP AI-Selfie camera with LED selfie light</li>\n");
      out.write("            <li>12MP + 5MP AI dual camera, AI-based Beautify 4.0</li>\n");
      out.write("            <li>5.99\" HD+ 18:9 full-screen display</li>\n");
      out.write("            <li>Snapdragon 625 octa-core processor</li>\n");
      out.write("            <li>4GB RAM with 64GB storage expandable up to 128GB</li>\n");
      out.write("            <li>MIUI 9.5 based on Android Oreo</li>\n");
      out.write("            <li>3080mAH lithium-polymer battery  </li>    \n");
      out.write("            \n");
      out.write("            Quantity<input type=\"number\" name=\"quantity\"\n");
      out.write("   min=\"0\" max=\"10\" step=\"1\" value=\"1\"></td></tr>\n");
      out.write("          \n");
      out.write("          ");

try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='mobile3'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr><td align=\"center\">\n");
      out.write("          \n");
      out.write("          <input type=\"hidden\" value=\"mobile3\" name=\"pid\">\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.print(resultSet.getString("productname"));
      out.write("\" name=\"pname\">\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.print(resultSet.getInt("mrp"));
      out.write("\" name=\"price\" >\n");
      out.write("          <input type=\"image\"  src=\"Images/addtocart.png\" alt=\"submit\">\n");
      out.write("    </td></tr>\n");
      out.write("        \n");
 
}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</form>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
