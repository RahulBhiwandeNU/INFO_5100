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
public class Person {
    
    private String name;
    private int aptNo;
    private String streetName;
    private int zipcode;
    private String mobileNo;

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", aptNo=" + aptNo + ", streetName=" + streetName + ", zipcode=" + zipcode + ", mobileNo=" + mobileNo + '}';
    }

    public Person(String name, int aptNo, String streetName, int zipcode, String mobileNo) {
        this.name = name;
        this.aptNo = aptNo;
        this.streetName = streetName;
        this.zipcode = zipcode;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAptNo() {
        return aptNo;
    }

    public void setAptNo(int aptNo) {
        this.aptNo = aptNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    
}
