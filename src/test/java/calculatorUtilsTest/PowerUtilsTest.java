package calculatorUtilsTest;

import calculatorUtils.PowerUtils;
import org.junit.Assert;
import org.junit.Test;

public class PowerUtilsTest {

    @Test
    public void positivePower(){
        PowerUtils powerUtils = new PowerUtils();
        Assert.assertEquals(powerUtils.computePower(2.0,3.0), 8.0, 0.001);
        Assert.assertEquals(powerUtils.computePower(3.1,3.0), 29.791, 0.001);
        Assert.assertEquals(powerUtils.computePower(128.0,0.0), 1.0, 0.001);
    }

    @Test
    public void negativePower(){
        PowerUtils powerUtils = new PowerUtils();
        Assert.assertEquals(powerUtils.computePower(2.0,-1.0), 0.5, 0.001);
        Assert.assertEquals(powerUtils.computePower(3.1,-2.0), 0.104058273, 0.001);
    }

    @Test
    public void fractionalPower(){
        PowerUtils powerUtils = new PowerUtils();
        Assert.assertEquals(powerUtils.computePower(64.0,1.0/6), 2.0, 0.001);
        Assert.assertEquals(powerUtils.computePower(27.0,1.0/3), 3.0, 0.001);
    }

}
