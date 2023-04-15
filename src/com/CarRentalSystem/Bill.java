package com.CarRentalSystem;

public class Bill {

    Reservation reservation;
    double totalBillAmount;
    boolean isPaid;

    public Bill(Reservation reservation){
        this.reservation = reservation;
        this.totalBillAmount = computeBill();
        this.isPaid = false;

    }

    private double computeBill() {
        return 210;
    }
}
