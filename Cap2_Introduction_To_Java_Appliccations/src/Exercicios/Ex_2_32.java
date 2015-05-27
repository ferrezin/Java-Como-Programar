package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarando a instanca do objeto Scanner no input
        Scanner input = new Scanner(System.in);
        
        // Declarando e solicitando input do usuario
        int n1, n2, n3, n4, n5, positivo = 0, negativo = 0, zero = 0;
        
        System.out.print("Digite o primeiro valor: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        n2 = input.nextInt();
        
        System.out.print("Digite o terceiro valor: ");
        n3 = input.nextInt();
        
        System.out.print("Digite o quarto valor: ");
        n4 = input.nextInt();
        
        System.out.print("Digite o quinto valor: ");
        n5 = input.nextInt();
        
        // Contando positivo, negativos e zero 
        
        if ( n1 > 0 )
            positivo++;
        else if ( n1 < 0 )
            negativo++;
        else
            zero++;
        
        if ( n2 > 0 )
            positivo++;
        else if ( n2 < 0 )
            negativo++;
        else
            zero++;
        
        if ( n3 > 0 )
            positivo++;
        else if ( n3 < 0 )
            negativo++;
        else
            zero++;
        
        if ( n4 > 0 )
            positivo++;
        else if ( n4 < 0 )
            negativo++;
        else
            zero++;
        
        if ( n5 > 0 )
            positivo++;
        else if ( n5 < 0 )
            negativo++;
        else
            zero++;
        
        // Output do resultado do contador
        System.out.println();
        System.out.printf("Positivos = %d", positivo);
        System.out.println();
        System.out.printf("Negativos = %d", negativo);
        System.out.println();
        System.out.printf("Zeros = %d", zero);
        System.out.println();
    }
    
}
