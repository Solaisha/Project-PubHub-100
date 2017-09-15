package com.solai.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solai.DAOImpl.BooksDAOImpl;
import com.solai.model.Books;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
						//Adding a Book
		
		String isbn_13=request.getParameter("isbn_13");
		String title=request.getParameter("title");
		String author=request.getParameter("author");
		//byte content=Byte.parseByte(request.getParameter("content"));
		Float price=Float.parseFloat(request.getParameter("price"));
		String status=request.getParameter("status");
		
		Books books=new Books();
		books.setIsbn_13(isbn_13);
		books.setTitle(title);
		books.setAuthor(author);
		//books.setContent();
		books.setPrice(price);
		books.setStatus(status);
		BooksDAOImpl booksDAOImpl=new BooksDAOImpl();
		try
		{
			booksDAOImpl.addBook(books);
			List <Books> listBooks=booksDAOImpl.getAllBooks();
			request.setAttribute("ListofBooks", listBooks);
			request.getRequestDispatcher("BooksList.jsp").forward(request, response);;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
