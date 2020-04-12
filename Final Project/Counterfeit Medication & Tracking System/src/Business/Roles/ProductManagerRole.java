/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.ProductManagerWorkArea;

/**
 *
 * @author nived
 */
public class ProductManagerRole extends Role{

    public ProductManagerRole() {
        super("Product Manager Role");
        
        workArea=new ProductManagerWorkArea();
    }
    
    
    
    
}
