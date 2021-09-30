package com.company.library.web.screens.librarysystemadministrator;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.library_system_administrator.LibrarySystemAdministrator;

@UiController("library_LibrarySystemAdministrator.edit")
@UiDescriptor("library-system-administrator-edit.xml")
@EditedEntityContainer("librarySystemAdministratorDc")
@LoadDataBeforeShow
public class LibrarySystemAdministratorEdit extends StandardEditor<LibrarySystemAdministrator> {
}