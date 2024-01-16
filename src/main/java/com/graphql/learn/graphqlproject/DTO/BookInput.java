package com.graphql.learn.graphqlproject.DTO;

import jakarta.persistence.*;
import lombok.*;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookInput {

    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
