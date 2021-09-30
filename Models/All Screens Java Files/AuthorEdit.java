package com.company.library.web.screens.author;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.author.Author;

@UiController("library_Author.edit")
@UiDescriptor("author-edit.xml")
@EditedEntityContainer("authorDc")
@LoadDataBeforeShow
public class AuthorEdit extends StandardEditor<Author> {
}