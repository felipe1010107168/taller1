
// 8) Crea un programa que reciba por consola 10 numeros y que luego los muestre en orden inverso, es decir,
// el primero que se ingresa es el ultimo en mostrarse y viceversa.

import java.util.Scanner;

public class Programa8 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner datos = new Scanner(System.in);
        System.out.println("introdusca 10 numeros");
        int num[] = new int[10];

        num[0] = datos.nextInt();
        num[1] = datos.nextInt();
        num[2] = datos.nextInt();
        num[3] = datos.nextInt();
        num[4] = datos.nextInt();
        num[5] = datos.nextInt();
        num[6] = datos.nextInt();
        num[7] = datos.nextInt();
        num[8] = datos.nextInt();
        num[9] = datos.nextInt();

        System.out.println("orden inverso");

        for (int i = 9; i >= 1; i--){
            System.out.println(num[i]);
        }



    }
}
