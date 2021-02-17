/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kisan
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;

    /**
     * @return the history
     */
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSignHistory() {
        this.history = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addNewVital() {
        VitalSigns vitalSigns = new VitalSigns();
        history.add(vitalSigns);
        return vitalSigns;
    }
    
    public void deleteVitals(VitalSigns vs) {
        history.remove(vs);
    }
    
}
