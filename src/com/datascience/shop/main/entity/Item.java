package com.datascience.shop.main.entity;

import java.time.LocalDate;

public class Item extends BaseEntity{
    private String dataScienceSection; //    MASHINE_LEARNING,COMPUTER_VISION,NATURAL_LANGUAGE_PROCESSING,BIG_DATA
    private String dataScienceDirection; // DATA_WAREHOUSE,MATHEMATICAL_MODEL,AUTOMATION
    private String jobType;  //DEVELOPMENT,AUDIT,CORPORATE_TRAINING
    private LocalDate startDate;
    private LocalDate deadline;
    private Double price;

    public Item() {
    }

    public Item(Integer id, String dataScienceSection, String dataScienceDirection, String jobType, LocalDate startDate, LocalDate deadline, Double price) {
        super(id);
        this.dataScienceSection = dataScienceSection;
        this.dataScienceDirection = dataScienceDirection;
        this.jobType = jobType;
        this.startDate = startDate;
        this.deadline = deadline;
        this.price = price;
    }

    public String getDataScienceSection() {
        return dataScienceSection;
    }

    public void setDataScienceSection(String dataScienceSection) {
        this.dataScienceSection = dataScienceSection;
    }

    public String getDataScienceDirection() {
        return dataScienceDirection;
    }

    public void setDataScienceDirection(String dataScienceDirection) {
        this.dataScienceDirection = dataScienceDirection;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}