
import java.util.Scanner;

public class Punto_12 {
    public static void main(String[]args) {
        //algoritmo para intercambiar el valor entre 2 variables
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor de A: ");
        a = sc.nextInt();
        System.out.println("ingrese el valor de B: ");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("el valor de B ahora es: " + b);
        System.out.println("el valor de A ahora es: " + a);
        
    }
}
