package com.conferenceroomscheduler.model;

import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private String roomId;
    private String userId;
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String accountType;
    private double hourlyRate;
    private double depositAmount;
    private double finalAmount;
    private PaymentMethod paymentMethod;
    private boolean checkedIn;
    private boolean canceled;
    private boolean extended;
    private boolean depositLost;
    

   


    public Reservation() {
    }

    public Reservation(String reservationId, String roomId, String userId, String title,
                       LocalDateTime startTime, LocalDateTime endTime, String accountType,
                       double hourlyRate, double depositAmount, double finalAmount,
                       PaymentMethod paymentMethod) {
        this.reservationId = reservationId;
        this.roomId = roomId;
        this.userId = userId;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.accountType = accountType;
        this.hourlyRate = hourlyRate;
        this.depositAmount = depositAmount;
        this.finalAmount = finalAmount;
        this.paymentMethod = paymentMethod;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(double finalAmount) {
        this.finalAmount = finalAmount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    public boolean isDepositLost() {
        return depositLost;
    }

    public void setDepositLost(boolean depositLost) {
        this.depositLost = depositLost;
    }
}
