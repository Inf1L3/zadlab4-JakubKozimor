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
public class Prostokat {
    private double a;
    private double b;
    public Prostokat(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double pole(double a,double b){
        return a*b;
    }
    public double obwod(double a,double b){
        return 2*b*a;
    }
    
}

