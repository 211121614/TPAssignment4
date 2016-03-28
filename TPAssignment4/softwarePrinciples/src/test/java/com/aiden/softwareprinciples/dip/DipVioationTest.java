/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.dip;

import com.aiden.softwareprinciples.dip.violation.Student;
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
public class DipVioationTest {
    
    private Student student;
    
    public DipVioationTest() {
    }

    @Test
    public void TestDipVioationTest()
    {
        Assert.assertEquals(student.Sub(),"tp");
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        student = new Student();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
