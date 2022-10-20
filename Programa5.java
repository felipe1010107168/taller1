
//crea un arreglo de 10 caracteres con el nombre caracteres y asigna valores a los elementos segun la siguiente tabla

import javax.swing.*;
import java.util.Scanner;

public class Programa5 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int caracteres;


        caracteres = Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad de caracteres"));
        char[] letras = new char[caracteres];

        System.out.println("Digite los elemnetos del arreglo:");
        for (int i = 0; i < caracteres; i++) {
            System.out.println((i + 0) + "Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("\n los caracteres del arreglo son ");
        for (int i = 0; i < caracteres; i++) {
            System.out.println(letras[i] + " ");
        }


    }
}
