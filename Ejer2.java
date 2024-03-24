import java.util.Scanner;

public class Ejer2 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 02");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];
        
        System.out.println("Digite os números:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Número\t\tPositivo/Negativo/Zero");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + "\t\t");
            if (vetor[i] > 0) {
                System.out.println("Positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
    }
}
