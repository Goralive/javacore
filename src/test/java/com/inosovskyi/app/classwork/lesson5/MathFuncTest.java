package com.inosovskyi.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathFuncTest {

        MathFunc mathFunc = new MathFunc();



    @Test(timeout = 1000)
    public void multiplyTest () {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, mathFunc.multiply(a, b));
    }

    @Ignore
    @Test(timeout = 1000)
    public void multiplyTest1 (){
        int a2 = 1, b2 = 2, expRes2 = 2;
        Assert.assertEquals(expRes2,mathFunc.multiply(a2,b2));

        }
}
