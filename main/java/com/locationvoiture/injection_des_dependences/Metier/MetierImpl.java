package com.locationvoiture.injection_des_dependences.Metier;

import com.locationvoiture.injection_des_dependences.Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {


    @Autowired
    private IDao dao;

    //pour injecter dans l'attribut dao
    //un objet d'une classe qui implemente l'interface idao
    //au moment de l'instantiation
    public MetierImpl(IDao dao) {
        this.dao = dao;//couplage faible

    }
    public MetierImpl() {

    }

    @Override
    public double calcul() {
        double t = dao.getData();
      double res = t* 12 *Math.PI/2 *Math.cos(t);
      return res;
    }


//pour injecter  dans l'attribut dao
// un objet d'une classe qui implemente l'interface DAO
//apres instantiation
//constructeur
public void setDao(IDao dao) {
    this.dao = dao;
}
}
