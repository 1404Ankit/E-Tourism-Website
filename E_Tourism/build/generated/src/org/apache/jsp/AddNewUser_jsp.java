package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class AddNewUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<head>\r\n");
      out.write("\t<LINK href=\"styles.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("<!--\r\n");
      out.write("history.go(+1);\r\n");
      out.write("function validate(){\r\n");
      out.write(" x = document.NewUser.uid;\r\n");
      out.write(" y = document.NewUser.pwd;\r\n");
      out.write(" z = document.NewUser.auth;\r\n");
      out.write(" var ed=x.value;\r\n");
      out.write(" var pd=y.value;\r\n");
      out.write(" var ad=z.value;\r\n");
      out.write(" var pattern = /^([a-zA-Z0-9\\_\\. ]{4,8})$/;\r\n");
      out.write(" var Apattern = /^([0-3]{1})$/;\r\n");
      out.write(" if(!(pattern.test(ed))){\r\n");
      out.write("\talert(\"Invalid username\");\r\n");
      out.write("    return false;\r\n");
      out.write("\t}\r\n");
      out.write(" else if(!(pattern.test(pd))){\r\n");
      out.write("\talert(\"Invalid password\");\r\n");
      out.write("    return false;\r\n");
      out.write("\t}\r\n");
      out.write(" else if(!(Apattern.test(ad))){\r\n");
      out.write("\talert(\"Invalid Authentication\");\r\n");
      out.write("\treturn false;\r\n");
      out.write("  }\r\n");
      out.write(" else\r\n");
      out.write("   return true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<body Class=Grad>\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("\r\n");
      out.write("<BR><BR><br><br>\r\n");
      out.write("<FONT FACE=\"Century Gothic\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<FONT size=\"2\" color=\"blue\" FACE=\"Century Gothic\">\r\n");
      out.write("\r\n");
      out.write("<FORM NAME=\"NewUser\" ACTION=\"AddNewUser1.jsp\" METHOD=\"POST\" onsubmit=\"return validate()\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE Border=0 align=center>\r\n");
      out.write("<TR class=row_title ALIGN=\"center\">\r\n");
      out.write("\t   <TH COLSPAN=\"2\"> Add user</TH>\r\n");
      out.write("</TR>\r\n");
      out.write("\r\n");
      out.write("<TR class=row_even>\r\n");
      out.write("\t<TD>Userid * </TD>\r\n");
      out.write("\t<TD><input TYPE=text name=uid size=\"8\" maxlength=\"8\"></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TR class=row_odd>\r\n");
      out.write("\t<TD>Password * </TD>\r\n");
      out.write("\t<TD><input TYPE=password name=pwd size=\"8\"  maxlength=\"8\"></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("<TD><input type=hidden name=auth value=3>\r\n");
      out.write("<TR class=row_even>\r\n");
      out.write("\t<TD><INPUT TYPE=submit name=submit value=\"Submit\">\r\n");
      out.write("</TD>\r\n");
      out.write("\t<TD><INPUT TYPE=reset name=resett value=\"Reset\" > \r\n");
      out.write("</TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
