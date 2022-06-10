import org.junit.Assert;
import org.junit.Test;

public class TestCurrencyCalculator {
    @Test
    public void convertHryvniaToDollarTest() throws Exception {
        CurrencyCalculator convertor = new CurrencyCalculator();
        double res = convertor.convertHryvniaToDollar(100);
        Assert.assertEquals(3.41, res, 0);
    }
    @Test
    public void convertHryvniaToEuroTest() throws Exception {
        CurrencyCalculator convertor = new CurrencyCalculator();
        double res = convertor.convertHryvniaToEuro(100);
        Assert.assertEquals(3.09, res, 0);
    }
    @Test
    public void convertHryvniaToPoundTest() throws Exception {
        CurrencyCalculator convertor = new CurrencyCalculator();
        double res = convertor.convertHryvniaToPound(100);
        Assert.assertEquals(2.58, res, 0);
    }
    @Test
    public void convertHryvniaToYuanTest() throws Exception {
        CurrencyCalculator convertor = new CurrencyCalculator();
        double res = convertor.convertHryvniaToYuan(100);
        Assert.assertEquals(21.74, res, 0);
    }
}
