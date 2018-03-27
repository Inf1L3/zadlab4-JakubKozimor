/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadaniedomowe;


/**
 *
 * @author Jakub
 */
public class Kolo {
    
    private double r;
    public Kolo(double r){
        this.r=r;
    }
    public double pole(double r){
        return r*r*Math.PI;
    }
    public double obwod(double r){
        return 2*r*Math.PI;
    }
    
}
