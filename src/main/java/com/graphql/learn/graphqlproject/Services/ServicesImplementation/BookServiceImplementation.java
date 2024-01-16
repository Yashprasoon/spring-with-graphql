package com.graphql.learn.graphqlproject.Services.ServicesImplementation;

import com.graphql.learn.graphqlproject.Models.Books;
import com.graphql.learn.graphqlproject.Repositories.BookRepository;
import com.graphql.learn.graphqlproject.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookServiceImplementation implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Books create(Books book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Books> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Books get(int bookId) {
        return bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
    }
}
