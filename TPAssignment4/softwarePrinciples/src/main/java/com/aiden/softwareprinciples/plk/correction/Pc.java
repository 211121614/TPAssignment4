/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.plk.correction;

import com.aiden.softwareprinciples.ocp.correction.*;

/**
 *
 * @author Aidem
 */
public class Pc {
    private Cpu cpu = new Cpu();
    private Type type = new Type();   
   
    public Pc()
    {}
    
    public String getCpu()
    {
        return cpu.getName();
    }
    
     public String getType()
    {
        return type.getType();
    }
}
