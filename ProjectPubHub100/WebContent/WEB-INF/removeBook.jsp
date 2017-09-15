<%@page import="com.solai.DAOImpl.BooksDAOImpl"%>
<%@page import="com.solai.model.Books"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove Book</title>
</head>
<body>
	<div class="container">
<form action="RemoveBook" method="post">	
		
<table border="1" id="booktable" class="w3-striped w3-bordered w3-table-all w3-large">
			<thead>
			<tr>
					
<th><font color=darkgrey>ISBN_13</font></th>					
<th><font color=orange>Title</font></th>					
<th><font color=darkgrey>Author</font></th>
<th><font color=orange>Content</font></th>            					
<th><font color=orange>Price</font></th>
<th><font color=darkgrey>Status</font></th>									
<th><font color=orange>Delete</font></th>			
</tr>			
</thead>	
	<tbody>		
<%BooksDAOImpl booksDAOImpl = new BooksDAOImpl();
List<Books> listBooks = booksDAOImpl.getAllBooks();
request.setAttribute("ListofBooks", listBooks);%>
				
<c:forEach var="books" items="${ListofBooks}">		
	<tr>					
<td>${books.isbn_13}</td>					
<td>${books.title}</td>					
<td>${books.author}</td>
<td>${books.content}</td>
<td>${books.price}</td>					
<td>${books.status}</td>					
<td>
<a href="<%=request.getContextPath()%>/RemoveBook?id=${books.isbn_13}"class="btn btn-primary a-btn-slide-text"> 
				
</a>
</td>
					
</tr>
			
	</c:forEach>
			
</tbody>
		
</table>
	
	<button onclick="location.href='BooksList.jsp'" type="button">
        <font size=5 color=skyblue >Remove this Book</font></button>	
<br>
	</form>
</div>
 <button onclick="location.href='index.jsp'" type="button">
        <font size=5 color=orange >Take me to the Home Page</font></button>
</body>

</html>