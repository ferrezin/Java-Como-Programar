package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // chamando o objeto Scanner atribuindo ao input
        Scanner input = new Scanner(System.in);
        
        // Declarando variaveis
        int x, y, z, sum, average, prod, larger = 0, small = 0;
        
        // Solicitando valores ao usuario
        System.out.print("Digite o primeiro valor: ");
        x = input.nextInt();
              
        System.out.print("Digite o segundo valor: ");
        y = input.nextInt();
                
        System.out.print("Digite o terceito valor: ");
        z = input.nextInt();
                
        // Calculos e validação IF
        sum = x + y + z;
        average = sum / 3;
        prod = x * y * z;
        
        // Validação do maior
        if ( x > y )
            larger = x;
        else
            larger = y;
        if (larger < z)
            larger = z;
        
        // Validação do menor
        if ( x < y )
            small = x;
        else
            small = y;
        if (small > z)
            small = z;
        
        // Declarando resultados
        System.out.println();
        System.out.printf("Sum is %d", sum);
        System.out.println();
        System.out.printf("Average is %d", average);
        System.out.println();
        System.out.printf("Product is %d", prod);
        System.out.println();
        System.out.printf("Smallest is %d", small);
        System.out.println();
        System.out.printf("Largest is %d", larger);
        System.out.println();
    }
    
}
