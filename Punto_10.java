import java.util.Scanner;
public class Punto_10 {
    public static void main(String[]args){
        double valorP1, valorP2, valorP3, des1, des2, des3, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del producto 1: ");
        String prodUno = sc.nextLine();
        System.out.println("ingrese el nombre del producto 2: ");
        String prodDos = sc.nextLine();
        System.out.println("ingrese el nombre del producto 3: ");
        String prodTres = sc.nextLine();
        System.out.println("ingrese el valor del producto 1: ");
        valorP1 = sc.nextInt();
        System.out.println("ingrese el valor del producto 2: ");
        valorP2 = sc.nextInt();
        System.out.println("ingrese el valor del producto 3: ");
        valorP3 = sc.nextInt();
        des1 = valorP1 - (valorP1 * (2.5/100));
        des2 = valorP2 - (valorP2 * (1.8/100));
        des3 = valorP3 - (valorP3 * (1.3/100));
        total = des1 + des2 + des3;
        System.out.println("el total a pagar de los 3 productos es: " + total);
    }
}
