public class LengthConvertor {
    double convertMetersToMillimeters(double value) {
        double res = value * 1000;
        return Math.round(res * 100.0) / 100.0; // round to 2 digit after point
    }
    double convertMetersToCentimeters(double value) {
        double res = value * 100;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertMetersToDecimeters(double value) {
        double res = value * 10;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertKilometersToMeters(double value) {
        double res = value * 1000;
        return Math.round(res * 100.0) / 100.0;
    }
    double convertMetersToKilometers(double value) {
        double res = value / 1000;
        return Math.round(res * 100.0) / 100.0;
    }
}
