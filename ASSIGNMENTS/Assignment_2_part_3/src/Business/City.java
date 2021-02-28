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
public class City {
    
    private ArrayList<Community> comList;
    
    public City() {
        comList = new ArrayList<>();
    }

    public ArrayList<Community> getComList() {
        return comList;
    }

    public void setComList(ArrayList<Community> comList) {
        this.comList = comList;
    }
    
    public Community addNewCommunties(Community community) {
        comList.add(community);
        return community;
    }
}
