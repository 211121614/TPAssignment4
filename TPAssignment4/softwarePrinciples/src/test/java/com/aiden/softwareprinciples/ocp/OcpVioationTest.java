/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.ocp;

import com.aiden.softwareprinciples.dip.*;
import com.aiden.softwareprinciples.ocp.violation.Pc;
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
public class OcpVioationTest {
    
       private Pc pc; 
    
    public OcpVioationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testOcpViolationDog() {
      pc.setType("Cpu");
        
      Assert.assertEquals(pc.component(), "2gz");
    }
    @Test
    public void testOcpViolationCat() {
      pc.setType("Ram");
        
        Assert.assertEquals(pc.component(), "4gb");
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
