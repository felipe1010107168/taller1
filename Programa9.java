
// 9) escriba un programa que ordene tres numeros enteros introducidos por teclado. que los mustre sin ordenar y despues ordenados por consola

import javax.swing.*;
import java.util.Scanner;

public class Programa9 {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));

        arreglo = new int[nElementos];

        for (int i = 0; i < 3; i++){
            System.out.println((i+1)+".Digite un numero ");
            arreglo [i] = entrada.nextInt();
        }
        for (int i=0;i<(nElementos-1);i++){
            for (int j=0;j<(nElementos-1);j++){
                if (arreglo[j] > arreglo [j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;

                }
            }

        }
        System.out.println("\n arreglo en forma ordenada");
        for(int i=0; i<nElementos;i++){
            System.out.println(arreglo[i]+"-");
        }
        System.out.println("");


    }

}
