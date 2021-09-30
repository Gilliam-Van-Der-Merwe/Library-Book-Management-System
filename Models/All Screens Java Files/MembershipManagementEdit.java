package com.company.library.web.screens.membershipmanagement;

import com.haulmont.cuba.gui.screen.*;
import com.company.library.membership_management.MembershipManagement;

@UiController("library_MembershipManagement.edit")
@UiDescriptor("membership-management-edit.xml")
@EditedEntityContainer("membershipManagementDc")
@LoadDataBeforeShow
public class MembershipManagementEdit extends StandardEditor<MembershipManagement> {
}