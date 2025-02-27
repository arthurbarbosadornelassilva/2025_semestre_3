import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean())
                v.insere(i);
            v.remove();       
            
            System.out.println("tamanho = " + v.getTamanho());
            System.out.println(v);
        }
    }
}
