import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

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
            // System.out.println("Vetor Original: \n" + v);
            Date ini = Calendar.getInstance().getTime();
            v.bubbleSort();
            Date fim = Calendar.getInstance().getTime();
            long tempoDemora = fim.getTime() - ini.getTime();
            System.out.println("Tempo de demora: " + tempoDemora + " ms");
            // System.out.println("Vetor Ordenado: \n" + v);
            System.out.println("Escolha um novo tamanho para o vetor, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}
