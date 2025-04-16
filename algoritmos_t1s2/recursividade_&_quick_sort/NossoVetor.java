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
    public NossoVetor(int tamanho) {
        vetor = new int[tamanho];
        //por clareza
        ocupacao = 0;
    }

    // vetor tem padrão de ocupação 10
    public NossoVetor() {
        // vetor = new int[10];
        // ocupacao = 0
        this(10); // Construtor 
    }

    // void aumentarVetor() { 
    //     int[] temp = new int[vetor.length * 2]; 
    //     for (int i = 0; i<ocupacao; i++) { 
    //         temp[i] = vetor[i]; 
    //     } 
    //     vetor = temp; 
    // } 
    // void reduzVetor(){ 
    //     int []temp = new int[vetor.length/2]; 
    //     for (int i=0; i<ocupacao; i++){ 
    //         temp[i] = vetor[i]; 
    //     } 
    //     vetor = temp; 
    // } 
    // Flexibiliza o código 
    void redimensionarVetor(int NovoTamanho) {
        int[] temp = new int[NovoTamanho];
        for (int i = 0; i < ocupacao; i++) {
            temp[i] = vetor[i];
        }
        vetor = temp;
    }

    public void insere(int i) {
        if (estaCheio()) {
            redimensionarVetor(vetor.length * 2);
        }
        vetor[ocupacao++] = i;
    }

    public boolean estaCheio() {
        // Compilador faz a verificação (verdadeiro ou falso) 
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    // public int remove() { 
    //     if (!estaVazio()){ 
    //         int aux = vetor[--ocupacao]; 
    //         if (vetor.length>=6 && ocupacao <= vetor.length/4){ 
    //             redimensionarVetor(vetor.length/2); 
    //         } return aux; 
    //     } 
    //     return -1; 
    // } 
    public int remove() {
        if (estaVazio()) {
            throw new VetorVazioException("Vetor vazio, nao ha o que remover");
        }
        int aux = vetor[--ocupacao];
        if (vetor.length >= 6 && ocupacao <= vetor.length / 4) {
            redimensionarVetor(vetor.length / 2);
        }
        return aux;
    }

    public boolean contem(int elemento) {
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public int indiceDe(int elemento) {
        if (estaVazio()) {
            throw new VetorVazioException("vetor esta vazio");
        }
        for (int i = 0; i < ocupacao; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        throw new ElementoNaoEncontradoException(elemento + " nao encontrado");
    }

    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }

    public int getTamanho() {
        return vetor.length;
    }

    public void preencheVetor() {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(vetor.length * 10);

        }
        ocupacao = vetor.length;
    }

    // Métodos de Ordenação
    public void bubbleSort() {
        for (int i = 1; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public void selectionsort() {
        for (int i = 0; i < vetor.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < vetor.length; ++j) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            int x = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = x;
        }
    }

    public void insertionsort() {
        for (int j = 1; j < vetor.length; ++j) {
            int x = vetor[j];
            int i;
            for (i = j - 1; i >= 0 && vetor[i] > x; --i) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = x;
        }
    }
    // Novo Vetor - QuickSort
        int partition(int p, int r) {
            int x = vetor[r];
            int i = p - 1;
            for(int j = p; j < r; j++) {
                if (vetor[j] <= x){
                    i = i + 1;
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
            i = i + 1;
            int aux = vetor[r];
            vetor[r] = vetor[i];
            vetor[i] = aux;
            return i;
        }
        public void quickSort(int p, int r) {
            if (p < r) {
                int q = partition(p, r);
                quickSort(p, q - 1);
                quickSort(q + 1, r);
            }
        }
}


class VetorVazioException extends RuntimeException {

    public VetorVazioException(String msg) {
        super(msg);
    }
}

class ElementoNaoEncontradoException extends RuntimeException {

    public ElementoNaoEncontradoException(String msg) {
        super(msg);
    }

}
