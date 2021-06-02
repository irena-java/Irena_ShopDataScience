package com.datascience.shop.main.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Basket extends BaseEntity {
    private LocalDate dateCreateBasket;
    private User client;
    private StatusBasket statusBasket;
    private List<Item> items = new ArrayList<>();

    public Basket() {
            }

    public Basket(Integer id, LocalDate dateCreateBasket, User client, StatusBasket statusBasket, List<Item> items) {
        super(id);
        this.dateCreateBasket = dateCreateBasket;
        this.client = client;
        this.statusBasket = statusBasket;
        this.items = items;
    }

    public LocalDate getDateCreateBasket() {
        return dateCreateBasket;
    }

    public void setDateCreateBasket(LocalDate dateCreateBasket) {
        this.dateCreateBasket = dateCreateBasket;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public StatusBasket getStatusBasket() {
        return statusBasket;
    }

    public void setStatusBasket(StatusBasket statusBasket) {
        this.statusBasket = statusBasket;
    }

    public List<Item> getOrdersItems() {
        return items;
    }

    public void setOrdersItems(List<Item> items) {
        this.items = items;
    }
}