package com.company.library.service;

import com.company.library.entity.Book;

/**
 * Books service
 */
public interface BooksService {
    String NAME = "lib_BooksService";

    /**
     * @return libraries newest book
     */
    Book getNewestBook();

    /**
     * @return library oldest book
     */
    Book getOldestBook();
}