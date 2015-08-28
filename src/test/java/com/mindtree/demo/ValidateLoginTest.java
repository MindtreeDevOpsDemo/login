package com.mindtree.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ValidateLoginTest extends TestCase {
    
    public ValidateLoginTest(String testName) {
        super(testName);
        String expResult="Hi";
        String result="Hi";
        
        assertEquals(expResult, result);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ValidateLoginTest.class);
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

    public void testDoPost() throws Exception {
        System.out.println("doPost");               
        String expResult="Hi";
        String result="Hi";        
        assertEquals(expResult, result);
    }
      
    
}
