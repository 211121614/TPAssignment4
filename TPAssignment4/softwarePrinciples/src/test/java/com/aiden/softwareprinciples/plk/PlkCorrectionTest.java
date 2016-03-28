/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.plk;

import com.aiden.softwareprinciples.dip.*;
import com.aiden.softwareprinciples.plk.correction.Pc;
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
public class PlkCorrectionTest {
    
    private Pc pc;
    
    public PlkCorrectionTest() {
    }

@Test
    public void testPlkCorrection() {
    
        Assert.assertEquals(pc.getCpu(), "2gz");
        Assert.assertEquals(pc.getType(), "intel");
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
