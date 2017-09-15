<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Book</title>
</head>
<body>
<!-- Header File -->
<div class="w3-container">
  <h1 class="w3-bar-item w3-text-deep-orange" style="text-shadow:1px 1px 0 #444">
  <font color=darkgrey>R</font><font color=orange>e</font><font color=darkgrey>v</font><font color=orange>a</font><font color=darkgrey>t</font><font color=orange>u</font><font color=darkgrey>r</font><font color=orange>e </font><font color=skyblue>PubHub  </font><font color=skyblue>100 Project</font></h1>
  <img src="Revature-logo.png" class="w3-circle" alt="Revature Logo" style="width:50%">
</div>

<h2 align="center"><font color=skyblue>Update Book</font></h2>

<div class="container">
<form action="UpdateBook" method="post">	

<div class="form-group row">
<label for="id" class="col-5 col-form-label"><font color=darkgrey>ISBN_13</font></label>
<div class="col-5">		
<input class="form-control" type="text" id="isbn_13" name="isbn_13"value="${books.isbn_13}"  />
</div>
</div>

<br>

<div class="form-group row">	
<label for="id" class="col-5 col-form-label"><font color=orange>Price</font></label>	
<div class="col-5">
<input class="form-control" type="text" id="priceid" name="price"value="${books.price}"/>
</div>
</div>

<br>

<div class="form-group row">
<label for="name" class="col-5 col-form-label"><font color=darkgrey>Status</font></label>
<div class="col-5">
<input class="form-control" type="text" id="staus" name="name"value="${books.status}" required autofocus />
</div>
</div>

<br>

<div class="form-group row">				
<div class="col-5">			
<button onclick="location.href='BooksList.jsp'" type="button">
<font size=3 color=skyblue>UpdateBook</font></button>	
</div>		
</div>	

</form>
</div>
 <button onclick="location.href='index.jsp'" type="button">
   <font size=4 color=orange >Take me to the Home Page</font></button>
</body>
</html>