/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.coreprincipals;

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
public class EncapsulationTest {
    
    private Encapsulation encapsulation;
    
    public EncapsulationTest() {
    }

    @Test
    public void testEncapsulation() {
        encapsulation.setName("Name");
        encapsulation.setSurname("Surname");
        encapsulation.setStudNum(231354548);
        
        Assert.assertEquals(encapsulation.getName(), "Name","values weren't equal");
    
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        encapsulation = new Encapsulation();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
