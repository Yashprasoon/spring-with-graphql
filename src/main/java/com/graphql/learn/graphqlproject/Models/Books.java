package com.graphql.learn.graphqlproject.Models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "project_books")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
