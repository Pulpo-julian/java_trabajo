// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_02 {
    public static void main(String[]args) {
        //algoritmo que calcula el area del triangulo
        float b, h, area;
        b = 12.45f;
        h = 12.5f;
        
        area = (b * h)/2;
        
        System.out.println("el area del triangulo es: " + area);
    }
}