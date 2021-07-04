package com.example.jaznumer_indeksunbp.nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NbpResponse {
    @ApiModelProperty(notes="This is id of the NbpResponse", required = true, value = "some id", example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(notes="This is average for currency in time period of the NbpResponse", required = true, value = "some double", example = "5.1")
    private double average;

    @ApiModelProperty(notes="This is Enum Gold of the NbpResponse", required = true, value = "some enum", example = "GOLD")
    @Enumerated(EnumType.STRING)
    private GoldEnumCategory category;

    @ApiModelProperty(notes="This is start date of the NbpResponse", required = true, value = "some String", example = "2021-01-30")
    private String startDate;

    @ApiModelProperty(notes="This is end date of the NbpResponse", required = true, value = "some String", example = "2021-01-30")
    private String endDate;

    @ApiModelProperty(notes="This is time for request of the the NbpResponse", required = true, value = "some LocalDayTime", example = "2021-07-04 01:01:47.696179")
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
}
