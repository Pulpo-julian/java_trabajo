import java.util.Scanner;
public class Punto_09 {
    public static void main(String[]args) {
        int cant, valUni, saldoIn, entrada, salida, saldoFin, mov;
        Scanner sc = new Scanner(System.in); 
        System.out.println("ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("el nombre del producto es: " + nombre);
        System.out.println("ingrese la cantidad de " + nombre);
        cant = sc.nextInt();
        System.out.println("ingrese el valor unitario: ");
        valUni = sc.nextInt();
        saldoIn = valUni * cant;
        System.out.println("ingrese la cantidad de entradas: ");
        entrada = sc.nextInt();
        System.out.println("ingrese cantidad de salidas: ");
        salida = sc.nextInt();
        mov = (entrada - salida) * valUni;
        saldoFin = saldoIn + mov;
        System.out.println("el saldo final es: " + saldoFin);
        System.out.println("el valor de la mercancia es: " + mov);
    }
}
