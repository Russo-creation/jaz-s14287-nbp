package com.example.jaznumer_indeksunbp.nbp.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NbpResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private double average;
    @Enumerated(EnumType.STRING)
    private GoldEnumCategory category;

    private String startDate;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    private String endDate;

    private LocalDateTime createdAt;

    public NbpResponse() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public GoldEnumCategory getCategory() {
        return category;
    }

    public void setCategory(GoldEnumCategory category) {
        this.category = category;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


}
