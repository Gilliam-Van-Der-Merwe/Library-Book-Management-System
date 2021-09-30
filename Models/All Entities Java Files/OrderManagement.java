package com.company.library.order_management;

import com.company.library.book.Book;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Table(name = "LIBRARY_ORDER_MANAGEMENT")
@Entity(name = "library_OrderManagement")
public class OrderManagement extends StandardEntity {
    private static final long serialVersionUID = -1583500716773857560L;

    @ManyToMany
    @JoinTable(name = "LIBRARY_ORDER_MANAGEMENT_BOOK_LINK",
            joinColumns = @JoinColumn(name = "ORDER__ID"),
            inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
    private List<Book> orderID;

    @Column(name = "ORDER_TITLE", nullable = false)
    @NotNull
    private String orderTitle;

    @Column(name = "ORDER_ISBN", nullable = false)
    @NotNull
    private String orderISBN;

    @Column(name = "ORDER_QUANTITY", nullable = false)
    @NotNull
    private Integer orderQuantity;

    @Column(name = "ORDER_SUPPLIER", nullable = false)
    @NotNull
    private String orderSupplier;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE_PLACED", nullable = false)
    @NotNull
    private Date orderDatePlaced;

    @Temporal(TemporalType.DATE)
    @Column(name = "ORDER_DATE_RECEIVED")
    private Date order_date_received;

    @Temporal(TemporalType.TIME)
    @Column(name = "ORDER_DURATION")
    private Date orderDuration;

    public Date getOrderDuration() {
        return orderDuration;
    }

    public void setOrderDuration(Date orderDuration) {
        this.orderDuration = orderDuration;
    }

    public void setOrderID(List<Book> orderID) {
        this.orderID = orderID;
    }

    public List<Book> getOrderID() {
        return orderID;
    }

    public Date getOrder_date_received() {
        return order_date_received;
    }

    public void setOrder_date_received(Date order_date_received) {
        this.order_date_received = order_date_received;
    }

    public Date getOrderDatePlaced() {
        return orderDatePlaced;
    }

    public void setOrderDatePlaced(Date orderDatePlaced) {
        this.orderDatePlaced = orderDatePlaced;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public String getOrderSupplier() {
        return orderSupplier;
    }

    public void setOrderSupplier(String orderSupplier) {
        this.orderSupplier = orderSupplier;
    }

    public String getOrderISBN() {
        return orderISBN;
    }

    public void setOrderISBN(String orderISBN) {
        this.orderISBN = orderISBN;
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle;
    }

}