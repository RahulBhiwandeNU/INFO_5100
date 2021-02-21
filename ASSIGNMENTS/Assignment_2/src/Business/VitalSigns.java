/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author kisan
 */
public class VitalSigns {
    
    private String ageGroup;
    private double respiratoryRate;
    private double heartRate;
    private double systolicBloodPressure;
    private double weightInKilos;
    private double weightInPounds;
    private String name;
    private Date date;

    @Override
    public String toString() {
        return "VitalSigns{" + "ageGroup=" + ageGroup + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKilos=" + weightInKilos + ", weightInPounds=" + weightInPounds + ", name=" + name + ", date=" + date + '}';
    }

    public VitalSigns(String ageGroup, double respiratoryRate, double heartRate, double systolicBloodPressure, double weightInKilos, double weightInPounds,String name,Date date) {
        this.ageGroup = ageGroup;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.systolicBloodPressure = systolicBloodPressure;
        this.weightInKilos = weightInKilos;
        this.weightInPounds = weightInPounds;
        this.name = name;
        this.date = date;
    }

    
    /**
     * @return the weightInKilos
     */
    public double getWeightInKilos() {
        return weightInKilos;
    }

    /**
     * @param weightInKilos the weightInKilos to set
     */
    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    /**
     * @return the weightInPounds
     */
    public double getWeightInPounds() {
        return weightInPounds;
    }

    /**
     * @param weightInPounds the weightInPounds to set
     */
    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    /**
     * @return the ageGroup
     */
    public String getAgeGroup() {
        return ageGroup;
    }

    /**
     * @param ageGroup the ageGroup to set
     */
    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    /**
     * @return the respiratoryRate
     */
    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    /**
     * @param respiratoryRate the respiratoryRate to set
     */
    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    /**
     * @return the heartRate
     */
    public double getHeartRate() {
        return heartRate;
    }

    /**
     * @param heartRate the heartRate to set
     */
    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * @return the systolicBloodPressure
     */
    public double getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    /**
     * @param systolicBloodPressure the systolicBloodPressure to set
     */
    public void setSystolicBloodPressure(double systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
