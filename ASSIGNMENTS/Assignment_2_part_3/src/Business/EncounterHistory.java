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
public class EncounterHistory {
    
    private ArrayList<Encounter> encounterHistory;
    
    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter addNewEncounter(Encounter encounter) {
        encounterHistory.add(encounter);
        return encounter;
    }
    
    public void removeEncounter(Encounter encounter){
        encounterHistory.remove(encounter);
    }
}
