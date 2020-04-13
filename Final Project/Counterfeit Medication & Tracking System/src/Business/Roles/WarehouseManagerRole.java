/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.WarehouseManagerWorkArea;

/**
 *
 * @author bobba
 */
public class WarehouseManagerRole extends Role{

    public WarehouseManagerRole() {
        super("Ware House Manager Role");
        workArea=new WarehouseManagerWorkArea();
    }
    
    
    
    
}
