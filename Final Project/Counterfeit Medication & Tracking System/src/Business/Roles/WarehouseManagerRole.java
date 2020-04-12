/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.WareHouseManagerWorkArea;

/**
 *
 * @author bobba
 */
public class WareHouseManagerRole extends Role{

    public WareHouseManagerRole() {
        super("Ware House Manager Role");
        workArea=new WareHouseManagerWorkArea();
    }
    
    
    
    
}
