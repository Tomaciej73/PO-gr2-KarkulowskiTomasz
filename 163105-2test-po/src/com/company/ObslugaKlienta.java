package com.company;

import java.util.ArrayList;

public class ObslugaKlienta{

    static double ProcentRabatu;
    private ArrayList<Klient> lista;

    public ObslugaKlienta(ArrayList<Klient> lista) {
        this.lista =lista;
    }
    public void setProcentRabatu(){
        double nowa_cena=0.05;
        ProcentRabatu = nowa_cena;
    }
    public static double discountAmount(Klient k){
        if(k.getrachunek() >300){
            return k.getrachunek()*ProcentRabatu;
        }
        else{
            return 0;
        }
    }
}
