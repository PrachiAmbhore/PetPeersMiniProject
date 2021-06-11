<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.table
{
width: 60%;
border-style:1px solid;
border: 1px;
border-collapse: collapse;
vertical-align:middle;
border-color: white;
}
.textfield
{
width: 820px;
}
.header
{
background-color: black;
color: white;
border-right-color: black;
border-left-color: black;
border-top-color: black;
border-bottom-color: black;
}
.buttonborder
{
border-color: black;
}
.button
{
background-color: rgba(100,177,255,2);
border-color: rgba(100,177,255,2);
color: white;
}
.font
{
font-family: sans-serif;
font-size: 12px;
}
.mainlabel
{
font-style: italic;
font-weight: 600px;
font-size: 18px;
}
.div
{
margin-top: 7%;
}
</style>
</head>
<body>
<div class="div">
<form action="authenticateUser">
<table class="table" align="center" border="1">
<tr>
<td class="header">Login Page</td>
<td align="right" class="header"><input type="button" value="Signup" class="header buttonborder"></td>
</tr>
<tr>
<td colspan="2" class="mainlabel"><pre/> Login<pre/></td>
</tr>
<tr>
<td colspan="2"class="font">Name<pre/></td>
</tr>
<tr>
<td colspan="2"> <input type="text" class="textfield"/> <pre/></td>
</tr>
<tr>
<td colspan="2" class="font"> Password<pre/></td>
</tr>
<tr>
<td colspan="2"> <input type="password" class="textfield"/> <pre/></td>
</tr>

<tr>
<td colspan="2"> <input type="button" value="Login" class="button"/> </td>
</tr>
<tr>
 <td style="font-style: italic; color: red;">${message}</td>
</tr>

</table>
</form>
</div>
</body>
</html>