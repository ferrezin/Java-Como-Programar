package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // chamando o objeto Scanner atribuindo ao input
        Scanner input = new Scanner(System.in);
        
        // Declarando Variavel
        int x, y;
        
        System.out.print("Digite o primeiro numero: ");
        x = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        y = input.nextInt();
        
        // Verificação por IF
        if ( x > y ){
            System.out.printf("%d is larger than %d", x, y);
            System.out.println();
        }
        else if ( y > x ){
            System.out.printf("%d is larger than %d", y, x);
            System.out.println();
        }
        else if ( x == y )
            System.out.println("These number are equal");
    }
    
}
