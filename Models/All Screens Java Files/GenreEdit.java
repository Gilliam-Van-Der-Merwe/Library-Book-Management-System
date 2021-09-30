package com.company.library.web.screens.genre;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.genre.Genre;

@UiController("library_Genre.edit")
@UiDescriptor("genre-edit.xml")
@EditedEntityContainer("genreDc")
@LoadDataBeforeShow
public class GenreEdit extends StandardEditor<Genre> {
}