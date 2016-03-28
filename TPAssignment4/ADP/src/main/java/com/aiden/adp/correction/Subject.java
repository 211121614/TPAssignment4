/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.adp.correction;

/**
 *
 * @author Aidem
 */
public class Subject extends Lecturer{
    
    private String subjectCode;
    private String subjectName;
    
    public Subject()
    {
    }

    public String getSubjectName()
    {
        return this.subjectName;
    }
    public String getSubjectCode()
    {
        return this.subjectCode;
    }
    public void setSubjectName(String subjectName)
    {
         this.subjectName = subjectName;
    }
    public void setSubjectCode(String subjectCode)
    {
         this.subjectCode = subjectCode;
    }
    
    @Override
     public void setLec(String lec)
    {
        super.setLec(lec);
    }
     
    @Override
       public String getLec()
    {
        return super.getLec();
    }
}
