/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.DrugTesterWorkArea;

/**
 *
 * @author bobba
 */
public class DrugTesterRole extends Role{

    public DrugTesterRole() {
        super("Drug Tester");
        
        workArea=new DrugTesterWorkArea();
    }
    
    
    
    
}
