/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author mattfavre
 */
public class IInstrument {
    
    String sound;
    int volume = 0;
    String color;
    
public IInstrument(){
   
}
    
public String play(){
    return sound;
}

public int getSoundVolume(){
    return volume;
}

public String getColor(){
    return color;
}
    
}
