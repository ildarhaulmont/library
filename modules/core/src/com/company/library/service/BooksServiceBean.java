package com.company.library.service;

import com.company.library.entity.Book;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.View;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Realisation of books service
 */
@Service(BooksService.NAME)
public class BooksServiceBean implements BooksService {

    @Inject
    private DataManager dataManager;


    @Override
    public Book getNewestBook() {
        return dataManager.load(Book.class)
                .query("select e from lib$Book e order by e.createTs desc")
                .view(View.LOCAL)
                .maxResults(1)
                .optional()
                .orElse(null);
    }

    @Override
    public Book getOldestBook() {
        return dataManager.load(Book.class)
                .query("select e from lib$Book e order by e.createTs asc")
                .view(View.LOCAL)
                .maxResults(1)
                .optional()
                .orElse(null);
    }
}