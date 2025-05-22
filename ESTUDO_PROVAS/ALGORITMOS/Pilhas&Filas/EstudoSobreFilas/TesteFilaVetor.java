import java.util.Random;

public class TesteFilaVetor {
    public static void main(String[] args) {
        Fila fila = new Fila(8);
        Random random = new Random();
        for (int i = 1; i <= 10; i++) { // tenta enfileirar ou desenfileirar 50 vezes
            try {
                if (random.nextBoolean()) {
                    fila.enfileira(random.nextInt(10)); // enfileira um número aleatório entre 0(incluso) e 10(excluso)
                } else {
                    System.out.println(fila.desenfileira() + " saiu");
                }
                System.out.println(fila);
                System.out.println(fila.stringVetor());
            } catch (RuntimeException rt) {
                System.out.println(rt.getMessage());
            }
        }
    }
}