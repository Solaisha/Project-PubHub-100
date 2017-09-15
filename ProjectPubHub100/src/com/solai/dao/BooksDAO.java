package com.solai.dao;

import java.util.List;

import com.solai.model.Books;

public interface BooksDAO 
{
	public boolean addBook(Books books);
	public boolean updateBook(Books books);
	public boolean deleteBook(Books books);
	
	public List <Books> getAllBooks();
}
