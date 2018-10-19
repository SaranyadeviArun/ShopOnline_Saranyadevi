package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class tv3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function(){\n");
      out.write("        //update buttons\n");
      out.write("        $(\"button\").button().click(function(){\n");
      out.write("            var dom = $(\"input#\" + $(this).attr(\"id\"));\n");
      out.write("            \n");
      out.write("            if($(this).attr(\"class\").indexOf(\"decrease\") > -1){\n");
      out.write("                if(dom.val() > 1){\n");
      out.write("                    dom.val(dom.val() - 1);\n");
      out.write("                }\n");
      out.write("            } else {\n");
      out.write("                dom.val(parseInt(dom.val()) + 1);\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $(\"#update\").click(function(){\n");
      out.write("            var update = \"\";\n");
      out.write("\n");
      out.write("            $(\".info\").each(function(){\n");
      out.write("                if($(this).attr(\"type\") == \"hidden\" || $(this).attr(\"type\") == \"text\"){\n");
      out.write("                    update += $(this).val();\n");
      out.write("                } else {\n");
      out.write("                    update += $(this).attr(\"checked\");\n");
      out.write("                }\n");
      out.write("                if($(this).index(\".info\") < $(\".info\").size() - 1){\n");
      out.write("                    update += \",\";\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //if update string not empty, update shopping cart details\n");
      out.write("            if(update.length > 0){\n");
      out.write("                window.location = 'UpdateCart?update=' + update;\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<table class=\"cart_table\">\n");
      out.write("    <tr class=\"cart_title\">\n");
      out.write("        <td>Title</td>\n");
      out.write("        <td>Unit price</td>\n");
      out.write("        <td>Quantity</td>\n");
      out.write("        <td>Total</td>\n");
      out.write("        <td>Remove?</td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"3\" class=\"cart_total\"><span class=\"red\">TOTAL:</span></td>\n");
      out.write("        <td>");
      if (_jspx_meth_fmt_formatNumber_3(_jspx_page_context))
        return;
      out.write("</td>\n");
      out.write("        <td/>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<a href=\"category.jsp\" class=\"continue\">&lt; continue</a>\n");
      out.write("<a href=\"#\" class=\"update\" id=\"update\">update</a>\n");
      out.write("<a href=\"checkout.jsp\" class=\"checkout\">checkout &gt;</a>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("line");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <input type=\"hidden\" class=\"info\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.bookId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" id=\"a");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\n");
          out.write("        <tr>\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart_books[status.index].title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("            <td>");
          if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("            <td><button id=\"q");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"decrease\">-</button><input type=\"text\" class=\"info\" value=\"");
          if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\" id=\"q");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" size=\"3\" readonly=\"readonly\" /><button id=\"q");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"increase\">+</button></td>\n");
          out.write("            <td>");
          if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("            <td><input type=\"checkbox\" class=\"info\" /></td>\n");
          out.write("        </tr>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.unitPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setType("currency");
    _jspx_th_fmt_formatNumber_0.setCurrencyCode("USD");
    _jspx_th_fmt_formatNumber_0.setCurrencySymbol("$");
    _jspx_th_fmt_formatNumber_0.setMinFractionDigits(1);
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(2);
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setType("number");
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${line.unitPrice * line.quantity}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_2.setType("currency");
    _jspx_th_fmt_formatNumber_2.setCurrencyCode("USD");
    _jspx_th_fmt_formatNumber_2.setCurrencySymbol("$");
    _jspx_th_fmt_formatNumber_2.setMinFractionDigits(1);
    _jspx_th_fmt_formatNumber_2.setMaxFractionDigits(2);
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent(null);
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_3.setType("currency");
    _jspx_th_fmt_formatNumber_3.setCurrencyCode("USD");
    _jspx_th_fmt_formatNumber_3.setCurrencySymbol("$");
    _jspx_th_fmt_formatNumber_3.setMinFractionDigits(1);
    _jspx_th_fmt_formatNumber_3.setMaxFractionDigits(2);
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxFractionDigits_currencySymbol_currencyCode_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }
}
