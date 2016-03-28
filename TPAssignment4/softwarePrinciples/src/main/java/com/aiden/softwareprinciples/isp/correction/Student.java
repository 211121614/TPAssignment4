/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aiden.softwareprinciples.isp.correction;

import com.aiden.softwareprinciples.dip.correction.*;

/**
 *
 * @author Aidem
 */
public class Student implements StudentInterface{
   
    @Override
    public int getStudNum()
    {
        return 25541464;
    }
    
    @Override
    public String getStudName()
    {
        return "name";
    }
    

}
