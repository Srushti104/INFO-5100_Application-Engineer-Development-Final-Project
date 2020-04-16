/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public abstract class View {
    
    JPanel viewPanel;

    public JPanel getViewPanel() {
        return viewPanel;
    }

    public void setViewPanel(JPanel viewPanel) {
        this.viewPanel = viewPanel;
    }
    
    
}
