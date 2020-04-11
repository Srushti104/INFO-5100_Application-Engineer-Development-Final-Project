/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author nived
 */
public class NetworkDirectory {
    
    private ArrayList<Network> networkList;
    
    public NetworkDirectory(){
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network newNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    
}
