import java.util.Date;
import java.util.Scanner;

public class TesteQuick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NossoVetor v;
        System.out.println("Digite o tamanho, 0 encerra:");
        int t = sc.nextInt();

        while (t > 0) {
            v = new NossoVetor();
            v.preencheVetor();
            long ini = new Date().getTime();
            v.quickSort(0, t-1);
            long fim = new Date().getTime();
            System.out.println("Quick para tamanho " + t + " - tempo: " + (fim-ini));
            
            System.out.println("Digit o tamanho, 0 encerra:");
            t = sc.nextInt();
        }
    }
}
