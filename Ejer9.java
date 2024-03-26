import java.util.Arrays;
import java.util.Scanner;


public class Ejer9 {

      public static void executar () {
       
        Programa.imprimirTitulo("EXERCICIO 09");

        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = scanner.nextInt();
        }

        int[] C = new int[5];
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i];
            } else { 
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C (de acordo com as regras especificadas): " + Arrays.toString(C));
    }
}