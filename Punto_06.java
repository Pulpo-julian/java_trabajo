// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_06 {
    public static void main(String[]args) {
       //algoritmo para calcular el iva de un precio
       int precio;
       double precioIva, total;
       Scanner sc = new Scanner(System.in);
       System.out.println("por favor ingrese su precio: ");
       precio = sc.nextInt();
       precioIva = precio * 0.19;
       total = precioIva + precio;
       
       System.out.println("el iva de su precio es: " + precioIva);
       System.out.println("el precio total con iva es: " + total);
    }
}
