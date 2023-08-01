package Currency;

import javax.swing.*;

public class functionCurrency {
    converterCurrency cc=new converterCurrency();
    Object options[]={"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"};
    public double solve(double value){
        String option = (JOptionPane.showInputDialog(null,
                "Elije una opcion para convertir ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, options,
                "Seleccion")).toString();
        switch(option) {
            case "De Pesos a Dólar":
                return cc.convertPesosADollars(value);
            case "De Pesos a Euro":
                return cc.convertPesosToEuros(value);
            case "De Pesos a Libras":
                return cc.convertPesosToPounds(value);
            case "De Pesos a Yen":
                return cc.convertPesosToYen(value);
            case "De Pesos a Won Coreano":
                return cc.convertPesosToWon(value);
            case "De Dólar a Pesos":
                return cc.convertDollarsToPesos(value);
            case "De Euro a Pesos":
                return cc.convertEurosToPesos(value);
            case "De Libras a Pesos":
                return cc.convertPoundsToPesos(value);
            case "De Yen a Pesos":
                return cc.convertYenToPesos(value);
            case "De Won Coreano a Pesos":
                return cc.convertWonToPesos(value);
            default:
                return 0;
        }
    }
}
