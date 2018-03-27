/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zadaniedomowe;

import java.util.Scanner;

/**
 *
 * @author Jakub
 */
public class zadaniedomowe {

    public static void main(String[] args) {
        Scanner pobierz = new Scanner(System.in);
        System.out.println("co policzyc?");
        System.out.println("1- kolo");
        System.out.println("2- kwadrat");
        System.out.println("3- prostokat");
        System.out.println("4- szesican");
        System.out.println("5- prostopadloscian");
        System.out.println("6- kula");
        System.out.println("7- stozek");
        System.out.println("0-wyjdz");
        int czy = pobierz.nextInt();
        while (czy != 0) {

            switch (czy) {
                case 1: {
                    System.out.println("Podaj promien");

                    double r = pobierz.nextDouble();
                    Kolo kolo = new Kolo(r);

                    System.out.format("pole= %.2f\n", kolo.pole(r));
                    System.out.format("obwod= %.2f\n", kolo.obwod(r));
                    break;

                }
                case 2: {
                    System.out.println("Podaj bok");

                    double a = pobierz.nextDouble();
                    Kwadrat kwadrat = new Kwadrat(a);

                    System.out.format("pole= %.2f\n", kwadrat.pole(a));
                    System.out.format("obwod= %.2f\n", kwadrat.obwod(a));
                    break;

                }
                case 3: {
                    System.out.println("Podaj boki");

                    double a = pobierz.nextDouble();
                    double b = pobierz.nextDouble();
                    Prostokat prostokat = new Prostokat(a, b);

                    System.out.format("pole= %.2f\n", prostokat.pole(a, b));
                    System.out.format("obwod= %.2f\n", prostokat.obwod(a, b));
                    break;

                }
                case 4: {
                    System.out.println("Podaj bok");

                    double a = pobierz.nextDouble();

                    Szescian szescian = new Szescian(a);

                    System.out.format("pole= %.2f\n", szescian.pole(a));
                    System.out.format("objetosc= %.2f\n", szescian.objestosc(a));
                    break;

                }
                case 5: {
                    System.out.println("Podaj boki");

                    double a = pobierz.nextDouble();
                    double b = pobierz.nextDouble();
                    double c = pobierz.nextDouble();

                    Prostopadloscian prostopadloscian = new Prostopadloscian(a, b, c);

                    System.out.format("pole= %.2f\n", prostopadloscian.pole(a, b, c));
                    System.out.format("objetosc= %.2f\n", prostopadloscian.objetosc(a, b, c));
                    break;

                }
                case 6: {
                    System.out.println("Podaj promien");

                    double r = pobierz.nextDouble();

                    Kula kula = new Kula(r);

                    System.out.format("pole= %.2f\n", kula.pole(r));
                    System.out.format("objetosc= %.2f\n", kula.objetosc(r));
                    break;

                }
                case 7: {
                    System.out.println("Podaj promien wysokosc i tworzaca");

                    double r = pobierz.nextDouble();
                    double h = pobierz.nextDouble();
                    double l = pobierz.nextDouble();

                    Stozek stozek = new Stozek(r, h, l);

                    System.out.format("pole= %.2f\n", stozek.pole(r, l));
                    System.out.format("objetosc= %.2f\n", stozek.objetosc(r, h));
                    break;

                }
                default: {
                    System.out.println("Bledny numer");
                    break;
                }

            }
            System.out.println("co policzyc?");
            System.out.println("1- kolo");
            System.out.println("2- kwadrat");
            System.out.println("3- prostokat");
            System.out.println("4- szesican");
            System.out.println("5- prostopadloscian");
            System.out.println("6- kula");
            System.out.println("7- stozek");
            System.out.println("0-wyjdz");
            czy = pobierz.nextInt();
        }
    }

}
