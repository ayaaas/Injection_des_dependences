package com.locationvoiture.injection_des_dependences.Presentation;

import com.locationvoiture.injection_des_dependences.ext.DaoImplV2;
import com.locationvoiture.injection_des_dependences.Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);//injection des dependances via les setters
        System.out.println("RES="+metier.calcul());
    }
}
