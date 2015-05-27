package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando a instanca do objeto Scanner no input
        Scanner input = new Scanner(System.in);
        
        // Declarando variaveis
        int x, mod;
        
        // Solicitando input do usuario
        System.out.print("Digite o primeiro numero: ");
        x = input.nextInt();
        
        // Calculo e output para usuario
        mod = x % 2;
        
        if ( mod == 0 )
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
    
}
