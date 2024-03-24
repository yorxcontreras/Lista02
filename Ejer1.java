import java.util.Scanner;

public class Ejer1 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 01");

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        

        double media = soma / 5.0;
        System.out.println("A média é: " + media);

        System.out.println("Valores menores que a média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores iguais à média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == media) {
                System.out.println(numeros[i]);
            }
        }

        System.out.println("Valores superiores à média:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] > media) {
                System.out.println(numeros[i]);
            }
        }
    }
}