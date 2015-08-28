/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindtree.demo;

import com.mindtree.demo.db.DataBase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author devopsdemo
 */
public class LoginDbTest extends TestCase {
    
    public LoginDbTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoginDbTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
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
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
       
    }
    
}