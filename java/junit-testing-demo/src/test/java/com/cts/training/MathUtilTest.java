package com.cts.training;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MathUtilTest {

    @Parameter(0)
    public int input;

    @Parameter(1)
    public boolean result;

    private MathUtils mathUtils;

    @Before
    public void init() {
        mathUtils = new MathUtils();
    }

    @Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {6, false},
                {19, true},
                {22, false},
                {23, true}
        });
    }

    @Test
    public void test_isPrime() {
        System.out.println("Input = " + input + ". Expected result = " + result);
        assertEquals(result, mathUtils.isPrime(input));
    }
}
