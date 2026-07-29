package org.example.calcapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculation {
    Logger logger= LoggerFactory.getLogger(Calculation.class);
    public double add(double a,double b){
        logger.debug("Adding {} and {}",a,b);
        return a+b;
    }
    public double sub(double a,double b){
        logger.debug("Sub {} and {}",a,b);
        return a-b;
    }
    public double mul(double a,double b){
        logger.debug("mul {} and {}",a,b);
        return a*b;
    }
    public double div(double a,double b){
        logger.debug("div {} and {}",a,b);
        return a/b;
    }

}
