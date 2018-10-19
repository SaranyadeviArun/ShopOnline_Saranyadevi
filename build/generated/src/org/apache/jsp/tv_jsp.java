package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tv_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Electronics and Television</title>\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"ExternalStylesheet/ExternalStylesheet.css\"/>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("                padding:20px;\n");
      out.write("            }\n");
      out.write("            .zoom:hover {\n");
      out.write("    -ms-transform: scale(0.7); /* IE 9 */\n");
      out.write("    -webkit-transform: scale(1.0); /* Safari 3-8 */\n");
      out.write("    transform: scale(1.1);} \n");
      out.write("        </style>\n");
      out.write("          </head>\n");
      out.write("    <body style=\"background-color:whitesmoke\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <header>\n");
      out.write("    <hgroup>\n");
      out.write("        <h1 style=\"color: crimson; text-align: center;\">Television & Home Entertainment</h1><hr>\n");
      out.write("      \n");
      out.write("    </hgroup>\n");
      out.write("  </header>\n");
      out.write("        <nav><table><tr>\n");
      out.write("                    <td><a href=\"tv1.jsp\"><div class=\"zoom\"><img src=\"Images\\treetvpage.jpg\" alt=\"smarttv\" width=\"400\" height=\"250\"></div></a> </td></div>\n");
      out.write("                    <td><a href=\"tv2.jsp\"> <div class=\"zoom\"><img src=\"Images\\smarttvpage.jpeg\" alt=\"smarttv\" width=\"400\" height=\"250\"></div></a> </td>  \n");
      out.write("                    <td><a href=\"tv3.jsp\"> <div class=\"zoom\"><img src=\"Images\\cycletvpage.jpg\" alt=\"smarttv\" width=\"400\" height=\"250\"></div></a></td>\n");
      out.write("                </div>\n");
      out.write("                    </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  ><b>₹37,490</b><a href=\"tv1.jsp\"><p>Samsung Full HD LED TV (Black) TV</p></a></td>\n");
      out.write("                    <td > <b>₹23,570</b><a href=\"tv2.jsp\"><p>CloudWalker 139 cm (55 inches) 4K Ready 55SFX2 Full HD Smart LED TV</p></a></td>\n");
      out.write("                    <td ><b>₹40,099</b><a href=\"tv3.jsp\"><p>TCL 109.3 cm (43 inches) L43P2US 4K UHD LED Smart TV (Golden)</p></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"tv1.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"tv2.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"tv3.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                \n");
      out.write("               </table>\n");
      out.write("               \n");
      out.write("            </nav>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
