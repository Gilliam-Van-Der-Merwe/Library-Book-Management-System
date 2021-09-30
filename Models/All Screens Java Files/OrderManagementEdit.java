package com.company.library.web.screens.ordermanagement;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.order_management.OrderManagement;

@UiController("library_OrderManagement.edit")
@UiDescriptor("order-management-edit.xml")
@EditedEntityContainer("orderManagementDc")
@LoadDataBeforeShow
public class OrderManagementEdit extends StandardEditor<OrderManagement> {
}