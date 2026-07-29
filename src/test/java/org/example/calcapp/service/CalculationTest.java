package org.example.calcapp.service;

import org.example.calcapp.service.Calculation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculationTest {
    Logger logger= LoggerFactory.getLogger(CalculationTest.class);
    Calculation cal;

    @BeforeEach
    public void setUp() {
        logger.info("set - up");
        cal= new Calculation();
    }

    @Test
    public void testAdd() {
        Assertions.assertNotNull(cal, "Calculation is null");
        Assertions.assertEquals(9,cal.add(4,5));
    }
    @Test
    public void testSubtract() {
        Assertions.assertNotNull(cal, "Calculation is null");
        Assertions.assertEquals(9,cal.sub(19,10));
    }
    @Test
    public void testMul() {
        Assertions.assertNotNull(cal, "Calculation is null");
        Assertions.assertEquals(9,cal.mul(9,1));
    }
    @Test
    public void testdiv(){
        Assertions.assertNotNull(cal,"calculation is null");
        Assertions.assertEquals(4,cal.div(16,4));
    }
    @AfterEach
    public void tearDown() {
        cal = null;
        logger.info("tearDown:- intitaled and service instance destroyed");
    }

}