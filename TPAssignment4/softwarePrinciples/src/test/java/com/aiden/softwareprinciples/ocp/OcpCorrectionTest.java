/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.ocp;

import com.aiden.softwareprinciples.ocp.correction.Cpu;
import com.aiden.softwareprinciples.ocp.correction.Pc;
import com.aiden.softwareprinciples.ocp.correction.Ram;
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
public class OcpCorrectionTest {
    private Pc cpu;
    private Pc ram;
    
    public OcpCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void OcpCorrectionTest() {
      Assert.assertEquals(cpu.componentSize(),"2gz");
    }
    
    
    @Test
    public void testOcpCorrectionnRam() {
      
        
        Assert.assertEquals(ram.componentSize(), "4gb");
    }   

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        cpu = new Cpu();
        ram = new Ram();
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
