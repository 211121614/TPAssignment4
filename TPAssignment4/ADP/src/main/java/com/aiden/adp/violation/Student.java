/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.adp.violation;

import com.aiden.adp.correction.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aidem
 */
public class Student {
    
    private Map<String,Subject> subjectsList = new HashMap();
   private Map<String,Lecturer> lecList = new HashMap();
   
    public Student()
    {
        
    }
    
    public void addSubject(Subject subject)
    {
        subjectsList.put(subject.getSubjectName(),subject);
    }
    
    public void addLec(Lecturer lec)
    {
        lecList.put(lec.getLec(),lec);
    }
    
    public Map<String,Subject> getSubjects()
    {
        return subjectsList;
    }
    
    public Map<String,Lecturer> getLec()
    {
        return lecList;
    }
    
}
