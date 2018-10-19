package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>table{\n");
      out.write("    margin-left: 10px;\n");
      out.write("    margin-right: 10px;\n");
      out.write("}\n");
      out.write("td{\n");
      out.write("    padding: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("th{\n");
      out.write("    text-align: center;\n");
      out.write("}</style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: whitesmoke\">\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("     <div class=\"container\">\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          <a href=\"men.jsp\"><img src=\"Images\\watchcarosel.jpg\" alt=\"Watch fashion\" style=\"width:100%;\"></a>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("          <a href=\"mobile.jsp\"><img src=\"Images\\samsungcarosel.jpg\" alt=\"New arrival Mobile\" style=\"width:100%;\"></a>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("          <a href=\"women.jsp\"><img src=\"Images\\fashioncarosel.jpg\" alt=\"Brand\" style=\"width:100%;\"></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <header>\n");
      out.write("    <hgroup>\n");
      out.write("        <h1 style=\"color: navy; text-align: center;\">Shop By Category</h1><hr>\n");
      out.write("      \n");
      out.write("    </hgroup>\n");
      out.write("  </header>\n");
      out.write("     \n");
      out.write("    <table><thead text-align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Electronics, Appliances & TV </th>\n");
      out.write("                <th>Mobiles, Computers</th>\n");
      out.write("                <th>Women Fashion</th>\n");
      out.write("                <th>Men Clothing</th>\n");
      out.write("                <th>Home & Furniture</th>\n");
      out.write("                <th>Kids World</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tr>\n");
      out.write("            <td><a href='tv.jsp' ><img src='E:\\ProjectImages\\tv.jpg' width='200' height='200'></a></td>\n");
      out.write("            <td> <a href='mobile.jsp'><img src='E:\\ProjectImages\\mobile.jpg' width='200' height='200'></a></td>\n");
      out.write("            <td><a href='women.jsp'><img src='E:\\ProjectImages\\women.jpg' width='200' height='200'></a></td>\n");
      out.write("            <td><a href='men.jsp'><img src='E:\\ProjectImages\\men.jpg' width='200' height='200'></a></td>\n");
      out.write("            <td><a href='hnf.jsp'><img src='E:\\ProjectImages\\home.jpg' width='200' height='200'></a></td>\n");
      out.write("            <td><a href='kid.jsp'><img src='E:\\ProjectImages\\kids.jpg' width='200' height='200'></a></td>\n");
      out.write("            </tr>\n");
      out.write("        \n");
      out.write("    </table>\n");
      out.write("    <br><br><br><br><br>\n");
      out.write("    <td width=\"100\">\n");
      out.write("         <br><br><br><br><br>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>");
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
