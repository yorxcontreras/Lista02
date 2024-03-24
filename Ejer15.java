import java.util.Scanner;


public class Ejer15 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 15");

        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[5];

        System.out.print("Digite o primeiro número: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o próximo número: ");
            int numero = scanner.nextInt();
            if (numero > vetor[i - 1]) {
                vetor[i] = numero;
            } else {
                System.out.println("Número inválido. Deve ser maior que o anterior.");
                i--; 
            }
        }

        System.out.println("Vetor preenchido de acordo com a regra:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
