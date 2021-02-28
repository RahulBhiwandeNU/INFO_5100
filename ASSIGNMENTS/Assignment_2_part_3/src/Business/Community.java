/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rahul-bhiwande
 */
public class Community {
    
    private ArrayList<House> houseList;

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
   
    public Community() {
        houseList = new ArrayList<>();
    }

    
    public House addHouses(House house) {
        houseList.add(house);
        return house;
    } 
}
