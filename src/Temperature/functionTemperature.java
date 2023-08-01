package Temperature;

import javax.swing.*;

public class functionTemperature {
    converterTemperature ct=new converterTemperature();
    Object options[]=new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"};

    public double solve(double value){
        String option = (JOptionPane.showInputDialog(null, "Elije una opcion para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, options, "Seleccion")).toString();
        switch(option) {
            case "Grados Celcius a Grados Farenheit":
                return ct.convertCelciusToFarenheit(value);
            case "Grados Celcius a Kelvin":
                return ct.convertCelciusToKelvin(value);
            case "Grados Farenheit a Grados Celcius":
                return ct.convertFarenheitToCelcius(value);
            case "Kelvin a Grados Celcius":
                return ct.convertKelvinToCelcius(value);
            case "Kelvin a Grados Farenheit":
                return ct.convertKelvinToFarenheit(value);
            default:
                return 0;
        }
    }
}
