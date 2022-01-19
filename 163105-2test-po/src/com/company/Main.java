package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static HashMap<Integer, String> DiscountMap(ArrayList<Klient> klist){

        HashMap<Integer, String> mapka = new HashMap<>();

        for(int i=0; i<klist.size(); i++)
        {
            if (DiscountMap(klist.get(i)))
            {
                mapka.put(klist.get(i).getProcentRabatu(), klist.get(i).getnazwa());
            }
        }

        return mapka;

    }
    public static void main(String[] args) {

        ArrayList<Klient> grupa = new ArrayList<Klient>();
        Klient k1 = new Klient("Klient1", "2007-03-09", 5.50);
        Klient k2 = new Klient("Klient2", "2007-03-09", 128.20);
        Klient k3 = new Klient("Klient3", "2009-10-06", 10.99);
        Klient k4 = new Klient("Klient4", "2012-11-03", 10.99);
        Klient k5 = new Klient("Klient6", "2011-12-01", 23.56);
        Klient k6 = new Klient("Klient6", "2013-05-02", 2.36);
        grupa.add(k1);
        grupa.add(k2);
        grupa.add(k3);
        grupa.add(k4);
        grupa.add(k5);
        grupa.add(k6);

        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }
        Collections.sort(grupa);
        System.out.println("\n");

        for(int i=0; i<grupa.size(); i++)
        {
            System.out.println(grupa.get(i));
        }
        System.out.println("\n");

    }
}