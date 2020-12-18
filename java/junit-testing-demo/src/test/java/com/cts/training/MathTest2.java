package com.cts.training;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathTest2 {

    @Parameters
    public static Collection testValues() {
        return Arrays.asList(new Integer[][]{
                {1, 2, 3},
                {2, 4, 6},
                {4, 7, 11},
                {6, 8, 14},
                {3, 9, 12}
        });
    }

    @Parameter(0)
    public int number1;

    @Parameter(1)
    public int number2;

    @Parameter(2)
    public int expected;

    private Math math;

    @Before
    public void init() {
        math = new Math();
    }

    @Test
    public void test_add() {
        System.out.printf("%d + %d = %d\n", number1, number2, expected);
        Assert.assertEquals(expected, math.add(number1, number2));
    }

    @After
    public void tearDown() {
        math = null;
    }

}
