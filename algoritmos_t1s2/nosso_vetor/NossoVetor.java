// Diferença entre procedimento estruturado e orientado a objetos:
// o procedimento estruturado não cira 'pacotes' que chamamos de classes que são trabalhados em orientação a objetos (que armazenam atributos e métodos)

// Relembrando definição de 'Classe' e 'Objeto':
//
// Classe: modelo
// Objeto: instância desse modelo (abstração do modelo)

// Relembrando níveis de acesso do Java (do mais aberto ao mais privado):
//
//              Classe  Pacote  Herdeiros   Mundo
// PUBLIC/         x       x        x         x 
// PROTECTED/      x       x        x
// DEFAULT/        x       x
// PRIVATE/        x
import java.util.Random;

public class NossoVetor {
    private int[] vetor;
    private int ocupacao;

    // criação do Construtor da classe
    public NossoVetor (int tamanho) {
        vetor = new int[tamanho];
        //por clareza
        ocupacao = 0;
    }
    // vetor tem padrão de ocupação 10
    public NossoVetor() {
        // vetor = new int[10];
        // ocupacao = 0
        this(3);
    }
    // private void aumentaVetor() {
    //     int[] temp = new int[vetor.length * 2];
    //     for (int i = 0; i < ocupacao; i++)
    //         temp[i] = vetor[i];
    //     vetor = temp;
    // }
    // private void reduzVetor() {
    //     int[] temp = new int[vetor.length / 2];
    //     for (int i = 0; i < ocupacao; i++)
    //         temp[i] = vetor[i];
    //     vetor = temp;
    // }
    private void redimensionaVetor(int novoTamanho) {
        int[] temp = new int[novoTamanho];
        for (int i = 0; i < ocupacao; i++)
            temp[i] = vetor[i];
    }
    public void insere (int i) {
        if (estaCheio()) {
            redimensionaVetor(vetor.length * 2);
        }
            vetor[ocupacao++] = i;
    }
    public boolean estaCheio() {
        // MAIS ETAPAS
        // if (ocupacao == vetor.length)
        //     return true;
        // return false;

        // MENOS ETAPAS
        return ocupacao == vetor.length;
    }
    public boolean estaVazio() {
        return ocupacao == 0;
    }
    public int remove() {
        // ocupacao--;
        // if (!estaVazio())
        //     return vetor[ocupacao--];
        // return -1;
        if (!estaVazio()) {
            int aux = vetor[--ocupacao];
            if (vetor.length >= 6 && ocupacao <= vetor.length / 4)
                redimensionaVetor(vetor.length / 2);
            return aux;
        }
        return -1;
    }
    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }
    int getTamanho() {
        return vetor.length;
    }
    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);
        }
        ocupacao = vetor.length;
    }
}