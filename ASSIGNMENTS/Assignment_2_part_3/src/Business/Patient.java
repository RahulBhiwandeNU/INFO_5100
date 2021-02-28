/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author rahul-bhiwande
 */
public class Patient extends Person {
    
    private EncounterHistory history; 

    public Patient(EncounterHistory history, String name, int aptNo, String streetName, int zipcode, String mobileNo) {
        super(name, aptNo, streetName, zipcode, mobileNo);
        this.history = history;
    } 

    public EncounterHistory getHistory() {
        return history;
    }

    public void setHistory(EncounterHistory history) {
        this.history = history;
    }
}
