package com.codegym.generate;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class ServiceIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String prefix = "SE-";
        return prefix + generaRandomNumber();
    }
    private  static String generaRandomNumber(){
        Random random= new Random();
        return String.format("%d", random.nextInt(10000));
    }
}
