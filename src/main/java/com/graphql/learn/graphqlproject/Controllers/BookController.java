package com.graphql.learn.graphqlproject.Controllers;

import com.graphql.learn.graphqlproject.DTO.BookInput;
import com.graphql.learn.graphqlproject.Models.Books;
import com.graphql.learn.graphqlproject.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    // create
    @MutationMapping("createBook")
    public Books create(@Argument BookInput book){
        Books books = new Books();
        books.setTitle(book.getTitle());
        books.setDesc(book.getDesc());
        books.setPrice(book.getPrice());
        books.setAuthor(book.getAuthor());
        books.setPages(book.getPages());
        return bookService.create(books);
    }

    // get all

    @QueryMapping("allBooks")
    public List<Books> getAll(){
        return this.bookService.getAll();
    }

    // get single book

    @QueryMapping("getBook")
    public Books get(@Argument int bookId){
        return this.bookService.get(bookId);
    }

}
