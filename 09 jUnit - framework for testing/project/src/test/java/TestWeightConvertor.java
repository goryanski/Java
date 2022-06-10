import org.junit.Assert;
import org.junit.Test;

public class TestWeightConvertor {
    @Test
    public void convertMetersToMillimetersTest() throws Exception {
        WeightConvertor convertor = new WeightConvertor();
        double res = convertor.convertGramToMilligram(4);
        Assert.assertEquals(4000, res, 0);
    }
    @Test
    public void convertKilogramToGramTest() throws Exception {
        WeightConvertor convertor = new WeightConvertor();
        double res = convertor.convertKilogramToGram(4);
        Assert.assertEquals(4000, res, 0);
    }
    @Test
    public void convertKilogramToCentnerTest() throws Exception {
        WeightConvertor convertor = new WeightConvertor();
        double res = convertor.convertKilogramToCentner(40);
        Assert.assertEquals(0.4, res, 0);
    }
    @Test
    public void convertKilogramToTonTest() throws Exception {
        WeightConvertor convertor = new WeightConvertor();
        double res = convertor.convertKilogramToTon(40);
        Assert.assertEquals(0.04, res, 0);
    }
}
