import java.util.Scanner;


public class Ejer13 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 13");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos da sequência de Fibonacci que deseja gerar: ");
        int n = scanner.nextInt();

        int[] fibonacci = gerarFibonacci(n);

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int[] gerarFibonacci(int n) {
        int[] fibonacci = new int[n];

        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}