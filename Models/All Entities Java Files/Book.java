package com.company.library.book;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "LIBRARY_BOOK")
@Entity(name = "library_Book")
@NamePattern("%s|bookTitle")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -8480666563281505122L;

    @Column(name = "BOOK_ID", nullable = false, unique = true)
    @NotNull
    private String bookID;

    @Column(name = "BOOK_ISBN", nullable = false)
    @NotNull
    private String bookISBN;

    @Column(name = "BOOK_TITLE", nullable = false)
    @NotNull
    private String bookTitle;

    @Column(name = "BOOK_AUTHOR", nullable = false)
    @NotNull
    private String bookAuthor;

    @Column(name = "BOOK_GENRE", nullable = false)
    @NotNull
    private String bookGenre;

    @Column(name = "BOOK_YEAR_PUBLISHED", nullable = false)
    @NotNull
    private String bookYearPublished;

    @Column(name = "BOOK_PUBLISHER", nullable = false)
    @NotNull
    private String bookPublisher;

    @Column(name = "BOOK_RATING")
    private Integer bookRating;

    @Column(name = "BOOK_LENGTH", nullable = false)
    @NotNull
    private Integer bookLength;

    @Column(name = "BOOK_BORROWED", nullable = false)
    @NotNull
    private Boolean bookBorrowed = false;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookYearPublished(String bookYearPublished) {
        this.bookYearPublished = bookYearPublished;
    }

    public String getBookYearPublished() {
        return bookYearPublished;
    }

    public void setBookLength(Integer bookLength) {
        this.bookLength = bookLength;
    }

    public Integer getBookLength() {
        return bookLength;
    }

    public Boolean getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(Boolean bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public Integer getBookRating() {
        return bookRating;
    }

    public void setBookRating(Integer bookRating) {
        this.bookRating = bookRating;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}