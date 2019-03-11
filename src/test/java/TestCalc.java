import org.junit.Test;
import org.junit.Assert;

import java.math.BigInteger;

public class TestCalc {
    Calc cal = new Calc();

    @Test
    public void testsum()
    {
        int expres = 15;
        int sum = cal.Sum(10,5);
        Assert.assertEquals(expres,sum);
    }

    @Test
    public void testpow()
    {
        BigInteger expres = BigInteger.valueOf(1024);
        BigInteger pow = cal.Pow(2,10);
        Assert.assertEquals(expres,pow);
    }

    @Test
    public void testdiv()
    {
        double expres = 12;
        double div = cal.Division(144,12);
        Assert.assertEquals(expres,div,0);
    }

    @Test
    public void testfact()
    {
        BigInteger expres = BigInteger.valueOf(720);
        BigInteger fact = cal.Fact(6);
        Assert.assertEquals(expres,fact);
    }

    @Test
    public void testbigfact()
    {
        BigInteger expres = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        BigInteger fact = cal.Fact(100);
        Assert.assertEquals(expres,fact);
    }

    @Test
    public void testdivbyzero()
    {
        double expres = Double.POSITIVE_INFINITY;
        double div = cal.Division(144,12);
        Assert.assertEquals(expres,div, Double.POSITIVE_INFINITY);
    }

}
