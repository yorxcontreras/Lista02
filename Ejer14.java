import java.util.Scanner;


public class Ejer14 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 14");

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = scanner.nextInt();
        }

        int indiceMaior = 0;
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        int temp = vetor[4];
        vetor[4] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        System.out.println("Vetor atualizado com o maior elemento na última posição:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}