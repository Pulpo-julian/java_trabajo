
import java.util.Scanner;



public class Punto_11 {
    public static void main(String[]args) {
        double at1, at2, at3, at4, at5, at6, at7, at8, pro;
        int cantAtl = 8, metros = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tiempo en segundos del atleta 1: ");
        at1 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 2: ");
        at2 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 3: ");
        at3 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 4: ");
        at4 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 5: ");
        at5 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 6: ");
        at6 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 7: ");
        at7 = sc.nextInt();
        System.out.println("ingrese el tiempo en segundo del atleta 8: ");
        at8 = sc.nextInt();
        //velocidad = distancia/tiempo;
        at1 = metros / at1;
        at2 = metros / at2;
        at3 = metros / at3;
        at4 = metros / at4;
        at5 = metros / at5;
        at6 = metros / at6;
        at7 = metros / at7;
        at8 = metros / at8;
        pro = (at1 + at2 + at3 + at4 + at5 + at6 + at7 +at8) / cantAtl;
        System.out.println("la velocidad promedio es: " + pro + " metros por segundo");
        
        
    }
}
