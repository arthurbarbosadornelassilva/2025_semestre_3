import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Random random = new Random();
        for (int i = 1; i <= 20; i++) { // tenta enfileirar ou desenfileirar 20 vezes
            try {
                if (random.nextBoolean()) { // true or false
                    fila.enfileira(i);
                } else {
                    fila.desenfileira();
                }
                System.out.println(fila);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

/* Exemplo de resultado:
 * Falha na remoção -> 1 (false)
 * 2 -> 2 (true)
 * fila vazia -> 3 (false)
 * 4 -> 4 (true)
 * fila vazia -> 5 (false)
 * Falha na remoção -> 6 (false/erro)
 * 7 -> 7 (true)
 * 7 8 -> 8 (true)
 * 8 -> 9 (false)
 * 8 10 -> 10 (true)
 * 8 10 11 -> 11 (true)
 * 8 10 11 12 -> 12 (true)
 * 10 11 12 -> 13 (false)
 * 10 11 12 14 -> 14 (true)
 * 11 12 14 -> 15 (false)
 * 11 12 14 16 -> 16 (true)
 * 11 12 14 16 17 -> 17 (true)
 * 11 12 14 16 17 18 -> 18 (true)
 * 12 14 16 17 18 -> 19 (false)
 * 14 16 17 18 -> 20 (false)
 */