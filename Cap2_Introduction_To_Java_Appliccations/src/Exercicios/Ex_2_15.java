package Exercicios;
import java.util.Scanner;
/**
 *
 * @author CPD
 */
public class Ex_2_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // chamando o objeto Scanner atribuindo ai input
        Scanner input = new Scanner(System.in);
        
        // Declarando variaveis
        int n1, n2, sum, prod;
        float div;
        
        // Solicitando ao usuario inserir os dados
        System.out.print("Digite o primeiro numero: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = input.nextInt();
        
        // Calculando e mostrando resutado
        sum = n1 + n2;
        prod = n1 * n2;
        div = (float) n1 / n2;
        
        System.out.printf("Some é %d", sum);
        System.out.println();
        System.out.printf("Produto é %d", prod);
        System.out.println();
        System.out.printf("Divisão é %.2f", div);
        System.out.println();
    }
    
}
