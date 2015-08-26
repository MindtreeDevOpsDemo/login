/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindtree.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.*;

/**
 *
 * @author devopsdemo
 */
public class ValidateLoginTest extends TestCase {
    
    public ValidateLoginTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ValidateLoginTest.class);
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

    /**
     * Test of doPost method, of class ValidateLogin.
     */
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        //HttpServletRequest request = ValidateLogin(HttpServletRequest.class);
        //HttpServletResponse response = true;
        ValidateLogin instance = new ValidateLogin();
        //instance.doPost(null, null);
        //instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
