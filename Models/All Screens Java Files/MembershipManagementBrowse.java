package com.company.library.web.screens.membershipmanagement;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.membership_management.MembershipManagement;

@UiController("library_MembershipManagement.browse")
@UiDescriptor("membership-management-browse.xml")
@LookupComponent("membershipManagementsTable")
@LoadDataBeforeShow
public class MembershipManagementBrowse extends StandardLookup<MembershipManagement> {
}