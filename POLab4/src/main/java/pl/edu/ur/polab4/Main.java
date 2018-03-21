package pl.edu.ur.polab4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    
   
    
    

    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);
        System.out.println("podaj");
        String imie = pobierz.nextLine();
        System.out.println("podaj");
        String nazwisko = pobierz.nextLine();
        System.out.println("podaj");
        String kierunek_studiow = pobierz.nextLine();
        System.out.println("podaj nr");
        int rok_studiow = pobierz.nextInt();
        pobierz.nextLine();
        System.out.println("podaj nr indeksu");
        int nr_indeksu = pobierz.nextInt();
        pobierz.nextLine();
        
        Student std = new Student(imie, nazwisko, nazwisko, rok_studiow, nr_indeksu);
         System.out.println(std.toString());
      
               
      
       
        
        
        
    }
    
}
