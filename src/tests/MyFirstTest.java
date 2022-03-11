package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import classes.Calculator;

public class MyFirstTest {
    @Test
    public void testA() {
        Calculator c = new Calculator();

        int r = c.sumA(2, 5);
        assertEquals(r, 42);
    }

    @Test
    public void testB() {
        Calculator c = new Calculator();

        int r = c.sumB(2, 5);
        assertEquals(r, 3);
    }
}
