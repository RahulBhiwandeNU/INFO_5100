/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rahul-bhiwande
 */
public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("UnusedAssignment")
        int stop = 0;
        @SuppressWarnings("UnusedAssignment")
        VitalSigns vitalSigns = null;
        @SuppressWarnings("UnusedAssignment")
        Encounter encounter = null;
        EncounterHistory encounterHistory = new EncounterHistory();
        Patient patient = null;
        Person person = null;
        PatientDirectory patientDirectory = new PatientDirectory();
        PersonDirectory personDirectory = new PersonDirectory();
        Community community = new Community();
        City city = new City();
        ArrayList<Encounter> tempList = new ArrayList<>();
        ArrayList<Encounter> currList = new ArrayList<>();
        ArrayList<Patient> currPatientList = new ArrayList<>();
        Random r = new Random();
        @SuppressWarnings("UnusedAssignment")
        House house = null;
        
                
        
        do {
            
            System.out.println("1.Enter patient info \n2.Check patient's latest visit info \n3.View patient's history \n4.Check Vital signs \n5.Check people with abnormal blood pressure");
            System.out.print("-> ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            
                case 1 :int countDigit = 0;
                        System.out.println("Enter your name : ");
                        String name = sc.nextLine();
                        if(name.isBlank()) {
                            System.out.println("Please enter a name !! ");
                            break;
                        }
            
                        System.out.println("Enter your apartment no : ");
                        int aptNo = sc.nextInt();
                        sc.nextLine();
                        
                        
                        System.out.println("Enter your street : ");
                        String street = sc.nextLine();
                        if(street.isBlank()) {
                            System.out.println("Please enter a street name !! ");
                            break;
                        }
                        
                        System.out.println("Enter your zipcode : ");
                        int zipcode = sc.nextInt();
                        while (zipcode != 0) {
                            zipcode /= 10;
                            ++countDigit;
                        }
                        if(countDigit<5 || countDigit > 5){
                            System.out.println("Please enter a valid zipcode !! ");
                            break;
                        }
                        sc.nextLine();
            
                        System.out.println("Enter your mobile number : ");
                        String mobileNo = sc.nextLine();
                        if(mobileNo.length() != 10) {
                            System.out.println("Please enter valid mobile number !! ");
                            break;
                        }
            
                        System.out.println("Enter your age group : ");
                        String ageGroup = sc.nextLine();
                       
            
                        System.out.println("Enter your Respiratory rate : ");
                        double resRate = sc.nextDouble();
            
                        System.out.println("Enter your Heart rate : ");
                        double heartRate = sc.nextDouble();
            
                        System.out.println("Enter your Systolic blood pressure : ");
                        double sysBP = sc.nextDouble();
            
                        System.out.println("Enter your weight (in kilos) : ");
                        double wKg = sc.nextDouble();
            
                        System.out.println("Enter your weight (in pounds) : ");
                        double wPo = sc.nextDouble();
            
                        long millis=System.currentTimeMillis();  
                        Date dateOfEncounter = new java.util.Date(millis); 
                        
                        int uniqueId = r.nextInt();
                        
                        
                        vitalSigns = new VitalSigns(ageGroup, resRate, heartRate, sysBP, wKg, wPo);
                        encounter = new Encounter(uniqueId,dateOfEncounter, vitalSigns);
                        encounterHistory.addNewEncounter(encounter);
                        patient = new Patient(encounterHistory, name, aptNo, street, zipcode, mobileNo);
                        
                        house = new House(patient);
                        community.addHouses(house);
                        city.addNewCommunties(community);
                        patientDirectory.addPatient(patient);
                        personDirectory.addNewPerson(patient);
                        
                        
                        System.out.println("Information for "+name+" added in records");
                        System.out.println("-----------------------------------------------------------------");
                        if(encounter.isPatientNormal() == true) {
                            System.out.println("------- Reports are normal -------");
                        }
                        else {
                            System.out.println("------- Reports are abnormal -------");
                        }
                        System.out.println("-----------------------------------------------------------------");
                        break;
                        
               
                        
                        
                case 2 :if(patientDirectory.getPatientList().isEmpty()) {
                            System.out.println("Please enter personal info !!!");
                            break;
                        }
                        if(encounterHistory.getEncounterHistory().isEmpty()) {
                            System.out.println("Please enter vital info !!!");
                            break;
                        }
                        System.out.println("Enter patient's name : ");
                        String pname = sc.nextLine();
                        for(int i = 0 ; i < patientDirectory.getPatientList().size();i++) {
                            Patient p = patientDirectory.getPatientList().get(i);
                            if(pname.equalsIgnoreCase(p.getName())) {
                                currList.add(encounterHistory.getEncounterHistory().get(i));
                                currPatientList.add(patientDirectory.getPatientList().get(i));
                            }
                        }
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("Name : "+currPatientList.get(currPatientList.size()-1).getName());
                        System.out.println("Apartment No : "+currPatientList.get(currPatientList.size()-1).getAptNo());
                        System.out.println("Mobile No : "+currPatientList.get(currPatientList.size()-1).getMobileNo());
                        System.out.println("Street : "+currPatientList.get(currPatientList.size()-1).getStreetName());
                        System.out.println("Zipcode : "+currPatientList.get(currPatientList.size()-1).getZipcode());
                        System.out.println("Age group : "+currList.get(currList.size()-1).getVitalSigns().getAgeGroup());
                        System.out.println("Respiratory Rate : "+currList.get(currList.size()-1).getVitalSigns().getRespiratoryRate());
                        System.out.println("Heart Rate : "+currList.get(currList.size()-1).getVitalSigns().getHeartRate());
                        System.out.println("Systolic Blood pressure : "+currList.get(currList.size()-1).getVitalSigns().getSystolicBloodPressure());
                        System.out.println("Weight in kilos : "+currList.get(currList.size()-1).getVitalSigns().getWeightInKilos());
                        System.out.println("Weight in pounds : "+currList.get(currList.size()-1).getVitalSigns().getWeightInPounds());
                        System.out.println("-----------------------------------------------------------------");
                        break;
                        
                case 3 :if(encounterHistory.getEncounterHistory().isEmpty()) {
                            System.out.println("Please enter your info !!! ");
                            break;
                        }
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("Enter your name to view encounter history : ");
                        String searchName = sc.nextLine();
                        for(int i = 0 ; i < patientDirectory.getPatientList().size();i++) {
                            Patient p = patientDirectory.getPatientList().get(i);
                            if(searchName.equalsIgnoreCase(p.getName())) {
                                System.out.println(encounterHistory.getEncounterHistory().get(i));
                            }
                        }
                        System.out.println("-----------------------------------------------------------------");
                        break;
                case 4 :if(patient == null) {
                           System.out.println("Please enter vital signs !!!");
                           break;
                        }
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("Enter the name of person to view vital signs information");
                        String sName = sc.nextLine();
                        System.out.println("Enter the encounter ID");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the vital sign to check : ");
                        String vsign = sc.nextLine();
                        for(int i = 0 ; i < patientDirectory.getPatientList().size();i++) {
                            Patient p = patientDirectory.getPatientList().get(i);
                            if(sName.equalsIgnoreCase(p.getName()) && id == encounterHistory.getEncounterHistory().get(i).getUniqueId()) {
                                tempList.add(encounterHistory.getEncounterHistory().get(i));
                            }
                        }
                        if(tempList.get(0).isThisVitalSignNormal(vsign)) {
                           System.out.println("Your "+vsign+" is normal");
                        }
                        else {
                            System.out.println("Your "+vsign+" is abnormal");
                        }
                        System.out.println("-----------------------------------------------------------------");
                        break;
                        
                case 5: System.out.println("Enter the community name : ");
                        String comName = sc.nextLine();
                        int count = 0;
                        int total = 0;
                        
                        for(int i = 0;i< patientDirectory.getPatientList().size();i++){
                            Patient p = patientDirectory.getPatientList().get(i);
                            if(comName.equalsIgnoreCase(p.getStreetName())) {
                                total++;
                                if(!p.getHistory().getEncounterHistory().get(i).isThisVitalSignNormal("Systolic Blood Pressure")) {
                                    count++;
                                }
                            }
                        }

                        System.out.println("Number of people with abnormal blood pressure in "+comName+" is : "+count+" out of "+total+" people");
                        break;
                        
            }
            System.out.println("Do you want to continue ? Press 0 to stop or 1 to continue ");
            stop = sc.nextInt();
            sc.nextLine();
            
        }
        while(stop != 0); 
    }
}
