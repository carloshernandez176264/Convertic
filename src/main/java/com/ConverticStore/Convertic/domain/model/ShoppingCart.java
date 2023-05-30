package com.ConverticStore.Convertic.domain.model;

import java.util.Date;

public class ShoppingCart {

    private Integer id;
    private Date date;
    private String status;
    private User user;
    private Products products;
    private Integer quantity;

    public ShoppingCart(Date date, String status, User user, Products products, Integer quantity) {
        this.date = date;
        this.status = status;
        this.user = user;
        this.products = products;
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Products getProducts() {
        return products;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
