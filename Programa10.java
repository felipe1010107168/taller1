
// 10) herencia

import java.util.Scanner;

public class Programa10 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        double radio, perimetro, area;
        System.out.println("muestreme el radio del circulo:");
        radio=teclado.nextDouble();
        perimetro=radio*2;
        area=(3.1416)*(radio*radio);
        System.out.println("el perimetro del circulo es:"+perimetro);
        System.out.println("el area del circulo es:"+area);




    }
}




