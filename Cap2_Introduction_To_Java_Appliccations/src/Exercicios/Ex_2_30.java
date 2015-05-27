package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando a instanca do objeto Scanner no input
        Scanner input = new Scanner(System.in);
        
        // Declarando e solcitando input do usuario
        int x, mod1, mod2, mod3, mod4,letra1, letra2, letra3, letra4, letra5;
        
        System.out.print("Digite o numero composto de 5 digitos: ");
        x = input.nextInt();
        
        letra1 = x / 10000;
        mod1 = x % 10000;
        letra2 = mod1 / 1000;
        mod2 = mod1 % 1000;
        letra3 = mod2 / 100;
        mod3 = mod2 % 100;
        letra4 = mod3 / 10;
        letra5 = mod3 % 10;
        
        System.out.println();
        System.out.printf("%d   %d   %d   %d   %d", letra1, letra2, letra3, letra4,
                letra5);
        System.out.println();
    }
    
}
