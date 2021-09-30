package com.company.library.reservation_management;

import com.company.library.membership_management.MembershipManagement;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "LIBRARY_RESERVATION_MANAGEMENT")
@Entity(name = "library_ReservationManagement")
public class ReservationManagement extends StandardEntity {
    private static final long serialVersionUID = -4216799198397975849L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_RESERVATION_MANAGEMENT_MEMBERSHIP_MANAGEMENT_LINK",
            joinColumns = @JoinColumn(name = "RESERVATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "MEMBER_ID"))
    private List<MembershipManagement> reservationID;

    @Column(name = "RESERVATION_BOOK_TITLE", nullable = false)
    @NotNull
    private String reservationBookTitle;

    public void setReservationID(List<MembershipManagement> reservationID) {
        this.reservationID = reservationID;
    }

    public List<MembershipManagement> getReservationID() {
        return reservationID;
    }

    public void setReservationBookTitle(String reservationBookTitle) {
        this.reservationBookTitle = reservationBookTitle;
    }

    public String getReservationBookTitle() {
        return reservationBookTitle;
    }

}