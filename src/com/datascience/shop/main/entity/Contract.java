package com.datascience.shop.main.entity;

import java.time.LocalDate;

public class Contract {
    private long contractId;
    private Basket basket;
    private LocalDate dateBeginContract;
    private LocalDate deadlineContract;
    private double totalPrice;
    private boolean paymentReceived;
    private StatusContract statusContract;
    private static long idCurrentContract;

    public Contract(Basket basket, LocalDate dateBeginContract, LocalDate deadlineContract, double totalPrice, boolean paymentReceived, StatusContract statusContract) {
        this.contractId = setContractId();
        this.basket = basket;
        this.dateBeginContract = dateBeginContract;
        this.deadlineContract = deadlineContract;
        this.totalPrice = totalPrice;
        this.paymentReceived = paymentReceived;
        this.statusContract = statusContract;
    }

    public long getContractId() {
        return contractId;
    }

    public long setContractId() {
        return contractId++;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public LocalDate getDateBeginContract() {
        return dateBeginContract;
    }

    public void setDateBeginContract(LocalDate dateBeginContract) {
        this.dateBeginContract = dateBeginContract;
    }

    public LocalDate getDeadlineContract() {
        return deadlineContract;
    }

    public void setDeadlineContract(LocalDate deadlineContract) {
        this.deadlineContract = deadlineContract;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(boolean paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public StatusContract getStatusContract() {
        return statusContract;
    }

    public void setStatusContract(StatusContract statusContract) {
        this.statusContract = statusContract;
    }
}