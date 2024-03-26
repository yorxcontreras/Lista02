import java.util.Scanner;

public class Ejer3 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCICIO 03");

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] primeiroVetor = new int[tamanho];
        int[] segundoVetor = new int[tamanho];
        System.out.println("Digite os números do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            primeiroVetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            segundoVetor[i] = primeiroVetor[i] * 2;
        }

        System.out.println("Valores do segundo vetor (dobro do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(segundoVetor[i]);
        }
    }
}