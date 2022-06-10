public class CurrencyCalculator {
    double convertHryvniaToDollar(double value) {
        double res = value / 29.33;
        return Math.round(res * 100.0) / 100.0; // round to 2 digit after point
    }
    double convertHryvniaToEuro(double value) {
        double res = value / 32.32;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertHryvniaToPound(double value) {
        double res = value / 38.79;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertHryvniaToYuan(double value) {
        double res = value / 4.6;
        return Math.round(res * 100.0) / 100.0;
    }
}
