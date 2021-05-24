package com.datascience.shop.main.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private long idBasket; //?почему должно быть финальным?
    private LocalDate dateCreateBasket;
    private User client;
    private StatusBasket statusBasket;
    private List<OrderSegment> orderSegments = new ArrayList<>();
    private static long idCurrentBasket;

    public Basket(LocalDate dateCreateBasket, User client, StatusBasket statusBasket, List<OrderSegment> orderSegments) {
        this.idBasket = setIdBasket();
        this.dateCreateBasket = dateCreateBasket;
        this.client = client;
        this.statusBasket = statusBasket;
        this.orderSegments = orderSegments;
    }

    public long getIdBasket() {
        return idBasket;
    }

    public long setIdBasket() {
        return idCurrentBasket++;
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

    public List<OrderSegment> getOrderSegments() {
        return orderSegments;
    }

    public void setOrderSegments(List<OrderSegment> orderSegments) {
        this.orderSegments = orderSegments;
    }
}