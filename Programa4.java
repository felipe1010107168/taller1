
//Escriba un programa que calcule el promedio de un conjunto de numeros positivos introducidos por teclado. el programa no sabe cuantos numeros se ingresaran.
//el usuario indicara que ha terminado de ingresar los datos cuando ingrece un numero negativo.

import java.util.Scanner;

public class Programa4 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {

        int num = 0;
        int neg = 0;
        int suma = 0;

        System.out.println("escriba un numero positivo");
        num = Integer.parseInt(keyboard.next());

        System.out.println(" introduce un numero negativo para parar");
        neg = Integer.parseInt(keyboard.next());

        System.out.println("vaya introduciendo numeros:");
        suma = Integer.parseInt(keyboard.next());

        while (neg >= 0) {
            neg = Integer.parseInt(keyboard.next());
            num = Integer.parseInt(keyboard.next());
            suma += neg;
        }

        System.out.println(" el promedio de los numeros introducidos es: ");
        System.out.println((suma - neg) / (num - 1));


    }
}
