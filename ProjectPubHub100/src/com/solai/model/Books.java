package com.solai.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Books 
{
	private String isbn_13;
	private int id;
	private String title;
	private String author;
	private LocalDate publish_Date;
	private byte[] content;
	private double price;
	private String status;
	
	
	// Getters ans Setters
	public String getIsbn_13() {
		return isbn_13;
	}
	public void setIsbn_13(String isbn_13) {
		this.isbn_13 = isbn_13;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getPublishDate() {
		return publish_Date;
	}
	public void setPublishDate(LocalDate publish_Date) {
		this.publish_Date = publish_Date;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] string) {
		this.content = string;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double d) {
		this.price = d;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Books [isbn_13=" + isbn_13 + ", id=" + id + ", title=" + title + ", author=" + author
				+ ", publish_Date=" + publish_Date + ", content=" + Arrays.toString(content) + ", price=" + price
				+ ", status=" + status + "]";
	}
	
}
