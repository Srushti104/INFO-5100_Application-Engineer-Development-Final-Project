/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.ReturnsProcessWorkArea;

/**
 *
 * @author nived
 */
public class ReturnsProcessRole extends Role{

    public ReturnsProcessRole() {
        super("Return Processor Role");
        
        workArea=new ReturnsProcessWorkArea();
    }
    
    
    
    
}
