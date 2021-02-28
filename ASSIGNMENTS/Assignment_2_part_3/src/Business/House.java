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
public class House {
    
    private Person person;

    public House(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "House{" + "person=" + person + '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
}
