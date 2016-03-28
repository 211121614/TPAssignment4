/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.plk.violation;

import com.aiden.softwareprinciples.plk.correction.*;
import com.aiden.softwareprinciples.ocp.correction.*;

/**
 *
 * @author Aidem
 */
public class Type {
    
    private String type;
    
    public Type()
    {
    }
    
   public Cpu getCpu()
    {
        return new Cpu();
    }
}
