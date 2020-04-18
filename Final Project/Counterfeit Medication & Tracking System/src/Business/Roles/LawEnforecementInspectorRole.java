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
public class LawEnforecementInspectorRole extends Role{

    public LawEnforecementInspectorRole() {
        super("Law Enforcement Inspector Role");
        workArea=new LawEnforcementInspectorWorkArea();
    }
    
    
    
    
}
