package com.company.library.library_system_administrator;

import com.company.library.book.Book;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "LIBRARY_LIBRARY_SYSTEM_ADMINISTRATOR")
@Entity(name = "library_LibrarySystemAdministrator")
public class LibrarySystemAdministrator extends StandardEntity {
    private static final long serialVersionUID = 7453464760077079404L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_LIBRARY_SYSTEM_ADMINISTRATOR_BOOK_LINK",
            joinColumns = @JoinColumn(name = "ADMIN_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<Book> adminID;

    @Column(name = "ADMIN_NAME", nullable = false)
    @NotNull
    private String adminName;

    @Column(name = "ADMIN_SURNAME", nullable = false)
    @NotNull
    private String adminSurname;

    @Temporal(TemporalType.DATE)
    @Column(name = "ADMIN_BIRTH_DATE", nullable = false)
    @NotNull
    private Date adminBirthDate;

    @Column(name = "ADMIN_PHONE_NUMBER", unique = true)
    private String adminPhoneNumber;

    @Column(name = "ADMIN_EMAIL_ADDRESS", unique = true)
    private String adminEmailAddress;

    public void setAdminID(List<Book> adminID) {
        this.adminID = adminID;
    }

    public List<Book> getAdminID() {
        return adminID;
    }

    public String getAdminEmailAddress() {
        return adminEmailAddress;
    }

    public void setAdminEmailAddress(String adminEmailAddress) {
        this.adminEmailAddress = adminEmailAddress;
    }

    public String getAdminPhoneNumber() {
        return adminPhoneNumber;
    }

    public void setAdminPhoneNumber(String adminPhoneNumber) {
        this.adminPhoneNumber = adminPhoneNumber;
    }

    public Date getAdminBirthDate() {
        return adminBirthDate;
    }

    public void setAdminBirthDate(Date adminBirthDate) {
        this.adminBirthDate = adminBirthDate;
    }

    public String getAdminSurname() {
        return adminSurname;
    }

    public void setAdminSurname(String adminSurname) {
        this.adminSurname = adminSurname;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

}