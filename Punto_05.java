// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_05 {
    public static void main(String[]args) {
        //algoritmo para convertir temperatura en C a F
       float cent, fah;
       
       cent = 36.7f;
       fah = ((9/5)*cent) + 32f;
       
       System.out.println("la temperatura en grados Fharenheit es: "+ fah);
       
    }
}
