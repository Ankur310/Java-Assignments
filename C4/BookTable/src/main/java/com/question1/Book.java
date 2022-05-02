package com.question1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    
	@Id
	private int bookId;
	private String bookName;
	private String bookauthor;
	private int price;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookauthor=" + bookauthor + ", price=" + price
				+ "]";
	}
	
	
	
	
}
