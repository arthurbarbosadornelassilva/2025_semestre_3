import java.util.Scanner;
public class Teste {
    public static void main(String [] args){
        int i;
        int[] v;    //variável de referência para um vetor de inteiros

        // TESTE DE SOBRECARGA DE MEMÓRIA

        // System.out.println("Qual o tamanho do vetor?");
        // Scanner scanner = new Scanner(System.in);
        // i = scanner.nextInt();
        // v = new int[i];
        // for (int j = 0; j < 100; j++)
        //     v[j] = j;

        // scanner.close();

        // System.out.println(!(i == 10));

        // TESTE DE SOMA DE INTEIROS & TRANSFORMAÇÃO EM STRING

        int a = 2, b = 3;
        System.out.println(a + b);
        System.out.println("soma = " + a + b);
    }
}