package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, String>{

}
