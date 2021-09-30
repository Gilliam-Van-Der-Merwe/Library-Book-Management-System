package com.company.library.web.screens.librarysystemadministrator;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.library_system_administrator.LibrarySystemAdministrator;

@UiController("library_LibrarySystemAdministrator.browse")
@UiDescriptor("library-system-administrator-browse.xml")
@LookupComponent("librarySystemAdministratorsTable")
@LoadDataBeforeShow
public class LibrarySystemAdministratorBrowse extends StandardLookup<LibrarySystemAdministrator> {
}