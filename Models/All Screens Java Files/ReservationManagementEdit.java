package com.company.library.web.screens.reservationmanagement;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.reservation_management.ReservationManagement;

@UiController("library_ReservationManagement.edit")
@UiDescriptor("reservation-management-edit.xml")
@EditedEntityContainer("reservationManagementDc")
@LoadDataBeforeShow
public class ReservationManagementEdit extends StandardEditor<ReservationManagement> {
}