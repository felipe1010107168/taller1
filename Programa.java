
// 1) Muestre los numeros multiplos de 8 de 0 a 100 utilizando un bucle while.

import java.util.Scanner;

public class Programa {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {

        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i += 8;
        }

    }

}
