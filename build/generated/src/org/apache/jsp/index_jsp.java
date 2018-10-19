package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("       <table border='1' bgcolor='pink' align='top' width='100%' height:75px >\n");
      out.write("        <tr><td width='150'><img  src='Images\\logo.jpg' alt='logo'  width='140' height='120'align='right'></td>\n");
      out.write("                <td bgcolor='gray' align='center' width='1000'><font size=\"10\" color=\"Orangered\" family='Italic'><b>SHOP ONLINE</b></font> </TD>\n");
      out.write("            <td><a href='cart.jsp'><img src='E:\\ProjectImages\\cart.png'width='75' height='120' alt=\"cart\"></a></td>\n");
      out.write("                </tr></table> \n");
      out.write("        <table width=\"200\" border=\"0\" align=\"center\">\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("    \t<form action=\"login.jsp\" method=\"post\">\n");
      out.write("\t\t<input type=\"submit\" value=\"LogIn\">\n");
      out.write("\t\t</form>\n");
      out.write("\t</td>\n");
      out.write("    <td>\n");
      out.write("    \t<form action=\"signup.jsp\" method=\"post\">\n");
      out.write("\t\t<input type=\"submit\" value=\"Register\">\n");
      out.write("\t\t</form>\n");
      out.write("\t</td>\n");
      out.write("  </tr>  \n");
      out.write("</table>\n");
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
