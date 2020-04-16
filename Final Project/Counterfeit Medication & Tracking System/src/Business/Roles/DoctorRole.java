/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.DoctorWorkArea;

/**
 *
 * @author srush
 */
public class DoctorRole extends Role{

    public DoctorRole() {
        super("Doctor");
        workArea=new DoctorWorkArea();
    }
    
    
    
}
