s<HTML>

<%@ page language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.lang.*" %>

<%@ page session="true" %>
<% 
	String TicketId = request.getParameter("TicketId");
	String Travels = request.getParameter("Travels");	
%>
<head>
	<LINK href="styles.css" type="text/css" rel="stylesheet">
	<script LANGUAGE="Javascript" SRC="Images/AjaxCall.js"></script>

<SCRIPT LANGUAGE="JavaScript">
</SCRIPT>
<head>
<body Class='SC'>

<TABLE width="90%" class='notepad' align='center'>
<TR>
	<TD align=left colspan=2><IMG SRC="ej/EJ.GIF"  BORDER="0" ALT="" width=300></TD>
</TR>
</TABLE>
<FORM ACTION="">
<input type='Hidden' name='TicketId' value="<%=TicketId%>">
<TABLE width="90%" class='notepad' align='center' cellpadding=2 cellspacing=2>
<%

/*Declaration of variables*/

Connection con=null;
Statement stmt=null;
ResultSet rs=null;

try
{
	/*Connection to MySQL database is made with JDBC class one driver*/
	
	con = com.ewheelz.ConnectionPool.getConnection();
	stmt =  con.createStatement();
	String Query = "Select * from ticketdetails'";
	System.out.println(" Qry->"+Query);
	rs = stmt.executeQuery(Query);
	int count=0,NumRows=0;
	while(rs.next()){NumRows++;}
	rs.beforeFirst();
	while(rs.next()){

					TicketId=rs.getString(1);
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
		%>
		<table align="center" name="books" border=1>
		
	<thead align=center ><h2> Ticket Booking Details</H2> </thead>
	
	 <th>Ticket ID</th><th>Route ID</th><th>CustomerID</th><th>From</th><th>To</th><th>Journey Date</th><th>StartTime</th><th>ReachTime</th><th>Seats</th><th>BoardingPoint</th><th>NetAmount</th><th>Status</th><th>PaymentId</th><th>BusId</th>
	 <tr>
	 <td><%=TicketId%></td></tr>
	 </table>
	<%
	}
	System.out.println(count+" routes found");
}
catch(Exception e)
{
	System.out.println("Exception"+e);
}
%>
</FORM>
</BODY>
</HTML>