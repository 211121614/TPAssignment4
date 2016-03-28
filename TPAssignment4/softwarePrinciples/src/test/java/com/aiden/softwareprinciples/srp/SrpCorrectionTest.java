/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.srp;

import com.aiden.softwareprinciples.srp.correction.Calculate;
import com.aiden.softwareprinciples.srp.correction.CalculateClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Aidem
 */
public class SrpCorrectionTest {
    
    private Calculate calculate;
    private CalculateClass calculatec;
    
    public SrpCorrectionTest() {
    }

   @Test
    public void testSrpCorrectionTest() {
    
        Assert.assertEquals(calculatec.calculate(calculate.getNum1(), calculate.getNum2()), 10);
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
        calculatec = new CalculateClass();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
