package com.inosovskyi.app.homework.lesson5;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void multiplicationTestAcceptance() {

        Assert.assertEquals( 9, calculator.multiplication(3, 3));

    }

    @Test
    public void multiplicationTestNegative() {

        Assert.assertNotEquals(9, calculator.multiplication(2, 6));
    }

    @Test
    public void divisionTest() {

        Assert.assertEquals(1, calculator.division(5, 5));

    }

    @Test
    public void divisionTestNegative (){

        Assert.assertNotEquals(10,calculator.division(5,5));
    }

    @Test
    public void incrementTest() {

        Assert.assertEquals(100, calculator.increment(52, 48));
    }

    @Test
    public void incrementTestNegative(){

        Assert.fail("Work in progress, feature is not done");
    }

    @Test
    public void deductionTest() {

        Assert.assertEquals(20, calculator.deduction(25, 5));
    }

    @Test
    public void deductionTestNegative(){

        Assert.assertNotEquals(calculator.trueStatement(),calculator.deduction(0,0));
    }

    @Test
    public void notNullTest() {

        Assert.assertNotNull("should be not null", calculator.random());
    }

    @Test
    public void degreeTest() {

        Assert.assertEquals(9.0, calculator.degree(3, 2), 1);

    }

    @Test
    public void roundTest () {

        Assert.assertEquals(9, calculator.round(3.2, 5.3), 0);
    }

    @Test
    public void sqrtTest (){

        Assert.assertEquals(9,calculator.sqrt(81),0);
    }

    @Test
    public void mathMaxTest(){

        Assert.assertEquals(834,calculator.mathMax(834,50));

    }
    @Test
    public void mathMinTest(){

        Assert.assertEquals(50,calculator.mathMin(834,50));

    }
    @Test
    public void mathMinTestNegative(){

        Assert.assertNotEquals(834,calculator.mathMin(834,50));
    }

    @Test
    public void mathMaxTestNegative(){

        Assert.assertNotEquals(50,calculator.mathMax(834,50));
    }

    @Test
    public void trueStatementTest(){

        Assert.assertTrue(calculator.trueStatement());
    }

    @Test
    public void trueStatementTestNegative(){

        Assert.assertFalse(calculator.trueStatement());
    }

   @Test
   public void sqrtTestObject(){

        Assert.assertEquals(calculator.sqrt(0),calculator.sqrt(0),0);
   }

   @Ignore
   @Test
    public void deductionTestNotNull (){

        Assert.assertNotNull(calculator.deduction(5,5));
   }
}

