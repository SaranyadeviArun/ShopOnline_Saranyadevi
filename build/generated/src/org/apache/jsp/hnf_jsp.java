package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hnf_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home design</title>\n");
      out.write("    <style>\n");
      out.write("        table{\n");
      out.write("            margin-left: 30px; margin-right: 20px;\n");
      out.write("        }\n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("     </head>\n");
      out.write("    <body style=\"background-color: whitesmoke\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <header>\n");
      out.write("    <hgroup>\n");
      out.write("        <h1 style=\"color: crimson; text-align: center;\">Home Decorations & Furniture</h1><hr> \n");
      out.write("    </hgroup>\n");
      out.write("   </header>\n");
      out.write("        <nav><table><tr>\n");
      out.write("                    <td><a href=\"hnf1.jsp\"><img src=\"Images\\furniture.png\" alt=\"furniture\" width=\"300\" height=\"350\" align=\"left\"></a> </td>\n");
      out.write("                    <td><a href=\"hnf2.jsp\"><img src=\"Images\\sofa2.jpeg\" alt=\"sofa\" width=\"300\" height=\"350\" align=\"middle\"></a> </td>  \n");
      out.write("                    <td><a href=\"hnf3.jsp\"><img src=\"Images\\chair.jpg\" alt=\"chair\" width=\"300\" height=\"350\" align=\"right\"></a></td>\n");
      out.write("                    <td><a href=\"hnf4.jsp\"><img src=\"Images\\mirror.jpg\" alt=\"mirror\" width=\"300\" height=\"350\" align=\"right\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  ><b>₹34,199</b><a href=\"hnf1.jsp\"><p>CK Handicraft Teak Finished Solid  <p>Sheesham Wood </p></p></a></td>\n");
      out.write("                    <td > <b>₹36,899</b><a href=\"hnf2.jsp\"><p>@Home by Nilkamal Rays Three Seater Recliner (Brown) </p></a></td>\n");
      out.write("                    <td ><b>₹5,099</b><a href=\"hnf3.jsp\"><p>Real chairs purple soft cushion</p></a></td>\n");
      out.write("                    <td ><b>₹2,033</b><a href=\"hnf4.jsp\"><p>Mirror bedroom furniture </p></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"hnf1.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"hnf2.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"hnf3.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"hnf4.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table></nav>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </form> \n");
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
