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
public class Kula {
    private double r;
    public Kula(double r){
        this.r=r;
    }
    public double pole(double r){
        return r*r*Math.PI*4;
    }
    public double objetosc(double r){
        return (4/3)*r*r*r*Math.PI;
    }
}
