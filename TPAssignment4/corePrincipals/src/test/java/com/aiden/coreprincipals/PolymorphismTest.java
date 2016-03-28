/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.coreprincipals;

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
public class PolymorphismTest {
    
     private Polymorphism polymorphism; 
    private Interfaces interfaces;
    private EncapsulationAbstract encapsulationAbstract;
    
    public PolymorphismTest() {
    }

    @Test
    public void testPolymorphism() {
        interfaces = polymorphism;
        encapsulationAbstract =  polymorphism;
        
        
        Assert.assertSame(interfaces, polymorphism, "Objects aren't the same");
        Assert.assertSame(encapsulationAbstract, polymorphism, "Objects aren't the same");
  
    }
    
     @Test
    public void PolymorphismTests() {
        polymorphism = new Polymorphism("name","surname",215165454);
        
        polymorphism.setSex("Male");
        
        Assert.assertEquals(polymorphism.getName(),"name", "Objects aren't the same");
        Assert.assertEquals(polymorphism.getSex(), "Male", "Objects aren't the same");
    }


    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
        polymorphism = new Polymorphism();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
