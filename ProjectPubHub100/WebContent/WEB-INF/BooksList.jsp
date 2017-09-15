<%@page import="com.solai.model.Books"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>

<!--**DataTable()**JQuery line for diplaying all the Entries in the list, The "Previous and Next Buttons" and also the "Search box" -->
<script>
	$(document).ready(function() 
	{
		$('#booksListTable').DataTable();
	});
</script>
</head>
<body>

<!-- Header File -->
<div class="w3-container">
  <h1 class="w3-bar-item w3-text-deep-orange" style="text-shadow:1px 1px 0 #444">
  <font color=darkgrey>R</font><font color=orange>e</font><font color=darkgrey>v</font><font color=orange>a</font><font color=darkgrey>t</font><font color=orange>u</font><font color=darkgrey>r</font><font color=orange>e </font><font color=skyblue>PubHub  </font><font color=skyblue>100 Project</font></h1>
  <img src="Revature-logo.png" class="w3-circle" alt="Revature Logo" style="width:50%">
</div>

<h2 align="center"><font color=skyblue>Entire Books List are displyed below</font></h2>
<br>

<div class="container">	
<table border="1" id="booksListTable" class="table bordered">
			
<thead>			
<tr>			
<th><font color=darkgrey>ISBN_13</font></th>					
<th><font color=orange>Title</font></th>					
<th><font color=darkgrey>Author</font></th>
<th><font color=orange>Content</font></th>            					
<th><font color=darkgrey>Published Date</font></th>
<th><font color=orange>Price</font></th>
<th><font color=darkgrey>Status</font></th>			
</tr>		
</thead>	
	
<tbody>			
<c:forEach var="books" items="${ListofBooks}">		
<tr>					
<td>${books.isbn_13}</td>	
<td>${books.title}</td>		
<td>${books.author}</td>
<td>${books.content}</td>
<td>${books.publishedDate}</td>
<td>${books.price}</td>
<td>${books.status}</td>					
</tr>			
</c:forEach>	
</tbody>	
</table>
		</div>
        <button onclick="location.href='index.jsp'" type="button">
        <font size=5 color=orange >Take me to the Home Page</font></button>
</body>

</html>