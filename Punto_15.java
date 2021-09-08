
import java.util.Scanner;


public class Punto_15 {
    public static void main(String[]args) {
        int cantPisos, tiempoCaida;
        double alturaPiso, velocidad, disTotal;
        cantPisos = 40;
        alturaPiso = 3.5;
        disTotal = cantPisos * alturaPiso;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tiempo en segundos que tardo en caer: ");
        tiempoCaida = sc.nextInt();
        velocidad = disTotal / tiempoCaida;
        System.out.println("la velocidad promedio es de: " + velocidad + " Mts/seg");
    }
}
