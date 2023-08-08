package com.example.simplecache.service;

import com.example.simplecache.entity.Book;

public interface BookService {
    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}
