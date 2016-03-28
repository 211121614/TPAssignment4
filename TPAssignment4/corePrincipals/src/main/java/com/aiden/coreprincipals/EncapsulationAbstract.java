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
public abstract class EncapsulationAbstract {
    private String name;
    private String surname; 
   private int StudNum;
   
   public EncapsulationAbstract()
   {    
   }
   
   public EncapsulationAbstract (String name, String surname, int StudNum)
   {
        this.name = name;
        this.surname = surname; 
        this.StudNum = StudNum;
   }

   public String getSurname(){
      return surname;
   }

   public String getName(){
      return name;
   }

   public int getStudNum(){
      return StudNum;
   }

   public void setSurname(String surname){
      this.surname = surname;
   }

   public void setName(String name){
      this.name = name;
   }

   public void setStudNum( int StudNum){
      this.StudNum = StudNum;
   }
}
