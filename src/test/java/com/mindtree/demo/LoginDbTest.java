
package com.mindtree.demo;

import com.mindtree.demo.db.DataBase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LoginDbTest extends TestCase {
    
    public LoginDbTest(String testName) {
        super(testName);
        
        String expResult = "true";
        String result = "true";        
        assertEquals(expResult, result);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoginDbTest.class);
        return suite;   
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();        
        String expResult = "true";
        String result = "true";        
        assertEquals(expResult, result);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        String expResult = "true";
        String result = "true";        
        assertEquals(expResult, result);
    }

    public void testSomeMethod() {
        
        DataBase obj = DataBase.getObj();
        String expResult = "false";
        String result = "true";
        try
        {
           if(obj.getDbCon().isClosed())
           {
               result="true";
           }
           else
           {
               result="false";
           }                       
         }
       
        catch (Exception e)
        {
            System.out.println(e.toString());
        }   
        assertEquals(expResult, result);            
    }
    
}