/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorList;

    public DoctorDirectory() {
        
        doctorList=new ArrayList<Doctor>();
    }
    
    public Doctor newPatient()
    {
        
        Doctor Doc=new Doctor();
        doctorList.add(Doc);
        return Doc;
    }
    
    public void deleteDoctor(Doctor Doc)
    {
        doctorList.remove(Doc);
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

   
    
}
