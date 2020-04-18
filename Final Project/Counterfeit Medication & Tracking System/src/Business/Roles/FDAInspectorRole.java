/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkArea.LawEnforcementInspectorWorkArea;

/**
 *
 * @author srush
 */
public class FDAInspectorRole extends Role{

    public FDAInspectorRole() {
        super("FDA Inspector Role");
        workArea=new LawEnforcementInspectorWorkArea();
    }
    
    
    
    
}
