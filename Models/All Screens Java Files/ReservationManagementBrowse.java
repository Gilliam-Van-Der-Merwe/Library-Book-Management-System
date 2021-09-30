package com.company.library.web.screens.reservationmanagement;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.reservation_management.ReservationManagement;

@UiController("library_ReservationManagement.browse")
@UiDescriptor("reservation-management-browse.xml")
@LookupComponent("reservationManagementsTable")
@LoadDataBeforeShow
public class ReservationManagementBrowse extends StandardLookup<ReservationManagement> {
}