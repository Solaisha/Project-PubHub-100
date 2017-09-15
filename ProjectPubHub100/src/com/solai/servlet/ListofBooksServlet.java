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
 * Servlet implementation class ListofBooksServlet
 */
@WebServlet("/ListofBooks")
public class ListofBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			BooksDAOImpl booksDAOImpl=new BooksDAOImpl();
			List <Books> listBooks=booksDAOImpl.getAllBooks();
			request.setAttribute("ListofBooks", listBooks);
			request.getRequestDispatcher("listBooks.jsp").forward(request, response);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
