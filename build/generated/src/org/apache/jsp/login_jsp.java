package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>login Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            button:hover {\n");
      out.write("    opacity: 0.8;\n");
      out.write("}\n");
      out.write(".submitbutton{\n");
      out.write("    padding:14px 20px;\n");
      out.write("    background-color: green;\n");
      out.write("}\n");
      out.write(".submitbutton, .resetbutton{\n");
      out.write("    float:left;\n");
      out.write("    width:50%\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2{\n");
      out.write("                color: navy; font-size: 50px;text-align:center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("function changeImage() {\n");
      out.write("    var image = document.getElementById('myImage');\n");
      out.write("    if (image.src.match(\"Images\\login.png\")) {\n");
      out.write("        image.src = \"Images/logout.jpg\";\n");
      out.write("    } else {\n");
      out.write("        image.src = \"Images\\login.png\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function login(){\n");
      out.write("        var name=document.loginform.username.value;\n");
      out.write("        if(name.length>2){\n");
      out.write("            alert(\"Welcome \" +name+\"!\");\n");
      out.write("            return true;\n");
      out.write("    }}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <form name=\"loginform\" action=\"LoginServlet\" method=\"post\" onsubmit=\"return login()\">\n");
      out.write("            <table >\n");
      out.write("                <tr>\n");
      out.write("                    <h2 >LOGIN FORM</h2>\n");
      out.write("                </tr>\n");
      out.write("            </table>  \n");
      out.write("            <table cellspacing='50' align='center'>\n");
      out.write("                <tr><td>User Name:</td>\n");
      out.write("                    <td colspan='2'><input type='text' name='signuser' placeholder=\"Enter name\" required autofocus></td>\n");
      out.write("                </td></tr>\n");
      out.write("                 <tr><td >Password:</td>  \n");
      out.write("                     <td colspan='2'> <input type='password' name='signpass1' placeholder=\"Enter password\" required autofocus></td>\n");
      out.write("                </tr> \n");
      out.write("                <tr><td> Role:</td><td><input type=\"radio\" value=\"administrator\" name=\"role\">Administrator\n");
      out.write("                    <input type=\"radio\" value=\"users\" name=\"role\">User</td></tr>\n");
      out.write("            <tr colspan='2'><td><input type='submit' value='login' >\n");
      out.write("                    <td><input type='reset' value='cancel'></tr>\n");
      out.write("                    <tr> <td><a href=\"signup.jsp\">New User</a></td></tr>\n");
      out.write("            </table>\n");
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
