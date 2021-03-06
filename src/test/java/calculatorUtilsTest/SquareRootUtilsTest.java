package calculatorUtilsTest;

import calculatorUtils.SquareRootUtils;
import org.junit.Assert;
import org.junit.Test;

public class SquareRootUtilsTest {

    @Test
    public void testNegetiveNumber(){
        SquareRootUtils squareRootUtils = new SquareRootUtils();
        Double input = -4.0;
        Assert.assertTrue(Double.isNaN(squareRootUtils.performSquareRoot(input)));
    }

    @Test
    public void testPositiveNumber(){
        SquareRootUtils squareRootUtils = new SquareRootUtils();
        Double input = 4.0;
        Assert.assertEquals(squareRootUtils.performSquareRoot(input), 2.0,0.000000);

    }

    @Test
    public void testWithZero(){
        SquareRootUtils squareRootUtils = new SquareRootUtils();
        Double input = 0.0;
        Assert.assertEquals(squareRootUtils.performSquareRoot(input),
                0.0, 0.0);
    }

    @Test
    public void testPerfectSquare(){
        SquareRootUtils squareRootUtils = new SquareRootUtils();
        Double input = 16.0;
        Double res = squareRootUtils.performSquareRoot(input);
        Assert.assertTrue(res == Math.floor(res));

    }

    @Test
    public void testNonPerfectSquare(){
        SquareRootUtils squareRootUtils = new SquareRootUtils();
        Double input = 20.20;
        Double res = squareRootUtils.performSquareRoot(input);
        Assert.assertTrue(res > Math.floor(res));
    }

}
