package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando a instanca do objeto Scanner no input
        Scanner input = new Scanner(System.in);
        
        // Declarando Variavel e input do usuario
        int x, y, mod;
        
        System.out.print("Digite o primeiro valor: ");
        x = input.nextInt();
        
        System.out.print("Digite o seundo numero: ");
        y = input.nextInt();
        
        // Calculo e verificação via IF
        mod = x % y;
        
        if ( mod == 0 )
            System.out.println("É multiplo do segundo");
        else
            System.out.println("Não é multiplo do segundo");
    }
    
}
