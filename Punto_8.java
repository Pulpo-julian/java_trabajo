// se importa esto para poder leer y escribir datos
import java.util.Scanner;
public class Punto_8 {
    public static void main(String[]args) {
        //algoritmo que calcula el salario y nombre de empleado
        int horasExtDi, valorDi, valorNoc, horasExtNoc, valorBas, totalQuin;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("ingrese cantidad de horas extras diurnas: ");
        horasExtDi = sc.nextInt();
        System.out.println("ingrese cantidad de horas extras nocturnas: ");
        horasExtNoc = sc.nextInt();
        System.out.println("ingrese valor basico de horas: ");
        valorBas = sc.nextInt();
        System.out.println("el nombre del empleado es: " + nombre);
        System.out.println("la cantidad de horas extras diurnas es: " + horasExtDi);
        System.out.println("la cantidad de horas extras nocturnas es: " + horasExtNoc);
        System.out.println("el valor basico es: " + valorBas);
        valorDi = valorBas + (valorBas * (25 / 100));
        valorNoc = valorBas + (valorBas * (75 / 100));
        totalQuin = (valorDi * horasExtDi) + (valorNoc * horasExtNoc);
        System.out.println("el valor de la quincena es: " + totalQuin);

    }
}