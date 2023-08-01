package Currency;

public class converterCurrency {
    public double convertPesosADollars(double value) {
        double result = value / 3739.00;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertPesosToEuros(double value) {
        double result = value / 4050.48;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertPesosToPounds(double value) {
        double result = value / 4890.52;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertPesosToYen(double value) {
        double result = value / 29.68;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertPesosToWon(double value) {
        double result = value / 3.04;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertDollarsToPesos(double value) {
        double result = value * 3739.00;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertEurosToPesos(double value) {
        double result = value * 4050.48;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertPoundsToPesos(double value) {
        double result = value * 4890.52;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertYenToPesos(double value) {
        double result = value * 29.68;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertWonToPesos(double value) {
        double result = value * 3.04;
        result = (double) Math.round(result *100d)/100;
        return result;
    }
}
