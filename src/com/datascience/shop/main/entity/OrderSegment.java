package com.datascience.shop.main.entity;

import java.time.LocalDate;

public class OrderSegment {
    private long idOrderSegment;
    private DataScienceSection dataScienceSection;
    private DataScienceDirection dataScienceDirection;
    private JobType jobType;
    private LocalDate startDate;
    private LocalDate deadline;
    private double price;
    private static long idCurrentOrderSegment;

    public OrderSegment(long idOrderSegment, DataScienceSection dataScienceSection, DataScienceDirection dataScienceDirection, JobType jobType, LocalDate startDate, LocalDate deadline, double price) {
        this.idOrderSegment = setIdOrderSegment();
        this.dataScienceSection = dataScienceSection;
        this.dataScienceDirection = dataScienceDirection;
        this.jobType = jobType;
        this.startDate = startDate;
        this.deadline = deadline;
        this.price = price;
    }

    public long getIdOrderSegment() {
        return idOrderSegment;
    }

    public long setIdOrderSegment() {
        return idCurrentOrderSegment++;
    }

    public DataScienceSection getDataScienceSection() {
        return dataScienceSection;
    }

    public void setDataScienceSection(DataScienceSection dataScienceSection) {
        this.dataScienceSection = dataScienceSection;
    }

    public DataScienceDirection getDataScienceDirection() {
        return dataScienceDirection;
    }

    public void setDataScienceDirection(DataScienceDirection dataScienceDirection) {
        this.dataScienceDirection = dataScienceDirection;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}