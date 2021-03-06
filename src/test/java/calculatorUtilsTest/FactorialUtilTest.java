package calculatorUtilsTest;

import calculatorUtils.FactorialUtils;
import org.junit.Assert;
import org.junit.Test;

public class FactorialUtilTest {

    @Test
    public void negativeNumberTest(){
        FactorialUtils factorialUtils = new FactorialUtils();
        Assert.assertTrue(factorialUtils.computeFactorial(-2)==-1);
        Assert.assertTrue(factorialUtils.computeFactorial(-3)==-1);
        Assert.assertTrue(factorialUtils.computeFactorial(-4)==-1);
        Assert.assertTrue(factorialUtils.computeFactorial(3)!=-1);
    }
    @Test
    public void zeroTest(){
        FactorialUtils factorialUtils = new FactorialUtils();
        Assert.assertTrue(factorialUtils.computeFactorial(0)==1);
    }
    @Test
    public void positiveNumberTest(){
        FactorialUtils factorialUtils = new FactorialUtils();
        Assert.assertTrue(factorialUtils.computeFactorial(5)==120);
        Assert.assertTrue(factorialUtils.computeFactorial(4)==24);
    }
}
