package com.company.library.web.screens.book;

import com.company.library.entity.Book;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.components.actions.ExcelAction;

import javax.inject.Inject;
import java.util.Map;

/**
 * Books overview screen
 */
public class BookBrowse extends AbstractLookup {

    @Inject
    private Table<Book> booksTable;


    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        initBookTableActions();
    }

    private void initBookTableActions() {
        ((ExcelAction) booksTable.getActionNN(ExcelAction.ACTION_ID))
                .setFileName(getMessage("BookBrowse.excelFileName"));
    }
}