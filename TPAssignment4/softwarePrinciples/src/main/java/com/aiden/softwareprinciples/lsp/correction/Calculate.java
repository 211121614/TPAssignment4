/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.lsp.correction;

/**
 *
 * @author Aidem
 */
public class Calculate  extends CalculateClass{
    
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
    public void setNum1(int num1){
            this.num1 = num1;
    }

    public void setNum2(int num2){
            this.num2 = num2;
    }


    public int getRectWidth(){
            return num1;
    }

    public int getRectHeight(){
            return num2;
    }

}
