package com.solai.dao;

import java.util.List;

import com.solai.model.BookTag;

public interface BookTagDAO 
{
	public boolean addTag(BookTag bookTag);
	public boolean removeTag(BookTag bookTag);
	public boolean updateTag(BookTag bookTag);
	
	public List<BookTag> retrieveAllBookDetails();
}
