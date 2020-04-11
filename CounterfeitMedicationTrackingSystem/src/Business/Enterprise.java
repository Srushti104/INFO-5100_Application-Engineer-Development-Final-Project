/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author nived
 */
public abstract class Enterprise extends Organization{
    
    private String enterpriseName;
    private String enterpriseType;
    
    public Enterprise(String enterpriseName){
        this.enterpriseName=enterpriseName;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    @Override
    public String toString() {
        return enterpriseName;
    }
    
    
    
}
