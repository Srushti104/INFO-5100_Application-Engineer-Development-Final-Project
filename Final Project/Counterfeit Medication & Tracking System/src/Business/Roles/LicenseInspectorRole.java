/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.LicenseInspectorWorkArea;

/**
 *
 * @author nived
 */
public class LicenseInspectorRole extends Role{

    public LicenseInspectorRole() {
        super("License Inspector");
        workArea=new LicenseInspectorWorkArea();
    }
    
    
    
    
}
