package com.company.library.genre;

import com.company.library.book.Book;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "LIBRARY_GENRE")
@Entity(name = "library_Genre")
public class Genre extends StandardEntity {
    private static final long serialVersionUID = 4337649852975164795L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_GENRE_BOOK_LINK",
            joinColumns = @JoinColumn(name = "GENRE_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<Book> genreID;

    @Column(name = "GENRE_TYPE", nullable = false, unique = true)
    @NotNull
    private String genreType;

    @Column(name = "GENRE_BOOK_QUANTITY", nullable = false)
    @NotNull
    private Integer genreBookQuantity;

    public Integer getGenreBookQuantity() {
        return genreBookQuantity;
    }

    public void setGenreBookQuantity(Integer genreBookQuantity) {
        this.genreBookQuantity = genreBookQuantity;
    }

    public void setGenreID(List<Book> genreID) {
        this.genreID = genreID;
    }

    public List<Book> getGenreID() {
        return genreID;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

}