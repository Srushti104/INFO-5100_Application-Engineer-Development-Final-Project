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
public class Business extends Network {
    
    private static Business business;
    private NetworkDirectory networkDirectory;
    
    public Business(){
        networkDirectory=new NetworkDirectory();
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }
    
    public static Business getInstance(){
        if(business==null){
            business= new Business();
        }
        return business;
    }
    
}
