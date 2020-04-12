/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author srush
 */
public class LotOfDrug {
    
    private ArrayList<Package1> packageList;
    private int lotID;
    private String lotStatus;

    public String getLotStatus() {
        return lotStatus;
    }

    public void setLotStatus(String lotStatus) {
        this.lotStatus = lotStatus;
    }
    
    
 
    private static int count=0;

    public int getLotID() {
        return lotID;
    }

    public void setLotID(int lotID) {
        this.lotID = lotID;
    }

    
    
    
    

    public LotOfDrug() {
        
        count++;
        lotID=count;
        packageList=new ArrayList<Package1>();
    }
    
    
    public ArrayList<Package1> getPackageList() {
        return packageList;
    }

    public void setPackageList(ArrayList<Package1> packageList) {
        this.packageList = packageList;
    }
    
    
    public void addPackage(Package1 p){
        
        packageList.add(p);
        
    }
    
   public String toString()
   {
       return Integer.toString(lotID);
   }
    
    
    
    

    
    
    
    
}
