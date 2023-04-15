package com.CarRentalSystem;

import com.CarRentalSystem.Product.Car;
import com.CarRentalSystem.Product.Vehicle;
import com.CarRentalSystem.Product.VehicalType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicales();
        List<Store> stores = addStores();

        VehicalRentalSystem vehicalRentalSystem = new VehicalRentalSystem(stores, users);

        User user = users.get(0);


        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = vehicalRentalSystem.getStore(location);

        List<Vehicle> storeVehicales = store.getVehical(VehicalType.CAR);

        Reservation reservation = store.createReservation(storeVehicales.get(0), users.get(0));

        Bill bill = new Bill(reservation);

        Payment payment = new Payment();
        payment.payBill();

        store.isCompletedreservation(reservation.reservationId);
    }

    public static List<Vehicle> addVehicales(){
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicalId(1);
        vehicle1.setVehicalType(VehicalType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicalId(2);
        vehicle1.setVehicalType(VehicalType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;

    }
    public static List<User> addUsers(){
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;

    }
    public static List<Store> addStores(){
        List<Vehicle> vehicles = new ArrayList<>();
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicals( vehicles);

        stores.add(store1);
        return stores;

    }
}