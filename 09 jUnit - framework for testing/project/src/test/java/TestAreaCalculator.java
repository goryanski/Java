import org.junit.Assert;
import org.junit.Test;

public class TestAreaCalculator {
    @Test
    public void getSquareAreaTest() throws Exception {
        AreaCalculator calculator = new AreaCalculator();
        int area = calculator.getSquareArea(5);
        Assert.assertEquals(25, area);
    }
    @Test
    public void getTriangleAreaTest() throws Exception {
        AreaCalculator calculator = new AreaCalculator();
        double area = calculator.getTriangleArea(3, 2);
        Assert.assertEquals(3, area, 0); // delta = погрешность
    }
    @Test
    public void getRectangleAreaTest() throws Exception {
        AreaCalculator calculator = new AreaCalculator();
        int area = calculator.getRectangleArea(5, 10);
        Assert.assertEquals(50, area);
    }
    @Test
    public void getRhombusAreaTest() throws Exception {
        AreaCalculator calculator = new AreaCalculator();
        int area = calculator.getRhombusArea(10, 7);
        Assert.assertEquals(70, area);
    }
}
