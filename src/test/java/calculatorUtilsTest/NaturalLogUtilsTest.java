package calculatorUtilsTest;

import calculatorUtils.NaturalLogUtils;
import org.junit.Assert;
import org.junit.Test;

public class NaturalLogUtilsTest {

    @Test
    public void negativeNumberTest(){
        NaturalLogUtils naturalLogUtils = new NaturalLogUtils();
        Assert.assertTrue(Double.isNaN(naturalLogUtils.computeNaturalLog(-1.0)));
    }
    @Test
    public void positiveNumberTest(){
        NaturalLogUtils naturalLogUtils = new NaturalLogUtils();
        Assert.assertEquals(naturalLogUtils.computeNaturalLog(30.0), 3.4011973816621555, 0.00001);
    }
    @Test
    public void zeroTest(){
        NaturalLogUtils naturalLogUtils = new NaturalLogUtils();
        Assert.assertTrue(Double.isInfinite(naturalLogUtils.computeNaturalLog(0.0)));
    }
}
