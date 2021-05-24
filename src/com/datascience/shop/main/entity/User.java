package com.datascience.shop.main.entity;

public class User {
    private long userId;
    private UserRole userRole;
    private String clientName;
    private String clientOkpo;
    private Country clientCountry;
    private ContactInfo contactInfo;
    private static long idCurrentUser;

    public User(UserRole userRole, String clientName, String clientOkpo, Country clientCountry, ContactInfo contactInfo) {
        this.userId = setUserId();
        this.userRole = userRole;
        this.clientName = clientName;
        this.clientOkpo = clientOkpo;
        this.clientCountry = clientCountry;
        this.contactInfo = contactInfo;
    }

    public long getUserId() {
        return userId;
    }

    public long setUserId() {
        return idCurrentUser++;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientOkpo() {
        return clientOkpo;
    }

    public void setClientOkpo(String clientOkpo) {
        this.clientOkpo = clientOkpo;
    }

    public Country getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(Country clientCountry) {
        this.clientCountry = clientCountry;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}