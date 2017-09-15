package com.solai.model;

public class BookTag 
{
	private Books isbn_13;
	private String tag_Name;
	public Books getIsbn_13() {
		return isbn_13;
	}
	public void setIsbn_13(Books isbn_13) {
		this.isbn_13 = isbn_13;
	}
	public String getTagName() {
		return tag_Name;
	}
	public void setTagName(String tag_Name) {
		this.tag_Name = tag_Name;
	}
	@Override
	public String toString() {
		return "BookTag [isbn_13=" + isbn_13 + ", tag_Name=" + tag_Name + "]";
	}
}
