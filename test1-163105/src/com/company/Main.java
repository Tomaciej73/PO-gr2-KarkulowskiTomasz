package com.company;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.io.FileReader;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Main {
//    public static void showPrimes(int[] list) {
//        int[] tablica = new int[list.length];
//
//        for (int i = 0; i < list.length; i++) {
//            int ile = 0;
//            int zmienna = list[i];
//            for (int j = 2; j < zmienna; j++) {
//                if (zmienna % j == 0) ile += 1;
//                else if (zmienna % j != 0) ile += 0;
//            }
//            if (ile == 0) tablica[i] = zmienna;
//        }
//
//        for (int i = 1; i < tablica.length; i++) {
//            if (tablica[i] != 0) System.out.println(tablica[i]);
//        }
//    }

//            public static void randomowe(int n)
//        {
//
//            Random random = new Random();
//            int r = random.nextInt();
//            int[] tablica = new int[n];
//            int min = -50;
//            int max = 50;
//
//            for(int i=0; i<n; i++)
//            {
//                r = random.nextInt(max - min) + min;
//                tablica[i] = r;
//            }
//
//            System.out.println(" ");
//
//            for(int i=0; i<n; i++)
//            {
//                System.out.println(tablica[i]);
//            }
//
//            System.out.println(" ");
//
//            int wartosc,maxDlugosc,maxWartosc,ile;
//            maxDlugosc = 0;
//            for(int i = 0; i <n; i++ )
//            {
//                wartosc = tablica[ i ]; ile = 0;
//                for(int j = 0; j <n; j++ ) if( tablica [ j ] == wartosc ) ile++;
//                if( ile > maxDlugosc )
//                {
//                    maxDlugosc = ile; maxWartosc = wartosc;
//                }
//            }
//
//            System.out.println("element najczestszy: " + maxDlugosc);
//
//        }

    public static String modify(String str){


        StringBuffer wynik = new StringBuffer();
        StringBuffer cut = new StringBuffer();
        char znak;
        String rezultat;

        if(str.length()%2==0)
        {
            int polowka = ((str.length() / 2)-1);
            znak = str.charAt(polowka);
            wynik = cut.append(znak);
            znak = str.charAt(polowka+1);
            wynik = cut.append(znak);

            rezultat = wynik.toString();
        }
        else
        {
            int polowka2 = ((str.length()-1) / 2);
            znak = str.charAt(polowka2);
            wynik = cut.append(znak);
            rezultat = wynik.toString();
        }

        return rezultat;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//
//        System.out.println("napisz liczbe: ");
//        int n = in.nextInt();
//        int x;
//        int[] lista = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("napisz liczbe: ");
//            x = in.nextInt();
//            lista[i] = x;
//        }
//
//        System.out.println(" ");
//        System.out.println("wynik: ");
//
//        showPrimes(lista);

//        System.out.println("wpisz liczby: ");
//        int y = in.nextInt();
//
//        randomowe(y);
        System.out.println(modify("middle"));

    }
}
