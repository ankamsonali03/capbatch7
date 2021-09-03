package com.jpademo.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jpademo.entity.Book;

public class BookMain {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("CAP-DB");
		EntityManager em = emf.createEntityManager();
		
//		em.getTransaction().begin();
//		Book newBook = new Book();
//		newBook.setTitle("Spring notes");
//		newBook.setAuthor("Krim");
//		newBook.setPrice(4000.20);
//		
//		em.persist(newBook);
//		
//		em.getTransaction().commit();
		
		TypedQuery<Book>  query1 = em.createQuery("select b from Book b",Book.class);
		
		List<Book> books = query1.getResultList();
		
		books.forEach(b -> System.out.println(b.getId()+" "+b.getTitle()+" "+b.getPrice()+" "+b.getAuthor()));
		
		TypedQuery<Book>  query2 = em.createQuery("select b from Book b where b.title = ?1",Book.class);
		query2.setParameter(1, "Java In Action");
		
		Book book = query2.getSingleResult();
		
		System.out.println(book.getId()+" "+book.getTitle()+" "+book.getPrice()+" "+book.getAuthor());
		
		
		TypedQuery<Book>  query3 = em.createNamedQuery("getAllBooks", Book.class);
		List<Book> booklist = query3.getResultList();
		
		
		em.close();
		emf.close();
		
	
	}

}
