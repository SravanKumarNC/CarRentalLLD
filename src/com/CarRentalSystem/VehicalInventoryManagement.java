package com.CarRentalSystem;

import com.CarRentalSystem.Product.Vehicle;

import java.util.List;

public class VehicalInventoryManagement {

    List<Vehicle>  vehicales;

    public VehicalInventoryManagement(List<Vehicle> vehicales){
        this.vehicales = vehicales;
    }

    public List<Vehicle> getVehicales() {
        return vehicales;
    }

    public void setVehicales(List<Vehicle> vehicales) {
        this.vehicales = vehicales;
    }
}
