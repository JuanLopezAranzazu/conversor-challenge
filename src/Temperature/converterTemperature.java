package Temperature;

public class converterTemperature {
    public double convertCelciusToFarenheit(double value) {
        double result = value * 1.8 + 32;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertCelciusToKelvin(double value){
        double result = value + 273.15;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertFarenheitToCelcius(double value) {
        double result = (value - 32) / 1.8;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertKelvinToCelcius(double value) {
        double result = value - 273.15;
        result = (double) Math.round(result *100d)/100;
        return result;
    }

    public double convertKelvinToFarenheit(double value) {
        double result = convertKelvinToCelcius(value);
        result = convertCelciusToFarenheit(result);
        result	= (double) Math.round(result *100d)/100;
        return result;
    }
}
