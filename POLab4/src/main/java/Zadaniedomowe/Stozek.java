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
public class Stozek {
    private double r;
    private double h;
    private double l;
    public Stozek(double r,double h,double l){
        this.r=r;
        this.h=h;
        this.l=l;
    }
    public double pole(double r,double l){
        return Math.PI*r*(r+l);
    }
    public double objetosc(double r,double h){
        return (Math.PI*r*r*h)/3;
    }
    
}
