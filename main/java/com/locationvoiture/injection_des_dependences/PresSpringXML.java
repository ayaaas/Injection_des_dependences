package com.locationvoiture.injection_des_dependences;

import com.locationvoiture.injection_des_dependences.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        IMetier metier = (IMetier)SpringContext.getBean(IMetier.class);
        System.out.println("res"+metier.calcul());

    }