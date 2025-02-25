import java.util.Scanner;
import java.util.Random;

public class EstudoDesempenho {
    static void preencheVetor(int[] v) {
        // Random random = new Random();
        for (int i = 0; i < v.length; i++) {
            // v[i] = random.nextInt(v.length * 10); // -> se eu quiser o vetor com valores aleatórios
            v[i] = i; // -> se eu quiser o vetor com valores sequenciais
        }
    }
    static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v;
        int tamanho = 0;
        System.out.println("Digite o tamanho do vetor, 0 encerra: \n");
        tamanho = scanner.nextInt();

        while (tamanho > 0) {
            v = new int[tamanho];
            preencheVetor(v);
            exibeVetor(v);
            System.out.println("Digite o NOVO tamanho do vetor, 0 encerra: \n");
            tamanho = scanner.nextInt();
            
        }
        scanner.close();
    }
}