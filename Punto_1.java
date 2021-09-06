// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_1 {
    public static void main(String[]args) {
        //algoritmo que calcula el area del circulo
        double area, pi, r;
        pi = 3.1415;
        Scanner sc = new Scanner(System.in);
        System.out.println(" por favor ingrese el radio: ");
        r = sc.nextDouble();
        area = pi * (r * r);
        System.out.println("el area del circulo es: " + area);
    }
}
