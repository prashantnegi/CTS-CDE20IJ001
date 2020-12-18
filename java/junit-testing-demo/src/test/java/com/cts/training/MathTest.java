package com.cts.training;

import static org.junit.Assert.*;

import org.junit.*;

@Ignore
public class MathTest {

    @Before
    public void buildUp(){
        System.out.println("Before every method...");
    }

    @After
    public void tearDown(){
        System.out.println("After every method");
    }

    @BeforeClass
    public static void buildUpClass(){
        System.out.println("Once for the class...");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("Once for the class...");
    }

    @Test
    public void test_add(){
        Math m = new Math();
        int sum = m.add(1,2);
        assertEquals(3, sum);
    }

    @Test
    public void test_multiply() {

        Math m = new Math();
        int prod = m.multiply(2,2);
        assertEquals(4, prod);
    }
}
