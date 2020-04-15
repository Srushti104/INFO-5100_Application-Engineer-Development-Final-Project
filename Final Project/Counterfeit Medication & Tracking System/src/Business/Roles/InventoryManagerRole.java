/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.InventoryManagerWorkArea;

/**
 *
 * @author srush
 */
public class InventoryManagerRole extends Role {

    public InventoryManagerRole() {
        super("Inventory Manager Role");

        workArea = new InventoryManagerWorkArea();
    }

}
