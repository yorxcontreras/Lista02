import java.util.Scanner;


public class Ejer12 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCICIO 12");

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[12];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 12; i++) {
            vetor[i] = scanner.nextInt();
        }

        int produtoParesPositivos = 1;

        for (int i = 0; i < 12; i++) {
            if (vetor[i] % 2 == 0 && vetor[i] > 0) {
                produtoParesPositivos *= vetor[i];
            }
        }

        if (produtoParesPositivos != 1) {
            System.out.println("O produto dos elementos pares positivos é: " + produtoParesPositivos);
        } else {
            System.out.println("Não há elementos pares positivos no vetor.");
        }
    }
}