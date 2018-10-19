package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class WelcomeAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<title>Admin Page</title>\n");
      out.write("<style>\n");
      out.write("            body{\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("            }</style>\n");
      out.write("        <script>\n");
      out.write("function startTime() {\n");
      out.write("    var today = new Date();\n");
      out.write("    var h = today.getHours();\n");
      out.write("    var m = today.getMinutes();\n");
      out.write("    var s = today.getSeconds();\n");
      out.write("    m = checkTime(m);\n");
      out.write("    s = checkTime(s);\n");
      out.write("    document.getElementById('txt').innerHTML =\n");
      out.write("    h + \":\" + m + \":\" + s;\n");
      out.write("    var t = setTimeout(startTime, 500);\n");
      out.write("}\n");
      out.write("function checkTime(i) {\n");
      out.write("    if (i < 10) {i = \"0\" + i};  // add zero in front of numbers < 10\n");
      out.write("    return i;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"startTime()\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <h2 align=\"center\" color=\"lightcoral\">WELCOME ADMIN!!</h2>\n");
      out.write("        <div id=\"txt\" align=\"center\">Time:</div>\n");
      out.write("        <ul align=\"center\" class=\"w3-blue\">\n");
      out.write("            <li><a href=\"viewproduct.jsp\">View Products</a></li>\n");
      out.write("            <li><a href=\"addproduct.jsp\">Add New Products</a></li>\n");
      out.write("            <li><a href=\"deleteproduct.jsp\">Delete Existing Products</a></li>\n");
      out.write("            <li><a href=\"editproduct.jsp\">Edit Product Details</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <br>\n");
      out.write("        <br> <br> <br> <br> <br> <br><br> <br> <br> <br>  <br>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
