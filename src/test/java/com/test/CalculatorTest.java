package com.test;

import com.example.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTesting()
    {
        Calculator c = new Calculator();
        int res = c.add(1,2);
        Assert.assertEquals(res,3);
        //if( res != 3){
       //     throw new RuntimeException("calculator sum failed");
        //}
    }
}
