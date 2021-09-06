// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_1 {
    public static void main(String[]args) {
        //algoritmo que calcula el area del circulo
        float area, pi, r;
        r = 0.0f;
        area = 0.0f;
        pi = 3.1415f;
        Scanner datosEntrada = new Scanner(System.in);
        System.out.println("por favor ingrese su nombre: ");
        String nombre = datosEntrada.nextLine();
        System.out.println("Gracias, " + nombre);
        System.out.println(" por favor ingrese el radio: ");
        r = datosEntrada.nextFloat();
        area = pi * (r * r);
        System.out.println("el area del circulo es: " + area);
    }
}
