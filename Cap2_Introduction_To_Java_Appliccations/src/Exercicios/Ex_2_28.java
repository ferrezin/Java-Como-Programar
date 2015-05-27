package Exercicios;
import java.util.Scanner;
//import java.lang.Math;
/**
 *
 * @author CPD
 */
public class Ex_2_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando a instanca do objeto Scanner no input
        Scanner input = new Scanner(System.in);
        
        // Declarando e solicitando input do usuario
        float r;
        
        System.out.print("Digite o valor do raio: ");
        r = input.nextFloat();
        
        // Declarando output com calculo dentro do printf
        System.out.println();
        System.out.printf("Diameter = %.2f", 2*r);
        System.out.println();
        System.out.printf("Circumference = %.2f", 2*Math.PI*r);
        System.out.println();
        System.out.printf("Area = %.2f", Math.PI*(r*r));
        System.out.println();
    }
    
}
