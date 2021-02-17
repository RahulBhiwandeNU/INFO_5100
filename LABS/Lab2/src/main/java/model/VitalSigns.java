/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kisan
 */
public class VitalSigns {
    
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the bloodPressure
     */
    public double getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the pulse
     */
    public int getPulse() {
        return pulse;
    }

    /**
     * @param pulse the pulse to set
     */
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    } 
    
    @Override
    public String toString() {
        return date;
    }
}
