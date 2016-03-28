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
public class Polymorphism extends EncapsulationAbstract implements Interfaces{
     private int age;
    private String sex;
    
    public Polymorphism(String name,String surname,int studNum)
    {
        super(name,surname,studNum);
    }

    public Polymorphism() {
        super();
    }
    
    @Override
    public int getAge() {
        return this.age;
    }
    
    @Override
    public String getSex() {
        return this.sex;
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void setSex(String sex) {
         this.sex = sex;
    }
}
