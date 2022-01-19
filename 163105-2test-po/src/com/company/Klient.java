package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Klient implements Cloneable, Comparable<Klient>{

    private String nazwa;
    private LocalDate dataZakupy;
    private double rachunek;


    public Klient(String nazwa, LocalDate dataZakupy, double rachunek){
        this.nazwa = nazwa;
        this.dataZakupy = dataZakupy;
        this.rachunek = rachunek;
    }

    public String getnazwa() {
        return nazwa;
    }

    public LocalDate getdataZakupy() {
        return dataZakupy;
    }

    public double getrachunek() {
        return rachunek;
    }

    public int compareTo(Klient k){
        int k1 = dataZakupy.compareTo(k.dataZakupy);
        int k2 = dataZakupy.compareTo(k.dataZakupy);
        int nazwa1 = nazwa.compareTo(k.nazwa);
        int nazwa2 = nazwa.compareTo(k.nazwa);
        int rachunek1 = rachunek.compareTo(k.rachunek);
        int rachunek2 = rachunek.compareTo(k.rachunek);
        if(k1==k2){
            return 1;
        }
        if(nazwa1==nazwa2) {
            return 1;
        }
        if(rachunek1==rachunek2) {
            return 1;
        }
    }

    public class ObslugaKlienta{

        static double ProcentRabatu;
        private ArrayList<Klient>

        public static void setProcentRabatu() {
            ProcentRabatu = 0.05;
        }
    }
    public class discountAmount(Klient k){
        double k=rachunek*ProcentRabatu;
        if(k>300){
            return 1;
        }
}
