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

public final class mobile1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <form action=\"CartServlet\" method=\"post\">\n");
      out.write("          <h1 align=\"center\">PRODUCT DETAILS</h1><hr>\n");
      out.write("          <table>\n");
      out.write("              <tr>\n");
      out.write("                <td><img src=\"Images\\iphonered.jpg\" width=\"400\" height=\"300\"></td>\n");
      out.write("                <td><h2>Apple iPhone 8 (Red, 64GB)</h2>\n");
      out.write("        <p><b>Rs.59,050</b></p><h4><b> Highlights</b></h4><ul><li>12MP primary camera and 7MP front facing camera</li>\n");
      out.write("            <li>11.93 centimeters (4.7-inch) capacitive touchscreen with 1334 x 750 pixels resolution</li>\n");
      out.write("            <li>iOS v11 operating system with 1.2GHz Apple A11 Bionic hexa core processor, 2GB RAM, 64GB internal memory, single SIM</li>\n");
      out.write("            <li>39.6 cm (15.6\") HD 1366 x 768 | DOS</li><li>All (PRODUCT)RED Purchases Help Provide Testing, Counseling and Treatment for Tens of Millions of People Living with HIV/AIDS. iPhone 8 (PRODUCT)RED Special Edition comes in a stunning red glass enclosure, matching aluminum band and sleek black front</li>\n");
      out.write("<li>1 year manufacturer warranty for device and in-box accessories including batteries from the date of device activation</li></ul>It features 20 W speakers to give you an incredible home theatre feel. Also, with the Miracast feature, you can connect your smartphone and share its content on the big screen of this television.</p>\n");
      out.write("            Quantity<input type=\"number\" name=\"quantity\"\n");
      out.write("                           min=\"0\" max=\"10\" step=\"1\" value=\"1\"></td></tr>\n");
      out.write("          \n");
      out.write("          ");

try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT productname,mrp FROM product where pid='mobile1'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("\n");
      out.write("<tr><td>\n");
      out.write("          <input type=\"hidden\" value=\"mobile1\" name=\"pid\">\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.print(resultSet.getString("productname"));
      out.write("\" name=\"pname\">\n");
      out.write("          <input type=\"hidden\" value=\"");
      out.print(resultSet.getInt("mrp"));
      out.write("\" name=\"price\" >\n");
      out.write("          <input type=\"image\"  src=\"Images/addtocart.png\" alt=\"submit\">\n");
      out.write("    </td></tr>\n");
      out.write("        </form>\n");
 
}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
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
