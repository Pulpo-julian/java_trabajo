// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_3 {
    public static void main(String[]args) {
        //algoritmo para calcular expresion
        float y1, y2, x1, x2, z;
        y1 = 12;
        y2 = 10.52f;
        x1 = 16.85f;
        x2 = 16.92f;
        
        z = (y1 - y2) / (x1 - x2);
        System.out.println("la expresion es igual a: " + z);
        
    }
}