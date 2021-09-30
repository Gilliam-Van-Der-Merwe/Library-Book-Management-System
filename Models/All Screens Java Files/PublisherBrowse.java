package com.company.library.web.screens.publisher;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.publisher.Publisher;

@UiController("library_Publisher.browse")
@UiDescriptor("publisher-browse.xml")
@LookupComponent("publishersTable")
@LoadDataBeforeShow
public class PublisherBrowse extends StandardLookup<Publisher> {
}