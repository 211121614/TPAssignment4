/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.coreprincipals;

/**
 *
 * @author Aidem
 */
public class Inheritance extends EncapsulationAbstract{
     
   private int StudNum;
   private String subject;
   private String subjectCode;
   
   public Inheritance()
   {
       
   }
   
   public Inheritance (String subject, String subjectCode, int StudNum)
   {
        super(subject, subjectCode, StudNum);
   }

   public String getSubjectCode(){
      return subjectCode;
   }

   public String getSubject(){
      return subject;
   }

   public int getStudNum(){
      return StudNum;
   }

   public void setSubjectCode(String subjectCode){
      this.subjectCode = subjectCode;
   }

   public void setSubject(String subject){
      this.subject = subject;
   }

   public void setStudNum( int StudNum){
      this.StudNum = StudNum;
   }
    
}
