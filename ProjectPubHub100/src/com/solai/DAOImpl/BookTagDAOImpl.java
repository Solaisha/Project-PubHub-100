package com.solai.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.solai.dao.BookTagDAO;
import com.solai.model.BookTag;
import com.solai.model.Books;
import com.solai.util.ConnectionUtility;

public class BookTagDAOImpl implements BookTagDAO
{
	Connection connection=null;
	PreparedStatement stmt=null;
	@Override
	public boolean addTag(BookTag bookTag) 
	{
		try
		{
			connection=ConnectionUtility.getConnection();
			String sql="INSERT INTO BOOK_TAGS(ISBN_13,TAG_NAME)VALUES(?,?)";
			stmt=connection.prepareStatement(sql);
			
			stmt.setString(1, bookTag.getIsbn_13().getIsbn_13());
			stmt.setString(2, bookTag.getTagName());
		
			int rows=stmt.executeUpdate();
			System.out.println("Number of rows:"+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean removeTag(BookTag bookTag) 
	{
	try
	{
		connection=ConnectionUtility.getConnection();
		String sql="DELETE FROM BOOK_TAGS WHERE ISBN_13=?";
		stmt=connection.prepareStatement(sql);
		
		stmt.setString(1, bookTag.getIsbn_13().getIsbn_13());

		int rows=stmt.executeUpdate();
		System.out.println("Number of rows:"+rows);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		return true;
	}
	@Override
	public boolean updateTag(BookTag bookTag) 
	{
		try
		{
			connection=ConnectionUtility.getConnection();
			String sql="UPDATE BOOK_TAGS SET TAG_NAME=? WHERE ISBN_13=?";
			stmt=connection.prepareStatement(sql);
			
			stmt.setString(1, bookTag.getTagName());
			stmt.setString(2, bookTag.getIsbn_13().getIsbn_13());
			
			int rows=stmt.executeUpdate();
			System.out.println("Number of rows:"+rows);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return true;
	}
	@Override
	public List<BookTag> retrieveAllBookDetails() 
	{
		List <BookTag> bookTagObj=new ArrayList<>();
		try
		{
			connection=ConnectionUtility.getConnection();
			String sql="SELECT BOOKS.`ISBN_13`,BOOKS.`TITLE`,BOOKS.`AUTHOR`,BOOKS.`PUBLISH_DATE`,BOOKS.`CONTENT`,BOOKS.`PRICE`,BOOKS.`STATUS`,BOOK_TAGS.`TAG_NAME` FROM BOOKS JOIN BOOK_TAGS ON BOOKS.`ISBN_13`=BOOK_TAGS.`ISBN_13`;";
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
				
				BookTag bookTag=new BookTag();
				books.setIsbn_13(rs.getString("isbn_13"));
				bookTag.setIsbn_13(books);
				bookTag.setTagName(rs.getString("tag_Name"));
				bookTagObj.add(bookTag);
				
			}
			rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return bookTagObj;
	}
	
	
	
	
}
