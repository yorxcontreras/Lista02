import java.util.Scanner;

public class Ejer7 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 07");

        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }

        boolean saoIguais = true;
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
    }
}