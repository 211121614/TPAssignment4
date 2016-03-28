/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.plk;

import com.aiden.softwareprinciples.dip.*;
import com.aiden.softwareprinciples.plk.violation.Pc;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidem
 */
public class PlkVioationTest {
    
    private Pc pc;
    
    public PlkVioationTest() {
    }

     @Test
    public void testPlkViolation() {
        Assert.assertEquals(pc.getType().getCpu().getName(), "2gz");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        pc = new Pc();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
