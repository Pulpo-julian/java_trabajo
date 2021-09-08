
import java.util.Scanner;


public class Punto_14 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double distanciaM = 5830;
        double distanciaK = distanciaM / 1000;
        System.out.println("ingrese el tiempo en decimal \n donde la parte entera son los minutos \n y la decimal son los segundos: ");
        double tiempoM = sc.nextDouble();
        // tiempo de minutos a horas
        double tiempoH = tiempoM / 60;
        // velocidad = distacia / tiempo
        double velocidad = distanciaK / tiempoH;
        System.out.println("la velocidad promedio del vehiculo es de " + velocidad + " km/h");
    }
}
