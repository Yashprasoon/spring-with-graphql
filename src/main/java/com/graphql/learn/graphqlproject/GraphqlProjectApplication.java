package com.graphql.learn.graphqlproject;

import com.graphql.learn.graphqlproject.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.graphql.learn.graphqlproject.Models.Books;

import java.awt.print.Book;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Books b1 = new Books();
		b1.setTitle("Complete Reference");
		b1.setDesc("For learning java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("XYZ");

		Books b2 = new Books();
		b2.setTitle("Think Java");
		b2.setDesc("For learning java");
		b2.setPages(3000);
		b2.setPrice(5000);
		b2.setAuthor("ABC");


		Books b3 = new Books();
		b3.setTitle("Head first to java");
		b3.setDesc("For starting java concepts");
		b3.setPages(1000);
		b3.setPrice(2000);
		b3.setAuthor("PQR");

		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
}
