import java.util.Calendar;
import java.util.Date;
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
            // System.out.println("Vetor Original: \n" + v);
            Date ini = Calendar.getInstance().getTime();
            v.bubbleSort();
            Date fim = Calendar.getInstance().getTime();
            long tempoDemora = fim.getTime() - ini.getTime();
            System.out.println("Tempo de demora: " + tempoDemora + " ms");
            // System.out.println("Vetor Ordenado: \n" + v);
            //System.out.println("Escolha um novo tamanho para o vetor, 0 encerra: ");

            v.preencheVetor();
            ini = Calendar.getInstance().getTime();
            v.selectionsort();
            fim = Calendar.getInstance().getTime();
            tempoDemora = fim.getTime() - ini.getTime();
            System.out.println("Tempo de demora: " + tempoDemora + " ms");
            
            v.preencheVetor();
            ini = Calendar.getInstance().getTime();
            v.insertionsort();
            fim = Calendar.getInstance().getTime();
            tempoDemora = fim.getTime() - ini.getTime();
            System.out.println("Tempo de demora: " + tempoDemora + " ms");

            t = scanner.nextInt();
        }
        scanner.close();
    }
}
