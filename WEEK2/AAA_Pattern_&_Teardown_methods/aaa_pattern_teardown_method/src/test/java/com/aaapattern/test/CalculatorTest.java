package com.aaapattern.test;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest 
{
    private Calculator calculator;
    @Before
    public void setUp() {
        System.out.println("Setting up the test environment...");
        calculator = new Calculator();
    }
    
    @After
    public void tearDown() {
        System.out.println("Cleaning up after the test...");
        calculator = null; // Clear the calculator instance
    }

    @Test
    public void testSubtraction(){
        System.out.println("Running testSubtraction...");
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    public void testAddition(){
        System.out.println("Running testAddition...");
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}
