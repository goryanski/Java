import org.junit.Assert;
import org.junit.Test;

public class TestLengthConvertor {
    @Test
    public void convertMetersToMillimetersTest() throws Exception {
        LengthConvertor convertor = new LengthConvertor();
        double res = convertor.convertMetersToMillimeters(4);
        Assert.assertEquals(4000, res, 0);
    }
    @Test
    public void convertMetersToCentimetersTest() throws Exception {
        LengthConvertor convertor = new LengthConvertor();
        double res = convertor.convertMetersToCentimeters(4);
        Assert.assertEquals(400, res, 0);
    }
    @Test
    public void convertMetersToDecimetersTest() throws Exception {
        LengthConvertor convertor = new LengthConvertor();
        double res = convertor.convertMetersToDecimeters(4);
        Assert.assertEquals(40, res, 0);
    }
    @Test
    public void convertKilometersToMetersTest() throws Exception {
        LengthConvertor convertor = new LengthConvertor();
        double res = convertor.convertKilometersToMeters(4);
        Assert.assertEquals(4000, res, 0);
    }
    @Test
    public void convertMetersToKilometersTest() throws Exception {
        LengthConvertor convertor = new LengthConvertor();
        double res = convertor.convertMetersToKilometers(4000);
        Assert.assertEquals(4, res, 0);
    }
}
