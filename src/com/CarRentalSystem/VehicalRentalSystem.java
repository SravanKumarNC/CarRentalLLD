package com.CarRentalSystem;

import java.util.List;

public class VehicalRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicalRentalSystem(List<Store> storeList, List<User> userList){
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location){

        return storeList.get(0);
    }
}
