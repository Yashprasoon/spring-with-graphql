package com.graphql.learn.graphqlproject.Services;

import com.graphql.learn.graphqlproject.Models.Books;

import java.awt.print.Book;
import java.util.List;

public interface BookService {

    // create
    Books create(Books books);

    //get all
    List<Books> getAll();


   // get single book
    Books get(int bookId);
}
