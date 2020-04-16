/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db4o;

import Business.Business;
import Business.ConfigureABusiness;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 *
 * @author nived
 */
public class db4oUtil {
    
    private static final String FILENAME="Database.db4o";
    
    private static ObjectContainer _container =null;

    public synchronized  static ObjectContainer getObjectContainer() {
        
        if(_container==null || _container.ext().isClosed())
        {
            _container= getObjectContainerForFilename(FILENAME);
        }
        
        
        return _container;
    }
    
    public static ObjectContainer getObjectContainerForFilename(String filename)
    {
        
        
        try{
            
            EmbeddedConfiguration config=Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().objectClass(Business.class).cascadeOnUpdate(true);
            
            
            ObjectContainer db=Db4oEmbedded.openFile(config,filename);
            return db;
        }
        
        catch(Exception ex)
        {
            System.out.print(ex.getMessage());
        }
        
        return null;
        
    }
    
    
    public static void storeObject(Object o)
    {
       getObjectContainer().store(o);
       getObjectContainer().commit();
        
        
        
    }
    
    
    
    public static Business getBusiness()
    {
        
        com.db4o.query.Query queryCS=getObjectContainer().query();
        queryCS.constrain(Business.class);
        
        ObjectSet<Business> businessList=queryCS.execute();
        Business business=null;
        
        if(businessList.isEmpty())
        {
            
            business=ConfigureABusiness.initialize();
            storeObject(business);
            return business;
        }
        
        business=businessList.get(0);
        return business;
        
    }
    
}
