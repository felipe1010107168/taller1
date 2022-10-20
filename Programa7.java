
// 7) Crea un programa que solicite por consola 8 numeros enteros y que luego muestre esos numeros junto con la palabra "par" o "impar".

import java.util.Scanner;

public class Programa7 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrece la cantidad:");
        int n = num.nextInt();
        for (int i = 1; i <= 8; i++) {
            System.out.println("Ingrece un numero:");
            int numero = num.nextInt();
            if (numero % 2 == 0) {
                System.out.println("es par");
            } else {
                System.out.println("es impar");
            }

        }


    }
}
