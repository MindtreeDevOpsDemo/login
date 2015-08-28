/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindtree.demo;

import com.mindtree.demo.db.DbSuite;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author devopsdemo
 */
public class DemoSuite extends TestCase {
    
    public DemoSuite(String testName) {
        super(testName);
         String expResult="Hi";
        String result="Hi";        
        assertEquals(expResult, result);
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("DemoSuite");
        suite.addTest(DbSuite.suite());
        suite.addTest(LoginDbTest.suite());
        suite.addTest(ValidateLoginTest.suite());
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        String expResult="Hi";
        String result="Hi";        
        assertEquals(expResult, result);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        String expResult="Hi";
        String result="Hi";        
        assertEquals(expResult, result);
    }
    
}
