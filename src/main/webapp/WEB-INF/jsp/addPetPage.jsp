<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.tableadd
{
width: 40%;
border-style:1px solid;
border: 1px;
border-collapse: collapse;
vertical-align:middle;
border-color: white;
}
.textfieldadd
{
width: 580px;
}
.headeradd
{
background-color: rgba(185,185,185,2);
color: white;
border-right-color: rgba(185,185,185,2);
border-left-color: rgba(185,185,185,2);
border-top-color: rgba(185,185,185,2);
border-bottom-color: rgba(185,185,185,2);
}
.buttonborderadd
{
border-color: black;
}
.buttonadd
{
background-color: rgba(100,177,255,2);
border-color: rgba(100,177,255,2);
color: white;
}
.fontadd
{
font-family: sans-serif;
font-size: 12px;
}
.mainlabeladd
{
font-style: italic;
font-weight: 600px;
font-size: 18px;
}
.divadd
{
margin-top: 7%;
}
</style>
</head>
<body>
<div class="divadd">
<form action="">
<table class="tableadd" align="center" border="1">
<tr>
<td class="headeradd">Pet Information</td>
<td align="right" class="headeradd"></td>
</tr>
<tr>
<td colspan="2"class="fontadd" style="font-size: 14px;"><pre/>Name<pre/></td>
</tr>
<tr>
<td colspan="2"> <input type="text" class="textfieldadd"/> <pre/></td>
</tr>
<tr>
<td colspan="2"class="fontadd">Age<pre/></td>
</tr>
<tr>
<td colspan="2"> <input type="text" class="textfieldadd"/> <pre/></td>
</tr>
<tr>
<td colspan="2"class="fontadd">Place<pre/></td>
</tr>
<tr>
<td colspan="2"> <input type="text" class="textfieldadd"/> <pre/></td>
</tr>
<tr>
<td colspan="2">
<table align="center">
<tr>
<td><input type="button" value="Add Pet" class="buttonadd"/> </td>
<td><input type="button" value="Cancel" class="buttonadd"/></td>
</tr>
</table>
 

</td>
</tr>
</table>
</form>
</div>
</body>
</html>