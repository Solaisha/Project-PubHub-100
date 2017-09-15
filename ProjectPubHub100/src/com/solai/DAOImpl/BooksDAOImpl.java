package com.solai.DAOImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.solai.dao.BooksDAO;
import com.solai.model.Books;
import com.solai.util.ConnectionUtility;

public class BooksDAOImpl implements BooksDAO {

	Connection connection=null;
	PreparedStatement stmt=null;
	@Override
	public boolean addBook(Books books) {
		try {
			// Step 1:Get the connection
			connection=ConnectionUtility.getConnection();
			// Step 2:Query
			String sql="INSERT INTO BOOKS(ISBN_13,TITLE,AUTHOR,CONTENT,PRICE,STATUS) VALUES(?,?,?,?,?,?)";
			// Step :Set the Input
			stmt=connection.prepareStatement(sql);
			
			
			stmt.setString(1,books.getIsbn_13());
			stmt.setString(2,books.getTitle());
			stmt.setString(3,books.getAuthor());
			stmt.setBytes(4, books.getContent());
			stmt.setDouble(5, books.getPrice());
			stmt.setString(6, books.getStatus());
			
			// Step 4:Query Execution
			int rows=stmt.executeUpdate();
			System.out.println("Number of rows ="+rows);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return true;
	}
	@Override
	public boolean updateBook(Books books) 
	{
		try
		{
			connection=ConnectionUtility.getConnection();
			String sql="UPDATE BOOKS SET PRICE=?,STATUS=? WHERE ISBN_13=?";
			stmt=connection.prepareStatement(sql);
			
			stmt.setDouble(1, books.getPrice());
			stmt.setString(2, books.getStatus());
			stmt.setString(3, books.getIsbn_13());
			
			int rows=stmt.executeUpdate();
			System.out.println("Number of rows="+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	@Override
	public boolean deleteBook(Books books) 
	{
		try
		{
			connection=ConnectionUtility.getConnection();
			String sql="DELETE FROM BOOKS WHERE ID=?;";
			stmt=connection.prepareStatement(sql);
			
			stmt.setInt(1, books.getId());
			
			int rows=stmt.executeUpdate();
			System.out.println("Number of rows="+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	@Override
	public List<Books> getAllBooks() 
	{
		List <Books> listBooks=new ArrayList<>();
		try
		{
			connection=ConnectionUtility.getConnection();
			String sql="SELECT * FROM BOOKS";
			stmt=connection.prepareStatement(sql);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next())
			{
				Books books=new Books();
				books.setIsbn_13(rs.getString("isbn_13"));
				books.setTitle(rs.getString("title"));
				books.setAuthor(rs.getString("author"));
				books.setPublishDate(rs.getDate("publish_Date").toLocalDate());
				books.setContent(rs.getBytes("content"));
				books.setPrice(rs.getDouble("price"));
				books.setStatus(rs.getString("status"));
				
				listBooks.add(books);
			}
			rs.close();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return listBooks;
		}
}
	