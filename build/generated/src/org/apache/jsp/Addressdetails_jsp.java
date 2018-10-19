package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Addressdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("input[type=text], select {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("input[type=number]{\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: lightseagreen;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 15px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: lightcoral;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <table border='0' bgcolor='#20B2AA' align='top' width='100%' height:75px >\n");
      out.write("        <tr><td width='150'><img  src='Images\\logo.jpg' alt='logo'  width='140' height='120'align='right'></td>\n");
      out.write("                <td bgcolor='gray' align='center' width='1000'><font size=\"10\" color=\"whitesmoke\" family='Italic'><b>SHOP ONLINE</b></font> </TD>\n");
      out.write("                <td><div class=\"cartof\">\n");
      out.write("                        <center><h3 style=\"color: lightcoral;\">Welcome!! ");
 out.print(session.getAttribute("user"));
      out.write("</h3>\n");
      out.write("                                <form action=\"LogOutServlet\" method=\"post\">\n");
      out.write("                                <input name=\"logout\" type=\"submit\" value=\"Logout\"></input>\n");
      out.write("                        </form>\n");
      out.write("                        </center>\n");
      out.write("                    </div></td>\n");
      out.write("                <td><a href='cart.jsp'><img src='E:\\ProjectImages\\cart.png'width='75' height='120' alt=\"cart\"></a></td>\n");
      out.write("            </tr></table>\n");
      out.write("<h2 align=\"center\" color=\"lightcoral\">Checkout Form</h3>\n");
      out.write("<h4>Only Cash/Card on Delivery option available for this Product</h4>\n");
      out.write("<div>\n");
      out.write("  <form action=\"Thankyou.jsp\">\n");
      out.write("    <label for=\"fname\">First Name</label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name..\" required=\"\">\n");
      out.write("\n");
      out.write("    <label for=\"lname\">Last Name</label>\n");
      out.write("    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name..\" required=\"\">\n");
      out.write("\n");
      out.write("    <label for=\"contact\">Contact</label>\n");
      out.write("    <input type=\"number\" id=\"contact\" name=\"contact\" placeholder=\"Your phone number..\" required=\"\">\n");
      out.write("    \n");
      out.write("    <label for=\"address\">Shipping Address</label>\n");
      out.write("    <input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Your Address here..\" required=\"\">\n");
      out.write("    \n");
      out.write("    <label for=\"city\">City</label>\n");
      out.write("    <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Your city ..\" required=\"\">\n");
      out.write("    \n");
      out.write("    <label for=\"zipcode\">Zip Code</label>\n");
      out.write("    <input type=\"number\" id=\"code\" name=\"code\" placeholder=\"postal code..\" required=\"\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("    <input type=\"submit\" value=\"Submit\">\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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
