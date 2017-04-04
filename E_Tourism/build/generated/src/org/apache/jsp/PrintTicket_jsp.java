package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;

public final class PrintTicket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
 
	String TicketId = request.getParameter("TicketId");
	String Travels = request.getParameter("Travels");	

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t<LINK href=\"styles.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\t<script LANGUAGE=\"Javascript\" SRC=\"Images/AjaxCall.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<head>\r\n");
      out.write("<body Class='SC'>\r\n");
      out.write("\r\n");
      out.write("<TABLE width=\"90%\" class='notepad' align='center'>\r\n");
      out.write("<TR>\r\n");
      out.write("\t<TD align=left colspan=2><IMG SRC=\"ej/EJ1.jpg\"  BORDER=\"0\" ALT=\"\" width=300></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<FORM ACTION=\"\">\r\n");
      out.write("<input type='Hidden' name='TicketId' value=\"");
      out.print(TicketId);
      out.write("\">\r\n");
      out.write("<TABLE width=\"90%\" class='notepad' align='center' cellpadding=2 cellspacing=2>\r\n");


/*Declaration of variables*/

Connection con=null;
Statement stmt=null;
ResultSet rs=null;

try
{
	/*Connection to MySQL database is made with JDBC class one driver*/
	
	con = com.ewheelz.ConnectionPool.getConnection();
	stmt =  con.createStatement();
	String Query = "Select * from ticketdetails Where TicketId='"+TicketId+"' and Status='Booked'";
	System.out.println(" Qry->"+Query);
	rs = stmt.executeQuery(Query);
	int count=0,NumRows=0;
	while(rs.next()){NumRows++;}
	rs.beforeFirst();
	if(rs.next()){
					String RouteId=rs.getString(2);
					String CustomerId=rs.getString(3);
					String rFrom=rs.getString(4);
					String rTo=rs.getString(5);
					String JourneyDate=rs.getString(6);
					String StartTime=rs.getString(7);
					String ReachTime=rs.getString(8);
					String Seats=rs.getString(9);
					String BoardingPoint=rs.getString(10);
					String NetAmount=rs.getString(11);
					String Status=rs.getString(12);
					String PaymentId=rs.getString(13);
					String BusId=rs.getString(14);
		//Display header
		
      out.write("\r\n");
      out.write("\t\t\t<TR class=\"row_title\">\r\n");
      out.write("\t\t\t\t<TD align=left colspan=6>Ticket Details</TD>\r\n");
      out.write("\t\t\t</TR>\t\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD align=left colspan=1><B>Ticket Id</B></TD><TD align=left  colspan=5><B>");
      out.print(TicketId);
      out.write("</B></TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD align=left colspan=1><B>Travels</B></TD><TD align=left  colspan=5><B>");
      out.print(Travels);
      out.write("</B></TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR class=\"row_title\">\r\n");
      out.write("\t\t\t\t<TD align=left colspan=6 >Journey Details</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD align=left ><B>From</B></TD><TD align=left colspan=2>");
      out.print(rFrom);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD align=left><B>To</B></TD><TD align=left colspan=2>");
      out.print(rTo);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD align=left colspan=3><B>Journey Date</B></TD><TD align=left  colspan=3>");
      out.print(JourneyDate);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD align=left><B>Start Time</B></TD><TD align=left colspan=2>");
      out.print(StartTime);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD align=left><B>Reach Time</B></TD><TD align=left colspan=2>");
      out.print(ReachTime);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD align=left><B>Seats</B></TD><TD align=left colspan=2>");
      out.print(Seats);
      out.write("</TD>\r\n");
      out.write("\t\t\t\t<TD align=left><B>Boarding Point</B></TD><TD align=left  colspan=2>");
      out.print(BoardingPoint);
      out.write("</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR class=\"row_odd\">\r\n");
      out.write("\t\t\t\t<TD colspan=4 align=right><B><FONT COLOR=\"red\">Fare</FONT></B></TD><TD align=left  colspan=2><FONT COLOR=\"red\"><B>Rs. ");
      out.print(NetAmount);
      out.write("</B></FONT></TD>\r\n");
      out.write("\t\t\t</TR>\t\r\n");
      out.write("</TABLE>\r\n");
      out.write("<P align=right>\r\n");
      out.write("\t<A onclick=\"javascript:print();\" style=\"cursor:hand\"><IMG SRC=\"Images/printer1.jpg\" BORDER=\"0\" ALT=\"\"></A>\r\n");
      out.write("</P>\r\n");

	}else{
		
      out.write("<P align='CENTER'><IMG SRC=\"Images/error.gif\" WIDTH=\"17\" HEIGHT=\"13\" BORDER=\"0\" ALT=\"\"><FONT COLOR=\"red\" face='Georgia'>No tickets found.Please provide valid Ticket Id</FONT><BR>\r\n");
      out.write("\t\t\t<A HREF=\"ViewMyTicket.jsp\">&lt;&lt; Back</A>\r\n");
      out.write("\t\t</P>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

	}
	System.out.println(count+" routes found");
}
catch(Exception e)
{
	System.out.println("Exception"+e);
}

      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
