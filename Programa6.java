
// 6) escribe un programa que recibe un numero por consola e imprima una una piramide de nuemros.

import java.util.Scanner;

public class Programa6 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de niveles que tendrá la pirámide: ");
        int numeroNiveles = scanner.nextInt();

        int numeroPosiciones = numeroNiveles * 2 - 1;
        int posdesendente = numeroNiveles;
        int posasendente = numeroNiveles;


        for (int i = 0; i < numeroNiveles; i++) {
            int contador = 1;
            String resultado = "";

            for (int j = 0; j <= numeroPosiciones; j++) {
                if ((j < posdesendente) || (j > posasendente )) {
                    resultado += " ";
                } else {
                    if (j < numeroNiveles) {
                        resultado += contador;
                        contador++;
                    } else {
                        resultado += contador;
                        contador--;
                    }
                }
            }
            System.out.println(resultado);
            posasendente ++;
            posdesendente--;
        }
    }
}
























