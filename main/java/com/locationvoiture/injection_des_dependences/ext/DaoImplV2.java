package com.locationvoiture.injection_des_dependences.ext;
import  com.locationvoiture.injection_des_dependences.Dao.IDao;
import org.springframework.stereotype.Component;

public class DaoImplV2 {
    @Component("d2")

    public class DaoImplV2 implements  IDao {
        @Override
        public double getData() {
            System.out.println("version webservice");
            return 43;
        }
    }

    }

