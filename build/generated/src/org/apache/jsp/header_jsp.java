package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("* {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  margin: 0;\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: lightgrey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: coral;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a.active {\n");
      out.write("  background-color: lightsteelblue;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .search-container {\n");
      out.write("  float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav input[type=text] {\n");
      out.write("  padding: 6px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .search-container button {\n");
      out.write("  float: right;\n");
      out.write("  padding: 6px 10px;\n");
      out.write("  margin-top: 8px;\n");
      out.write("  margin-right: 16px;\n");
      out.write("  background: whitesmoke;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav .search-container button:hover {\n");
      out.write("  background: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("  .topnav .search-container {\n");
      out.write("    float: none;\n");
      out.write("  }\n");
      out.write("  .topnav a, .topnav input[type=text], .topnav .search-container button {\n");
      out.write("    float: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("    width: 100%;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 14px;\n");
      out.write("  }\n");
      out.write("  .topnav input[type=text] {\n");
      out.write("    border: 1px solid #ccc;  \n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body><table border='0' bgcolor='#20B2AA' align='top' width='100%' height:75px >\n");
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
      out.write("            <div class=\"topnav\">\n");
      out.write("  <a href=tv.jsp>Electronics Gadgets</a>\n");
      out.write("  <a href=mobile.jsp>Mobiles & Laptops</a>\n");
      out.write("  <a href=hnf.jsp>Home Furniture</a>\n");
      out.write("  <a href=women.jsp>Women fashion</a>\n");
      out.write("  <a href=men.jsp>Men Fashion</a>\n");
      out.write("   <a href=kid.jsp>kids</a>\n");
      out.write("  <div class=\"search-container\">\n");
      out.write("    <form action=\"search.jsp\">\n");
      out.write("      <input type=\"text\" placeholder=\"Search..\" name=\"search\">\n");
      out.write("      <button type=\"search\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
