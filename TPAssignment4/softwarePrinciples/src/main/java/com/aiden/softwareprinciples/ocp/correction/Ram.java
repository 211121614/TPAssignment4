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
public class Ram extends Pc {
    
    public Ram()
    {
    }
    
    @Override
     public String componentSize()
     {
         return "4gb";
     }
}
