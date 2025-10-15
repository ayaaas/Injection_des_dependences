package com.locationvoiture.injection_des_dependences.Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp = 23;
        return temp;
    }
}
