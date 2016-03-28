/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.srp.violation;

/**
 *
 * @author Aidem
 */
public class Calculate{
    
    private int num1;
    private int num2;
       
    public Calculate()
    {
       
    }
    
    public Calculate(int num1,int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getNum1()
    {
        return this.num1;
    }
    public int getWidth()
    {
        return this.num2;
    }
  
    public int calculate()
    {
        return num1 + num2;
    }

}
