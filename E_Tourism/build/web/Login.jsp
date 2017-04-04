<HTML>

<%@ page language="java" %>
<%@ page session="true" %>
<%@ page import="java.util.*" %>
<head>

	<LINK href="styles.css" type="text/css" rel="stylesheet">
</head>
<BODY onload="document.LOGIN.Name.focus();" CLASS="SC">
<FORM NAME='LOGIN' ACTION="Validate.jsp" method="post">

<TABLE align='left'  cellspacing=0 cellpadding=0>
<TR>
	<TD><FONT SIZE="-1" COLOR="#CC0099"><B>Login:</B></FONT>&nbsp;&nbsp;<FONT size="-2" COLOR="#CC0099" face='verdana'>UserName</FONT></TD>
	<TD><INPUT TYPE="text" NAME="Name" class='TextField' size="8"></TD>
	<TD><FONT size="-2" COLOR="#CC0099" face='verdana'>Password</FONT></TD>
	<TD><INPUT TYPE="password" NAME="Pwd" class='TextField' size="8"></TD>
        <TD><BUTTON TYPE="submit" formtarget="ResultFrame"><IMG SRC="Images/Menu/Go1.jpg" WIDTH="50" HEIGHT="15" BORDER="0" onmouseover='this.src="Images/Menu/Go2.jpg"' onmouseout='this.src="Images/Menu/Go1.jpg"'/></button></TD>
 </TR>
</TABLE>

</FORM>
</BODY>
</HTML>
