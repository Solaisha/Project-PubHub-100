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
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet("/UpdateBook")
public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String isbn_13=request.getParameter("isbn_13");
		Float price=Float.parseFloat(request.getParameter("price"));
		String status=request.getParameter("status");
		
		Books books =new Books();
		books.setIsbn_13(isbn_13);
		books.setPrice(price);
		books.setStatus(status);
		try
		{
			BooksDAOImpl booksDAOImpl=new BooksDAOImpl();
			booksDAOImpl.updateBook(books);
			List <Books> listBooks=booksDAOImpl.getAllBooks();
			request.setAttribute("ListofBooks", listBooks);
			request.getRequestDispatcher("BooksList.jsp").forward(request, response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}

}
