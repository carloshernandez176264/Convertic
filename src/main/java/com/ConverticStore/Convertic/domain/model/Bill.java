package com.ConverticStore.Convertic.domain.model;

import java.util.Date;

public class Bill {

    private Integer id;

    private Integer numberBill;

    private Date date;

    private String status;

    private ShoppingCart shoppingCart;

    private City city;

    public Bill(Integer numberBill, Date date, String status, ShoppingCart shoppingCart, City city) {
        this.numberBill = numberBill;
        this.date = date;
        this.status = status;
        this.shoppingCart = shoppingCart;
        this.city = city;
    }

    public Integer getNumberBill() {
        return numberBill;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public City getCity() {
        return city;
    }
}
