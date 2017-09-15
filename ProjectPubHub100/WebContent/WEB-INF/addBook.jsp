<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<!-- Header File -->
<div class="w3-container">
  <h1 class="w3-bar-item w3-text-deep-orange" style="text-shadow:1px 1px 0 #444">
  <font color=darkgrey>R</font><font color=orange>e</font><font color=darkgrey>v</font><font color=orange>a</font><font color=darkgrey>t</font><font color=orange>u</font><font color=darkgrey>r</font><font color=orange>e </font><font color=skyblue>PubHub  </font><font color=skyblue>100 Project</font></h1>
  <img src="Revature-logo.png" class="w3-circle" alt="Revature Logo" style="width:50%">
</div>
<h2 align="center"><font color=skyblue>Add Book</font></h2>
<div class="w3-container">
<form action="AddBook" method="post">

<div class="form-group row">		
<label for="name" class="col-5 col-form-label">ISBN_13</label>		
<div class="col-5">				
<input class="form-control" type="text" id="isbn_13" name="isbn_13"required autofocus />			
</div>			
</div>
<br>			

<div class="form-group row">				
<label for="title" class="col-2 col-form-label">Title</label>				
<div class="col-5">					
<input class="form-control" type="text" id="title"name="title" required autofocus />			
</div>
</div>
<br>

<div class="form-group row">			
<label for="authorName" class="col-2 col-form-label">Author</label>			
<div class="col-5">				
<input class="form-control" type="text" id="authorName"name="authorName" required autofocus />		
</div>		
</div>

<br>
<div class="form-group row">		
<label for="content" class="col-2 col-form-label">Content</label>				
<div class="col-5">				
<input class="form-control" type="text" id="content"name="content" required autofocus />				
</div>
</div>	

<br>
<div class="form-group row">			
<label for="price" class="col-2 col-form-label">Book Price</label>			
<div class="col-5">
<input class="form-control" type="text" id="price" name="price"min="1" required />			
</div>		      
</div>	

<br>
<div class="form-group row">			
<label for="Status" class="col-2 col-form-label">Status</label>			
<div class="col-5">				
<input class="form-control" type="text" id="status"name="status" required autofocus />				
</div>
</div>

<br>
<div class="form-group row">		
<div class="col-5">		
  <!--<button class="w3-button w3-dark-grey w3-border w3-border-white w3-round-xxlarge w3-text-deep-orange">Add</button> -->
	<button onclick="location.href='BooksList.jsp'" type="button">
        <font size=4 color=skyblue >Add Book</font></button>		
</div>		
</div>	
</form>
</div>
 <button onclick="location.href='index.jsp'" type="button">
        <font size=4 color=orange >Take me to the Home Page</font></button>
</body>
</html>