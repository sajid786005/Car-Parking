package com.CodewithAbbas.Parking.Management.System.dao;


import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ParkingDataHistoryDao {


    private Long sNo;
    private Long slotId;
    private String carNumber;
    private String carName;
    private String carOwnerName;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double fare;
    private String comments;
    public Long getsNo() {
        return sNo;
    }
    public void setsNo(Long sNo) {
        this.sNo = sNo;
    }
    public Long getSlotId() {
        return slotId;
    }
    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }
    public String getCarNumber() {
        return carNumber;
    }
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getCarOwnerName() {
        return carOwnerName;
    }
    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
    public LocalDateTime getExitTime() {
        return exitTime;
    }
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
    public double getFare() {
        return fare;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public ParkingDataHistoryDao() {
        super();
    }
}
