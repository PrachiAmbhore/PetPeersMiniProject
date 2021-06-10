<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script>
            $(document).ready(function() {
                $("#divaddpet").hide();
                $("#divmypet").show();
                $("#divbypet").hide();
               
            });


            $(document).ready(function() {
                $("#home").click(function() {
                	 $("#divaddpet").hide();
                     $("#divmypet").toggle();
                     $("#divbypet").hide();
                    
                   
                });
            });

            $(document).ready(function() {
                $("#mypet").click(function() {
                	 $("#divaddpet").hide();
                     $("#divmypet").hide();
                     $("#divbypet").toggle();
                    
                                  });
            });

            $(document).ready(function() {
                $("#addpet").click(function() {
                	 $("#divaddpet").toggle();
                     $("#divmypet").hide();
                     $("#divbypet").hide();
                                       
                });
            });

        </script>
<style type="text/css">
.table
{
width: 60%;
border-style:1px solid;
border: 1px;
border-collapse: collapse;
vertical-align:middle;
border-color: black;
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
<div >
<form action="">
<table class="table" align="center" border="1">
<tr>
<td class="header">
<table border="1" style="border-collapse: collapse; border-color: white;">
<tr>
<td class="header"  style="border-right-color: white;">Pet Shop  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </td>
<td  id="home">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Home&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td id="mypet">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;My Pet&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td id="addpet">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Add Pet&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
</tr>
</table>
</td>
<td align="right" class="header"><input type="button" value="Signup" class="header buttonborder"></td>
</tr>
<tr>
<td colspan="2">
<div id="divaddpet">
<jsp:include page="addPetPage.jsp"></jsp:include>
</div>
<div id="divmypet">
<jsp:include page="myPetsPage.jsp"></jsp:include>
</div>
<div id="divbypet">
<jsp:include page="petBuy.jsp"></jsp:include>
</div>
</td>
</tr>
</table>
</form>
</div>
</body>
</html>