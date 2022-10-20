import java.util.Scanner;

public class Programa102 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        double num, area, perimetro;

        System.out.println("Datos del cuadrado");
        System.out.println("ingrece el lado del cuadrado");
        num = entrada.nextInt();

        area = 1 * 1;
        perimetro = 4 * 1;

        System.out.println("alto = " + area);
        System.out.println("ancho = " + perimetro);


    }
}
