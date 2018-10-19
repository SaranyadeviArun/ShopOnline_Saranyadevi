package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mobile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>mobiles and laptops </title>\n");
      out.write("        <style>\n");
      out.write("            table{\n");
      out.write("            margin-left: 10px;\n");
      out.write("        }\n");
      out.write("            td{\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("     </head>\n");
      out.write("    <body style=\"background-color: lightcyan\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <header>\n");
      out.write("    <hgroup>\n");
      out.write("        <h1 style=\"color: crimson; text-align: center;\">Mobiles & Accessories</h1><hr> \n");
      out.write("    </hgroup>\n");
      out.write("   </header>\n");
      out.write("        <table ><tr>\n");
      out.write("                    <td><a href=\"mobile1.jsp\"><img src=\"Images\\iphonered.jpg\" alt=\"iphonered\" width=\"300\" height=\"300\"></a> </td>\n");
      out.write("                    <td><a href=\"mobile2.jsp\"><img src=\"Images\\laptop.jpg\" alt=\"laptop\" width=\"300\" height=\"300\"></a> </td>  \n");
      out.write("                    <td><a href=\"mobile3.jsp\"><img src=\"Images\\android.png\" alt=\"android\" width=\"300\" height=\"300\"></a></td>\n");
      out.write("                    <td><a href=\"mobile4.jsp\"><img src=\"Images\\redmi5cover.jpg\" alt=\"redmicover\" width=\"250\" height=\"300\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  ><b>₹59,050</b><a href=\"mobile1.jsp\"><p>Iphone red color</p></a></td>\n");
      out.write("                    <td > <b>₹48,999</b><a href=\"mobile2.jsp\"><p>Acer Laptop blue </p></a></td>\n");
      out.write("                    <td ><b>₹18,099</b><a href=\"mobile3.jsp\"><p>Redmi MI</p></a></td>\n");
      out.write("                    <td ><b>₹259</b><a href=\"mobile4.jsp\"><p>Redmi MI 5 cover</p></a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><a href=\"mobile1.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"mobile2.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"mobile3.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                    <td><a href=\"mobile4.jsp\"><input type=\"image\" src=\"Images/clickhere.png\" alt=\"productinfo\" width=\"200\" height=\"50\"></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table></nav>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("    </form>\n");
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
