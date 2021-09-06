// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_04 {
    public static void main(String[]args) {
        //algoritmo para convertir metros a pies y pulgadas
       float metros, pies, pulgadas;
       
       metros = 85.63f;
       pies = metros * 3.28f;
       pulgadas = pies * 12f;
       
       System.out.println("los "+ metros +" metros son igual a " + pies + " pies" );
       System.out.println("los "+ metros +" metros son igual a " + pulgadas + " pulgadas" );
    }
}
