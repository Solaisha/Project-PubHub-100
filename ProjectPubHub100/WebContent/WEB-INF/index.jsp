<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<body>
<!--Header Jsp file-->
<jsp:include page="header.jsp">
</jsp:include>
<!-- Side Navbar -->
<div class="w3-sidebar w3-dark-grey w3-bar-block" style="width:25%">

  <h2 class="w3-bar-item w3-text-black" style="text-shadow:1px 1px 0 #444"><b>Menu</b></h2>
  <a href="index.jsp" class="w3-bar-item w3-button w3-text-deep-orange">Home</a>
  <a href="addBook-jsp" class="w3-bar-item w3-button w3-text-deep-orange" >Add a Book</a>
  <a href="removeBook.jsp" class="w3-bar-item w3-button w3-text-deep-orange">Delete a Book</a>
    <a href="updateBook.jsp" class="w3-bar-item w3-button w3-text-deep-orange">Update a Book</a>
     <a href="listBooks.jsp" class="w3-bar-item w3-button w3-text-deep-orange">List of Books</a>
</div>

<!-- Page Content -->
<div style="margin-left:25%">

<div class="w3-container w3-deep-orange">
  <h1>Pubhub 100 project</h1>
</div>

<img src="Revature-logo.png" alt="RevatureLogo" style="width:100%">

<div class="w3-container w3-deep-orange">
<h2 class=" w3-text-dark-grey" style="text-shadow:1px 1px 0 #444">Welcome to Pubhub 100</h2>

<p>For this project, you will be extending the <b>Book Publishing System of PubHub, a self-publishing platform that allows anyone to write, publish, and sell their own books.</b> You will be provided with an application that comprises the basic functionality for uploading and downloading files from the PubHub database, and it will be your responsibility to add a tagging system. Users should be able to add descriptive tags to books, and then search the application for books based on those tags. You will have to modify the database to support this new data, and write the code that not only stores and retrieves this information to and from the database, but also displays it for a user and allows them to manipulate it through an online interface.

</p>
</div>

</div>
      
</body>
</html>


