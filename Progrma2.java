
// 2) Escribe un programa que diga cual es la primera cifra de un numero entero introducido por teclado.se permiten numeros de hata 5 cifras.

import java.util.Scanner;

public class Progrma2 {
    public static Scanner keyboard = new Scanner (System.in);
    public static void main(String args[]) {


        int primera = 0;
        int n = 0;

        System.out.print(" introduzca un número entero positivo ");
        n = Integer.parseInt(keyboard.next());


        if (n < 10) {
            primera = n;

        }

        if ((n >= 10) && (n < 100)) {
            primera = n / 10;
        }

        if ((n >= 100) && (n < 1000)) {
            primera = n / 100;
        }

        if ((n >= 1000) && (n < 10000)) {
            primera = n / 1000;
        }

        if ((n >= 10000) && (n < 100000)) {
            primera = n / 10000;
        }

        System.out.println("La primera cifra del número introducido es " + primera + ".");
    }
}
