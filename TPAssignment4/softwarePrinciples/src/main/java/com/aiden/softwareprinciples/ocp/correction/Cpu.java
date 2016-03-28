/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.ocp.correction;

/**
 *
 * @author Aidem
 */
public class Cpu extends Pc{


    public Cpu() { 
    }
    
    @Override
     public String componentSize()
     {
         return "2gz";
     }
}
