import java.util.Scanner;
public class Teste {
    public static void main(String [] args){
        int i;
        int[] v;    //variável de referência para um vetor de inteiros
        System.out.println("Qual o tamanho do vetor?");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        v = new int[i];
        for (int j = 0; j < 100; j++)
            v[j] = j;

        scanner.close();
    }
}