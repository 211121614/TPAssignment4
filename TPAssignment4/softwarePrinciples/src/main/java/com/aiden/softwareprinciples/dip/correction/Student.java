/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.dip.correction;

/**
 *
 * @author Aidem
 */
public class Student implements StudentInterface{
   
    private int studNum;
    
    public Student()
    {
    }
    
    public int getStudNum()
    {
        return this.studNum;
    }
    public void setStudNum(int studNum)
    {
        this.studNum = studNum;
    }
    
    @Override
    public String Sub() {
        return "TP"; //To change body of generated methods, choose Tools | Templates.
    }
}
