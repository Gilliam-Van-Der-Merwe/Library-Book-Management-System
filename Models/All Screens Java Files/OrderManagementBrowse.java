package com.company.library.web.screens.ordermanagement;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.order_management.OrderManagement;

@UiController("library_OrderManagement.browse")
@UiDescriptor("order-management-browse.xml")
@LookupComponent("orderManagementsTable")
@LoadDataBeforeShow
public class OrderManagementBrowse extends StandardLookup<OrderManagement> {
}