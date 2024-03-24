import java.util.Scanner;

public class Ejer6 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCÍCIO 06");

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];

        double[] pesos = new double[5];

        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < 5; i++) {
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Digite os 5 pesos correspondentes às notas:");
        for (int i = 0; i < 5; i++) {
            pesos[i] = scanner.nextDouble();
        }

        double somaNotasPesadas = 0;
        double somaPesos = 0;
        for (int i = 0; i < 5; i++) {
            somaNotasPesadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        double mediaPonderada;
        if (somaPesos != 0) {
            mediaPonderada = somaNotasPesadas / somaPesos;
            System.out.println("A média ponderada do aluno é: " + mediaPonderada);
        } else {
            System.out.println("Não é possível calcular a média ponderada pois a soma dos pesos é zero.");
        }
    }
}