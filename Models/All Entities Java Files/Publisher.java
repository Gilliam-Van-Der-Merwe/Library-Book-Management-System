package com.company.library.publisher;

import com.company.library.book.Book;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "LIBRARY_PUBLISHER")
@Entity(name = "library_Publisher")
public class Publisher extends StandardEntity {
    private static final long serialVersionUID = -6420595320147388536L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_PUBLISHER_BOOK_LINK",
            joinColumns = @JoinColumn(name = "PUBLISHER_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<Book> publisherID;

    @Column(name = "PUBLISHER_NAME", nullable = false, unique = true)
    @NotNull
    private String publisherName;

    public void setPublisherID(List<Book> publisherID) {
        this.publisherID = publisherID;
    }

    public List<Book> getPublisherID() {
        return publisherID;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherName() {
        return publisherName;
    }

}