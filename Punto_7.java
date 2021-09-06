// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_7 {
    public static void main(String[]args) {
        //algoritmo que muestra las unidades, decenas, centenas, miles de valor numerico
        int valor, miles, cent, dec, uni;
        System.out.println("ingrese un numero de 4 digitos");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
        uni = valor % 10;
        valor = valor - uni;
        dec = valor % 100;
        valor = valor - dec;
        cent = valor % 1000;
        valor = valor - cent;
        miles = valor % 10000;
        valor = valor - miles;
        System.out.println("miles = " + miles/1000);
        System.out.println("Centenas = " + cent/100);
        System.out.println("Decenas = " + dec/10);
        System.out.println("Unidades = " + uni);

    }
}
