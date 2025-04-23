import java.util.Random;

public class TesteFilaVetor {   //Nesse teste, podemos visualizar os elementos 'rodando' na fila (entram na última posição disponível e assumem a próxima posição que possa ser ocupada)
    public static void main(String[] args) {
        Fila fila = new Fila(8);
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            try {
                if (random.nextBoolean()) {
                    fila.enfileira(random.nextInt(10));
                } else {
                    System.out.println(fila.desenfileira() + " saiu");
                }
                System.out.println(fila);
                System.out.println(fila.stringVetor());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}