package com.company.library.membership_management;

import com.company.library.book.Book;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "LIBRARY_MEMBERSHIP_MANAGEMENT")
@Entity(name = "library_MembershipManagement")
public class MembershipManagement extends StandardEntity {
    private static final long serialVersionUID = 7379067020452876126L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_MEMBERSHIP_MANAGEMENT_BOOK_LINK",
            joinColumns = @JoinColumn(name = "MEMBER_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<Book> memberID;

    @Column(name = "MEMBER_NAME", nullable = false)
    @NotNull
    private String memberName;

    @Column(name = "MEMBER_SURNAME", nullable = false)
    @NotNull
    private String memberSurname;

    @Temporal(TemporalType.DATE)
    @Column(name = "MEMBER_BIRTHDATE", nullable = false)
    @NotNull
    private Date memberBirthdate;

    @Column(name = "MEMBER_PHONE_NUMBER", unique = true)
    private String memberPhoneNumber;

    @Column(name = "MEMBER_EMAIL_ADDRESS", unique = true)
    private String memberEmailAddress;

    @Column(name = "BORROW_STATUS", nullable = false)
    @NotNull
    private Boolean borrowStatus = false;

    public void setMemberID(List<Book> memberID) {
        this.memberID = memberID;
    }

    public List<Book> getMemberID() {
        return memberID;
    }

    public String getMemberEmailAddress() {
        return memberEmailAddress;
    }

    public void setMemberEmailAddress(String memberEmailAddress) {
        this.memberEmailAddress = memberEmailAddress;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public void setBorrowStatus(Boolean borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public Boolean getBorrowStatus() {
        return borrowStatus;
    }

    public Date getMemberBirthdate() {
        return memberBirthdate;
    }

    public void setMemberBirthdate(Date memberBirthdate) {
        this.memberBirthdate = memberBirthdate;
    }

    public String getMemberSurname() {
        return memberSurname;
    }

    public void setMemberSurname(String memberSurname) {
        this.memberSurname = memberSurname;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}