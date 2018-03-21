/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author student
 */
public class Student {
    String imie;
    String nazwizko;
    int nr_indeksu;
    String nazwa_specjalnosci;
    int rok_studiow;
    public Student (String imie,String nazwisko, String nazwa_specjalnosci, int rok_studiow,int nr_indeksu){
        this.imie=imie;
        this.nazwizko=nazwisko;
        this.nazwa_specjalnosci=nazwa_specjalnosci;
        this.nr_indeksu=nr_indeksu;
        this.rok_studiow=rok_studiow;
    }
    
    public Student( String imie, String nazwisko){
        this.imie=imie;
        this.nazwizko=nazwisko;
        this.nazwa_specjalnosci="nazwa specjalnisci";
        this.nr_indeksu=4564;
        this.rok_studiow=1;
        
        
    }
    
    public Student( int nr_indesku){
        this.imie="imie";
        this.nazwizko="nazwisko";
        this.nazwa_specjalnosci="nazwa_specjalnosci";
        this.nr_indeksu=nr_indeksu;
        this.rok_studiow=4;
        
        
    }
 
    public Student(String nazwa_specjalnosci){
        this.imie="imie";
        this.nazwizko="nazwisko";
        this.nazwa_specjalnosci=nazwa_specjalnosci;
        this.nr_indeksu=4564;
        this.rok_studiow=1;
        
        
    }

    @Override
    public String toString() {
        return "Student{" + "imie=" + imie + ", nazwizko=" + nazwizko + ", nr_indeksu=" + nr_indeksu + ", nazwa_specjalnosci=" + nazwa_specjalnosci + ", rok_studiow=" + rok_studiow + '}';
    }
 
        

    
    
  
      
}
