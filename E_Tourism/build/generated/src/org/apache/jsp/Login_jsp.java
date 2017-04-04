package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<HTML>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\t<LINK href=\"styles.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<BODY onload=\"document.LOGIN.Name.focus();\" CLASS=\"SC\">\r\n");
      out.write("<FORM NAME='LOGIN' ACTION=\"Validate.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<TABLE align='left'  cellspacing=0 cellpadding=0>\r\n");
      out.write("<TR>\r\n");
      out.write("\t<TD><FONT SIZE=\"-1\" COLOR=\"#CC0099\"><B>Login:</B></FONT>&nbsp;&nbsp;<FONT size=\"-2\" COLOR=\"#CC0099\" face='verdana'>UserName</FONT></TD>\r\n");
      out.write("\t<TD><INPUT TYPE=\"text\" NAME=\"Name\" class='TextField' size=\"8\"></TD>\r\n");
      out.write("\t<TD><FONT size=\"-2\" COLOR=\"#CC0099\" face='verdana'>Password</FONT></TD>\r\n");
      out.write("\t<TD><INPUT TYPE=\"password\" NAME=\"Pwd\" class='TextField' size=\"8\"></TD>\r\n");
      out.write("        <TD><BUTTON TYPE=\"submit\" formtarget=\"_blank\"><IMG SRC=\"Images/Menu/Go1.jpg\" WIDTH=\"50\" HEIGHT=\"15\" BORDER=\"0\" onmouseover='this.src=\"Images/Menu/Go2.jpg\"' onmouseout='this.src=\"Images/Menu/Go1.jpg\"'/></button></TD>\r\n");
      out.write(" </TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
