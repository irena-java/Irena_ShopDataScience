package com.datascience.shop.main.entity;

public class ContactInfo {
    public String contactPersonName;
    private String phone;
    private String email;

    public ContactInfo(String contactPersonName, String phone, String email) {
        this.contactPersonName = contactPersonName;
        this.phone = phone;
        this.email = email;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}