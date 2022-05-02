package com.question1;

import javax.persistence.EntityManager;

public class GetbookByid {

	public Book getbookId(EntityManager emt,int bookId) {
		return emt.find(Book.class, bookId);
	}
	
}
