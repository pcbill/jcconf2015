package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String ISBN;

    private String name;

    private String author;
}
