/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.srp;

import com.aiden.softwareprinciples.dip.*;
import com.aiden.softwareprinciples.srp.violation.Calculate;
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
public class SrpVioationTest {
    
    private Calculate calculate;
    
    public SrpVioationTest() {
    }

    @Test
     public void testSrpViolation() {
         Assert.assertEquals(calculate.calculate(),10);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        calculate = new Calculate(5,5);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
