/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rahul-bhiwande
 */
public class main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VitalSignsHistory vitalSignsHistory = new VitalSignsHistory();
        Patient patient = null;
        VitalSigns vitalSigns = null;
        int stop = 0;
        do {
            System.out.println("1.Enter vital signs \n2.View Current vital signs \n3.View Vital signs history \n4.Check Vital signs \n ");
            System.out.print("-> ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
            
                case 1 : System.out.println("Enter your name : ");
                         String name = sc.nextLine();
            
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
                         Date date = new java.util.Date(millis); 
            
                         vitalSigns = new VitalSigns(ageGroup, resRate, heartRate, sysBP, wKg, wPo, name, date);
                         patient = new Patient(vitalSigns);
            
                         if(patient.isPatientNormal() == true) {
                            System.out.println("---- Your reports are normal ----");
                         }
                         else {
                            System.out.println("---- Your reports are abnormal ----");
                        }
            
                        vitalSignsHistory.addNewVital(vitalSigns);

                        System.out.println("Record added for " + name);
                        break;
                case 2 :if(vitalSignsHistory.getHistory().isEmpty()) {
                        System.out.println("Please enter vital signs to view current data !!!");
                        break;
                        }
                        System.out.println(vitalSignsHistory.getHistory().get(vitalSignsHistory.getHistory().size()-1));
                        break;
          
                case 3 :if(vitalSignsHistory.getHistory().isEmpty()) {
                        System.out.println("Please enter vital signs to view history !!!");
                        break;
                        }
                        for(int i = 0;i< vitalSignsHistory.getHistory().size();i++) {
                            System.out.println(vitalSignsHistory.getHistory().get(i));
                        } break;
           
                case 4 :if(patient == null) {
                           System.out.println("Please enter vital signs !!!");
                           break;
                        }
                        System.out.println("Enter the vital sign to check : ");
                        String vsign = sc.nextLine();
                        if(patient.isThisVitalSignNormal(vsign)) {
                           System.out.println("Your "+vsign+" is normal");
                        }
                        else {
                            System.out.println("Your "+vsign+" is abnormal");
                        }
                         break;
                    }
            System.out.println(" \n Press 0 to stop or 1 to continue ");
            System.out.print("-> ");
            stop = sc.nextInt();
        } while(stop != 0);
    } 
}

