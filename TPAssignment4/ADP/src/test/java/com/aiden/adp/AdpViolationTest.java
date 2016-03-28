/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.adp;

import com.aiden.adp.violation.Lecturer;
import com.aiden.adp.violation.Student;
import com.aiden.adp.violation.Subject;
import java.util.HashMap;
import java.util.Map;
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
public class AdpViolationTest {
private Student student;
    private Subject subject;
     private Map<String,Subject> subjectsList = new HashMap();
     private Lecturer lec;
     private Map<String,Lecturer> lecList = new HashMap();
     
    public AdpViolationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testAdpViolation() {
        subject.setSubjectCode("123");
        subject.setSubjectName("TP");

        student.addSubject(subject);
        
        subjectsList = student.getSubjects();
        
        subject = new Subject();
 
        subject = (Subject)  subjectsList.get("TP");
        
        Assert.assertEquals(subject.getSubjectName(), "TP");
        Assert.assertEquals(subject.getSubjectCode(),"123");
        
    }
    
    @Test
    public void testAdpViolationMarks() {
        subject.setSubjectCode("123");
        subject.setSubjectName("TP");
        lec.setLec("no one");
                
        student.addSubject(subject);
        student.addLec(lec);
                
        subjectsList = student.getSubjects();
        lecList = student.getLec();
        
        subject = new Subject();
        lec = new Lecturer();
 
        subject = (Subject)  subjectsList.get("TP");
        lec = (Lecturer) lecList.get("no one");
        
        
        Assert.assertEquals(subject.getSubjectName(), "TP");
        Assert.assertEquals(lec.getLec(),"no one");
        
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
        subject = new Subject();
        lec = new Lecturer();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
