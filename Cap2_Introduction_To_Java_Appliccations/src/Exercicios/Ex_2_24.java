package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // atribuindo o objeti Scanner ao input
        Scanner input = new Scanner(System.in);
        
        // Declarando variavel
        int n1, n2, n3, n4, n5, small, larger;
        
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        n3 = input.nextInt();
        
        System.out.print("Digite o quarto numero: ");
        n4 = input.nextInt();
        
        System.out.print("Digite o quinto numero: ");
        n5 = input.nextInt();
        
        // validação do maio e menor
        if ( n1 > n2 )
            larger = n1;
        else
            larger = n2;
        if ( larger < n3 )
            larger = n3;
        if ( larger < n4 )
            larger = n4;
        if ( larger < n5 )
            larger = n5;
        
        if ( n1 < n2 )
            small = n1;
        else
            small = n2;
        if ( small > n3 )
            small = n3;
        if ( small > n4 )
            small = n4;
        if ( small > n5 )
            small = n5;
        
        // Printing the result
        System.out.println();
        System.out.printf("Smallest is %d", small);
        System.out.println();
        System.out.printf("Largest is %d", larger);
        System.out.println();
    }
    
}
