package com.company.library.web.screens.genre;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.genre.Genre;

@UiController("library_Genre.browse")
@UiDescriptor("genre-browse.xml")
@LookupComponent("genresTable")
@LoadDataBeforeShow
public class GenreBrowse extends StandardLookup<Genre> {
}