package com.lcwd.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void testGreet(){
        App app = new App();
        String nameString = app.greet("Friends");
        assertEquals("Hello Friends!", nameString);
    }

    @Test
    public void testAdd(){
        App app = new App();
        int sum = app.add(10, 20);
        assertEquals(30, sum);
    }

}
