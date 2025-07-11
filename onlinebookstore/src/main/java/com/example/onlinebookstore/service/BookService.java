package com.example.onlinebookstore.service;

import com.example.onlinebookstore.model.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);
    Book updateBook(Long id, Book book);
}
