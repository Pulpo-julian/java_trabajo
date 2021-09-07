
import java.util.Scanner;


public class Punto_13 {
    public static void main(String[]args){
        int cantRetiro, cant50, cant20, cant10, cant5, cant2, cant1;
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor ingrese un valor a retira de 6 digitos que sea multiplo de 1000");
        System.out.println("EJ: 380000 o 452000");
        cantRetiro = sc.nextInt();
        cant50 = cantRetiro / 50000;
        cantRetiro = cantRetiro - (cant50 * 50000);
        cant20 = cantRetiro / 20000;
        cantRetiro = cantRetiro - (cant20 * 20000);
        cant10 = cantRetiro / 10000;
        cantRetiro = cantRetiro - (cant10 * 10000);
        cant5 = cantRetiro / 5000;
        cantRetiro = cantRetiro - (cant5 * 5000);
        cant2 = cantRetiro / 2000;
        cantRetiro = cantRetiro - (cant2 * 2000);
        cant1 = cantRetiro / 1000;
        cantRetiro = cantRetiro - (cant1 * 1000);
        
        System.out.println("El cajero le entregara: ");
        
        
        if (cant50 != 0) {
            System.out.println(cant50 + " billetes de 50.000");
        }
        
        if (cant20 != 0) {
            System.out.println(cant20 + " billestes de 20.000");
        }
        
        if (cant10 != 0) {
            System.out.println(cant10 + " billetes de 10.000");
        }
        
        if (cant5 != 0) {
            System.out.println(cant5 + " billetes de 5.000");
        }
        
        if (cant2 != 0) {
            System.out.println(cant2 + " billetes de 2.000");
        }
        
        if (cant1 != 0) {
            System.out.println(cant1 + " billetes de 1000");
        }
        
        
    }
}
