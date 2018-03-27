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
public class Prostopadloscian {
    private double a;
    private double b;
    private double c;
    public Prostopadloscian(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double pole(double a,double b,double c){
        return a*b*2+2*a*b+2*b*c;
    }
    public double objetosc(double a,double b,double c){
        return c*b*a;
    }
    
}
