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
public class InheritanceTest {
    
    private Inheritance inheritance;
    
    public InheritanceTest() {
    }

    @Test
     public void InheritanceTests() {
         inheritance.setStudNum(216542546);
         inheritance.setSubject("Subject");
         inheritance.setSubjectCode("SubjectCode");
         Assert.assertEquals(inheritance.getStudNum(),216542546, "person object wasn't set");
          Assert.assertEquals(inheritance.getSubject(),"Subject");
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        inheritance = new Inheritance();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
