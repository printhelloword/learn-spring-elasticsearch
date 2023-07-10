package com.phw.elasticsearch.model.service;

import com.phw.elasticsearch.model.Book;
import com.phw.elasticsearch.model.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAll();

    Book add(Book book);

    Book getById(String id);

    Book update(Book book, String id);

    void deleteById(String id);

}
