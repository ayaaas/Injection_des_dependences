package com.locationvoiture.injection_des_dependences.Presentation;

import com.locationvoiture.injection_des_dependences.Dao.IDao;
import com.locationvoiture.injection_des_dependences.Metier.IMetier;

import java.io.File;

public class Pres2 {
    //FileFoundException, ClassNotFoundEcxeption, InstantitionException
}
public static void main(String[] args) throws Exception  {
    Scanner scanner = new Scanner(new File("config.txt"));
    class cDao = Class.forName(daoClassName);
    IDao d= (IDao) cDao.newInstance();


    String metierClassName = scanner.nextLine();
    Class cMetier = Class.forName(metierClassName);
    IMetier metier= (IMetier) cMetier.getConstructor(IDao.class).newInstance();

//        IMetier metier = (IMetier)  cMetier.getConstructor().newInstance();
//        Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
//        setDao.invoke(metier,d);
    System.out.println("RES="+metier.calcul());
}