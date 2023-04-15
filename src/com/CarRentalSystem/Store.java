package com.CarRentalSystem;

import com.CarRentalSystem.Product.Vehicle;
import com.CarRentalSystem.Product.VehicalType;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    VehicalInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehical(VehicalType vehicalType){
        return inventoryManagement.getVehicales();
    }

    public void setVehicals(List<Vehicle> vehicles){
        inventoryManagement = new VehicalInventoryManagement(vehicles);
        inventoryManagement.setVehicales(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReservation(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean isCompletedreservation(int reservationId){

        return true;
    }


}
