package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SignUp Page</title>\n");
      out.write("        <link rel=\"StyleSheet\" href=\"ESS.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                color: navy; font-size: 50px;text-align:center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            td{\n");
      out.write("                padding: 10px;\n");
      out.write("                border:2px antiquewhite;\n");
      out.write("            }\n");
      out.write("            #button{\n");
      out.write("                margin-left: 740px;\n");
      out.write("            }\n");
      out.write("            .tableform{\n");
      out.write("                padding: 16px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\">  \n");
      out.write("function validation(){  \n");
      out.write("     var name=document.signupform.signuser.value;\n");
      out.write("var firstpassword=document.signupform.signpass1.value;  \n");
      out.write("var secondpassword=document.signupform.signpass2.value;  \n");
      out.write("     \n");
      out.write("if (name==null || name==\"\"){ \n");
      out.write("    document.signupform.signuser.focus();\n");
      out.write("  alert(\"Name can't be blank\");  \n");
      out.write("  return false;  \n");
      out.write("}else if(firstpassword.length<6){  \n");
      out.write("  alert(\"Password must be at least 6 characters long.\");  \n");
      out.write("  return false;  \n");
      out.write("  }  \n");
      out.write("if(firstpassword==secondpassword){  \n");
      out.write("return true;  \n");
      out.write("}  \n");
      out.write("else{  \n");
      out.write("alert(\"password must be same!\");  \n");
      out.write("return false;  \n");
      out.write("}  \n");
      out.write("}\n");
      out.write("\n");
      out.write("function reset() {\n");
      out.write("    document.getElementByName(\"signupform\").reset();\n");
      out.write("}\n");
      out.write("</script>  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <h2>Sign Up Page</h2>\n");
      out.write("        \n");
      out.write("        <form name='signupform' target=\"_self\" method='post' action=\"SignUpServlet\" onsubmit=\"return validation()\">\n");
      out.write("\n");
      out.write("            <table cellspacing='10' align='center'>\n");
      out.write("                <tr><h4 align=\"center\" color:lightcoral > Enter the Details to become part of Shop Online</h4></tr>\n");
      out.write("            <tr><td>Name:</td> <td><input type=\"text\" name='signuser' ></td></tr>\n");
      out.write("                 <tr><td>Email:</td><td><input type=\"email\" name='signemail'></td></tr>\n");
      out.write("                 <tr><td>Password:</td><td><input type=\"password\" name='signpass1'></td></tr>\n");
      out.write("                 <tr><td>Repeat Password:</td><td><input type=\"password\" name='signpass2'></td></tr>\n");
      out.write("                 <tr><td><input type=\"submit\" value='SignUp' ></td>\n");
      out.write("                     <td><input type=\"reset\" value='Cancel' onclick=\"reset()\"></td></tr>\n");
      out.write("            </table> \n");
      out.write("      \n");
      out.write("        </form>\n");
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
