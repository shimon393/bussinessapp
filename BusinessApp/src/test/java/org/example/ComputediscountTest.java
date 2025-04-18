package org.example;

import junit.framework.TestCase;

public class ComputediscountTest extends TestCase {

    public void testGetdiscount() {
        double ExpectedDiscount = 12000;
        Computediscount CD = new Computediscount();
        double ActualDiscount = CD.Getdiscount(0.10, 600, 200);
        assertEquals(ExpectedDiscount, ActualDiscount);
    }
}