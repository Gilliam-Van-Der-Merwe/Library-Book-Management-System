package com.company.library.author;

import com.company.library.book.Book;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Table(name = "LIBRARY_AUTHOR")
@Entity(name = "library_Author")
@NamePattern("%s|authorName")
public class Author extends StandardEntity {
    private static final long serialVersionUID = 7958970480714595066L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_AUTHOR_BOOK_LINK",
            joinColumns = @JoinColumn(name = "AUTHOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private @OnDelete(DeletePolicy.CASCADE)
    @OnDeleteInverse(DeletePolicy.CASCADE)
    Set<Book> authorID;

    @Column(name = "AUTHOR_NAME", nullable = false)
    @NotNull
    private String authorName;

    @Column(name = "AUTHOR_SURNAME", nullable = false)
    @NotNull
    private String authorSurname;

    @Temporal(TemporalType.DATE)
    @Column(name = "AUTHOR_BIRTH_DATE", nullable = false)
    @NotNull
    private Date authorBirthDate;

    public void setAuthorID(Set<Book> authorID) {
        this.authorID = authorID;
    }

    public Set<Book> getAuthorID() {
        return authorID;
    }

    public Date getAuthorBirthDate() {
        return authorBirthDate;
    }

    public void setAuthorBirthDate(Date authorBirthDate) {
        this.authorBirthDate = authorBirthDate;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}