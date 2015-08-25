/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindtree.demo.db;

import java.sql.Connection;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author devopsdemo
 */
public class DataBaseTest extends TestCase {
    
    public DataBaseTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DataBaseTest.class);
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
     * Test of getDbCon method, of class DataBase.
     */
    public void testGetDbCon() {
        System.out.println("getDbCon");
        //DataBase instance = null;
        Connection expResult = null;
        Connection result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getObj method, of class DataBase.
     */
    public void testGetObj() {
        System.out.println("getObj");
        DataBase expResult = DataBase.getObj();
        DataBase result = DataBase.getObj();
        System.out.println();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
