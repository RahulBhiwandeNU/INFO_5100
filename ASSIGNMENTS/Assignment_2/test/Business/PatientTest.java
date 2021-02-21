/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rahul-bhiwande
 */
public class PatientTest {
    
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_1() {
        System.out.println("Newborn");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Newborn",35.0,125.0,55.0,2.0,6.0,"XYZ",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_2() {
        System.out.println("Newborn");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Newborn",135.0,125.0,55.0,2.0,6.0,"XYZ",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = false;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_3() {
        System.out.println("Infant");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Infant",25.0,125.0,75.0,5.0,10.0,"ABC",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_4() {
        System.out.println("Toddler");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Toddler",25.0,125.0,100.0,11.0,25.0,"TRC",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_5() {
        System.out.println("Preschooler");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Preschooler",25.0,115.0,100.0,15.0,35.0,"URV",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_6() {
        System.out.println("School Age");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("School Age",25.0,100.0,100.0,22.0,90.0,"RAH",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPatientNormal method, of class Patient.
     */
    @Test
    public void testIsPatientNormal_7() {
        System.out.println("Adolescent");
        Date date = new Date(System.currentTimeMillis());
        VitalSigns vitalSigns = new VitalSigns("Adolescent",15.0,90.0,115.0,51.0,116.0,"MAK",date);
        Patient instance = new Patient(vitalSigns);
        boolean expResult = true;
        boolean result = instance.isPatientNormal();
        assertEquals(expResult, result);
    }
    
}
