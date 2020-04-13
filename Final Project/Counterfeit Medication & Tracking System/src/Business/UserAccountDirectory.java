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
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        
        
        userAccountList=new ArrayList<UserAccount>();
    }
    
    public UserAccount newAccount()
    {
        
        UserAccount userAccount=new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteAccount(UserAccount userAccount)
    {
        
        userAccountList.remove(userAccount);
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    
     public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if(ua.getUserName().equalsIgnoreCase(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    
    
    
}
