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
public class NetworkDirectory {
    
    
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        
        networkList=new ArrayList<Network>();
    }
    
    public Network newNetwork()
    {
        
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

   
    
}
