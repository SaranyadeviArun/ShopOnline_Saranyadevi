package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class women_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Women-fashion Page</title>\n");
      out.write("    <title>women fashion </title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("     </head>\n");
      out.write("    <body style=\"background-color: lightcyan\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <header>\n");
      out.write("    <hgroup>\n");
      out.write("        <h1 style=\"color: crimson; text-align: center;\">Women's Clothing and Accessories</h1><hr> \n");
      out.write("    </hgroup>\n");
      out.write("   </header>       \n");
      out.write("        \n");
      out.write("   <nav><table ><tr>\n");
      out.write("                    <td><a href=\"women1.jsp\"><img src=\"Images\\saree.png\" alt=\"saree\" width=\"300\" height=\"300\"></a> </td>\n");
      out.write("                    <td><a href=\"women2.jsp\"><img src=\"Images\\earing.jpg\" alt=\"earing\" width=\"300\" height=\"300\"></a> </td>  \n");
      out.write("                    <td><a href=\"women3.jsp\"><img src=\"Images\\watch.jpg\" alt=\"watch\" width=\"200\" height=\"300\"></a></td>\n");
      out.write("                    <td><a href=\"women4.jsp\"><img src=\"Images\\bracelet.jpg\" alt=\"bracelet\" width=\"300\" height=\"300\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  ><b>₹499</b><a href=\"women1.jsp\"><p>Trendz Style Striped Fashion Tussar Silk Saree  (Multicolor)</p></a></td>\n");
      out.write("                    <td > <b>₹250</b><a href=\"women2.jsp\"><p>You Bella Ethnic Party Wear Jewellery Alloy Dangle Earring </p></a></td>\n");
      out.write("                    <td ><b>₹415</b><a href=\"women3.jsp\"><p>AUREX AX-LR533-PKC AWESOME PINK DIAL GIRL'S Watch - For Women</p></a></td>\n");
      out.write("                    <td ><b>₹379</b><a href=\"women4.jsp\"><p>White stone fashioned bracelet</p></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"women1.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"women2.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"women3.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                  <td><a href=\"women4.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table></nav>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </form>\n");
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
