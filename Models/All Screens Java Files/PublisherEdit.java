package com.company.library.web.screens.publisher;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.publisher.Publisher;

@UiController("library_Publisher.edit")
@UiDescriptor("publisher-edit.xml")
@EditedEntityContainer("publisherDc")
@LoadDataBeforeShow
public class PublisherEdit extends StandardEditor<Publisher> {
}