package com.question1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookStore");
		
		EntityManager emt = emf.createEntityManager();
		
		//creating new book
		Book  book1 = new Book();
		book1.setBookId(1);
		book1.setBookName("Science");
		book1.setPrice(1000);
		book1.setBookauthor("HC Verma");
		
		//creating new book
		Book  book2 = new Book();
		book2.setBookId(2);
		book2.setBookName("Maths");
		book2.setPrice(2000);
		book2.setBookauthor("RD Sharma");
		
		//creating new book
		Book  book3 = new Book();
		book3.setBookId(3);
		book3.setBookName("Chemistry");
		book3.setPrice(2000);
		book3.setBookauthor("N Awasthi");
		
		emt.getTransaction().begin();
		
		emt.persist(book1);
		emt.persist(book2);
		emt.persist(book3);
		
		
		
		emt.getTransaction().commit();
		
		
		//getting book by id;
        GetbookByid get = new GetbookByid();
        Book b1 = get.getbookId(emt, 1);
        System.out.println(b1);
        
        
        emt.remove(book3);
        emt.getTransaction().begin();
        emt.remove(book3);
        emt.getTransaction().commit();
       
        
		
		emt.close();
	}

}
