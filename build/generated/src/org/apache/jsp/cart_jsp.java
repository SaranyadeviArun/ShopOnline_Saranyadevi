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

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function func() {\n");
      out.write("var selectBox = document.getElementById(\"selectBox\");\n");
      out.write("var selectedValue = selectBox.options[selectBox.selectedIndex].value;\n");
      out.write("var price=$('#price').val();\n");
      out.write("var total=price*selectedValue;\n");
      out.write("$(\"#totalprice\").val(total);\n");
      out.write("alert(\"Are you sure you want to add \"+selectedValue+\" items in your cart\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:whitesmoke;\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("<a href=\"HomePage.jsp\">BACK</a>\n");
      out.write("<div>\n");
      out.write("<table align=\"center\" cellpadding=\"10\" cellspacing=\"5\" border=\"0\">\n");
      out.write("<tr bgcolor=\"lightseagreen\">\n");
      out.write("<td><b>Product ID</b></td>\n");
      out.write("<td><b>Product Name</b></td>\n");
      out.write("<td><b>Quantity</b></td>\n");
      out.write("<td><b>Price</b></td>\n");
      out.write("<td><b>Remove</b></td>\n");
      out.write("</tr>\n");

try{ 
connection = DriverManager.getConnection(url);
statement=connection.createStatement();
String sql ="SELECT * from Carttable where Status='incomplete'";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr bgcolor=\"lightcoral\">\n");
      out.write("<td>");
      out.print(resultSet.getString("pid") );
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("productname"));
      out.write("</td>\n");
      out.write("<td><select id=\"selectBox\" onChange=\"func();\">\n");
      out.write("  <option value=\"1\">1</option>\n");
      out.write("  <option value=\"2\">2</option>\n");
      out.write("  <option value=\"3\">3</option>\n");
      out.write("  <option value=\"4\">4</option>\n");
      out.write("  <option value=\"5\">5</option>\n");
      out.write("  <option value=\"6\">6</option>\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td><input type=\"hidden\" id=\"price\" value=\"");
      out.print(resultSet.getInt("mrp") );
      out.write("\"/>\n");
      out.write("<input type=\"text\" id=\"totalprice\" value=\"");
      out.print(resultSet.getInt("mrp") );
      out.write("\" readonly=\"readonly\"/></td>\n");
      out.write("<td>\n");
      out.write("<form action=\"RemoveServlet\" method=\"post\"><button type=\"submit\" value=\"");
      out.print(resultSet.getString("pid"));
      out.write("\" name=\"remove\">Remove</button></form></td>\n");
      out.write("</tr>\n");

}
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("<tr align=\"center\">\n");
      out.write("    <td rowspan=\"2\">\n");
      out.write("<form action=\"PaymentServlet\" method=\"post\">\n");
      out.write("    <input type=\"submit\" value=\"CHECKOUT\" ></form></td></tr></table>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>");
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
