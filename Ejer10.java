import java.util.Arrays;
import java.util.Scanner;


public class Ejer10 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCICIO 10");

        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }

        int[] B = new int[5];

        for (int i = 0; i < 5; i++) {
            B[i] = A[4 - i];
        }

        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B (elementos de A invertidos): " + Arrays.toString(B));
    }
}