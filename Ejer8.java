import java.util.Arrays;


public class Ejer8 {

    public static void executar () {
       
        Programa.imprimirTitulo("EXERCICIO 08");

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};
    
        int[] C = new int[A.length + B.length];
    
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
    
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }
    
        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(C));
     }
}