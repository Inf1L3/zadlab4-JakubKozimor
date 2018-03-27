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
public class Szescian {
    private double a;
   
    public Szescian(double a){
        this.a=a;
        
    }
    public double pole(double a){
        return a*a*6;
    }
    public double objestosc(double a){
        return a*a*a;
    }
}
