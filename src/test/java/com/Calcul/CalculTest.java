package com.Calcul;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculTest {

    @Test
    public void testCalculNote() {
        double expected = 5;
        Calcul calcul = new Calcul();
        double result = calcul.calculNote(5,5);
        assertEquals(5,result);
    }

    @Test
    public void testCompare() {
        int x = 1;
        int y = 1;
        Calcul calcul = new Calcul();
        double result = calcul.compare(x,y);
        assertEquals(2,result);
    }

}
