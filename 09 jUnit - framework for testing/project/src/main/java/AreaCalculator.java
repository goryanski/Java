public class AreaCalculator {
    int getSquareArea(int a) {
        return a*a;
    }
    double getTriangleArea(int b, int h) {
        return (double) (b * h) / 2;
    }
    int getRectangleArea(int a, int b) {
        return a*b;
    }
    int getRhombusArea(int base, int height) {
        return base * height;
    }
}
