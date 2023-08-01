import javax.swing.*;
import Temperature.*;
import Currency.*;

public class Main {
    public static void main(String[] args) {
        functionTemperature ft=new functionTemperature();
        functionCurrency fc=new functionCurrency();

        Object options[]={"Conversor de moneda","Conversor de temperatura"};
        boolean flag=true;
        while(flag){
            String option=(JOptionPane.showInputDialog(null,"Seleccione una opcion ", "Menu", JOptionPane.QUESTION_MESSAGE, null,options,"Seleccion")).toString();
            String input;
            switch (option){
                case "Conversor de moneda":
                    input=JOptionPane.showInputDialog(null,"Ingrese la cantidad:");
                    if(isNumeric(input)){
                        double answer=fc.solve(Double.parseDouble(input));
                        JOptionPane.showMessageDialog(null,"La respuesta es: "+answer);
                    }else {
                        JOptionPane.showMessageDialog(null, "Entrada incorrecta");
                    }
                    break;
                case "Conversor de temperatura":
                    input=JOptionPane.showInputDialog(null,"Ingrese la cantidad:");
                    if(isNumeric(input)){
                        double answer=ft.solve(Double.parseDouble(input));
                        JOptionPane.showMessageDialog(null,"La respuesta es: "+answer);
                    }else {
                        JOptionPane.showMessageDialog(null, "Entrada incorrecta");
                    }
                    break;
            }
            int answer=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
            if(!(JOptionPane.OK_OPTION==answer)){
                JOptionPane.showMessageDialog(null,"Programa terminado");
                flag=false;
            }
        }

    }

    public static boolean isNumeric(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}