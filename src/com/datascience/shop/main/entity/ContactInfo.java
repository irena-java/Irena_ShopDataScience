package com.datascience.shop.main.entity;

import java.time.LocalDate;

public class ContactInfo extends BaseEntity{
    private String contactPersonName;
    private String phone;
    private String email;
    private LocalDate dateClosed;

    public ContactInfo() {
    }

    public ContactInfo(Integer id, String contactPersonName, String phone, String email, LocalDate dateClosed) {
        super(id);
        this.contactPersonName = contactPersonName;
        this.phone = phone;
        this.email = email;
        this.dateClosed = dateClosed;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateClosed(LocalDate dateClosed) {
        this.dateClosed = dateClosed;
    }
}