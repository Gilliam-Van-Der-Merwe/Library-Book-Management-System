package com.company.library.web.screens.author;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.author.Author;

@UiController("library_Author.browse")
@UiDescriptor("author-browse.xml")
@LookupComponent("authorsTable")
@LoadDataBeforeShow
public class AuthorBrowse extends StandardLookup<Author> {
}