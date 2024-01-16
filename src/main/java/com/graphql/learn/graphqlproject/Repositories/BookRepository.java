package com.graphql.learn.graphqlproject.Repositories;

import com.graphql.learn.graphqlproject.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Integer> {
}
