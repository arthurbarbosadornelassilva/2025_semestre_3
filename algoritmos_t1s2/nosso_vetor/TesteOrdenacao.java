import java.util.Scanner;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;
        int t;
        System.out.println("Digite o tamanho do vetor: ");
        t = scanner.nextInt();
        while (t > 0) {
            v = new NossoVetor(t);
            v.preencheVetor();
            System.out.println(v);
            System.out.println("Escolha um novo tamanho para o vetor: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
