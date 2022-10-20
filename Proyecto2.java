import javax.swing.*;
import java.util.Scanner;

public class Proyecto2 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 0;
        int estatura = 0;
        int Nacionalidad = 0;
        int edad = 0;
        int contN = 0;
        int contHinduAlto= 0;
        int contLatinoMediano=0;
        int contGermanoBajo=0;
        int contGermanoMenorA20=0;


        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de registros"));
        while (contN < n) {
            estatura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su estatura deacuerdo los valores establecidos"));
            Nacionalidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nacionalidad"));
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));

            if (Nacionalidad==3 && estatura==1)
              contHinduAlto++;

            if (Nacionalidad==1 && estatura==3)
                contLatinoMediano++;

            if (Nacionalidad==2 && estatura==2)
                contGermanoBajo++;

            if (Nacionalidad==2 && edad<20)
                contGermanoMenorA20++;


            contN ++;
        }

        JOptionPane.showMessageDialog(null,"La cantidad de indúes altos es: " +contHinduAlto);
        JOptionPane.showMessageDialog(null,"La cantidad de latinos medianos es:  " +contLatinoMediano);
        JOptionPane.showMessageDialog(null,"La cantidad germanos bajos es: " +contGermanoBajo);
        JOptionPane.showMessageDialog(null,"La cantidad de germanos menores a 20 años " +contGermanoMenorA20);
    }
}

