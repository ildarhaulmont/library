package com.company.library.web.screens.book;

import com.haulmont.cuba.core.global.PersistenceHelper;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.library.entity.Book;

/**
 * Books editor screen
 */
public class BookEdit extends AbstractEditor<Book> {

    @Override
    public void postInit() {
        super.postInit();

        setupTitle();
    }

    private void setupTitle() {
        setCaption(PersistenceHelper.isNew(getItem()) ?
                getMessage("BookEdit.caption.new") : formatMessage("BookEdit.caption.edit", getItem().getName()));
    }
}