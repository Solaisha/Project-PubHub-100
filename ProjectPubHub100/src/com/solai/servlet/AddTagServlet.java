package com.solai.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solai.DAOImpl.BookTagDAOImpl;
import com.solai.model.BookTag;
import com.solai.model.Books;

/**
 * Servlet implementation class AddTagServlet
 */
@WebServlet("/AddTag")
public class AddTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String isbn_13=request.getParameter("isbn_13");
		String tag_Name=request.getParameter("tag_Name");
		
		BookTag bookTag=new BookTag();
		Books books=new Books();
		books.setIsbn_13(isbn_13);
		bookTag.setIsbn_13(books);
		bookTag.setTagName(tag_Name);
		try
		{
			BookTagDAOImpl bookTagDAOImpl=new BookTagDAOImpl();
			bookTagDAOImpl.addTag(bookTag);
			List <BookTag> bookTagObj=bookTagDAOImpl.retrieveAllBookDetails();
			request.setAttribute("AddTag",bookTagObj);
			request.getRequestDispatcher("BookListTag.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
