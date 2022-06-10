public class WeightConvertor {
    double convertGramToMilligram(double value) {
        double res = value * 1000;
        return Math.round(res * 100.0) / 100.0; // round to 2 digit after point
    }
    double convertKilogramToGram(double value) {
        double res = value * 1000;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertKilogramToCentner(double value) {
        double res = value / 100;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertKilogramToTon(double value) {
        double res = value / 1000;
        return Math.round(res * 100.0) / 100.0;
    }
}
