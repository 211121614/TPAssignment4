/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.ocp.violation;

/**
 *
 * @author Aidem
 */
public class Pc {
    private String componentSize;
    private String type;
    
    public Pc()
    {
       
    }
    
    public String getType()
    {
        return this.type;
    }
     public String component()
    {
        return this.componentSize;
    }
    
     public void setType(String type)
    {
         this.type = type;
         switch(type)
         {
             case "Cpu": componentSize = "2gz";
             break;
             case "Ram": componentSize = "4gb";
             break;
             default: componentSize ="1";
         };
    }
}
