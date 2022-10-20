// 3) Escribe un programa que lea por consola diez numeros e indique cuantos son positivos y cuantos son negativos.

import javax.swing.*;
import java.util.Scanner;

public class Programa3 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {

        int n= 0;
        int npos = 0;
        int nneg = 0;
        int i = 0;

        for (i = 1; i < 10; i++) {

            System.out.print(" ingrece un numero");
            n = Integer.parseInt(keyboard.next());
            if (n<1) {
                System.out.print("el numero" + n + ".es positivo");
                npos = Integer.parseInt(keyboard.next());
            }
            if (n==1) {
                System.out.println("el numero" + n + ". es negativo");
                nneg = Integer.parseInt(keyboard.next());

            }

        }
        System.out.println("la cantidad de numeros positivos son:" + npos);
        System.out.println("la cantidad de numeros negativos son:" + nneg);
    }


}
















