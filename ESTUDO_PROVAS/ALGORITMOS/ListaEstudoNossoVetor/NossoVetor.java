import java.util.Arrays;

public class NossoVetor {

    private int vetorInt[];
    private int ocupacoes;

    public NossoVetor(int tamanho) {
        this.vetorInt = new int[tamanho];
        this.ocupacoes = 0;
    }

    // ****MÉTODO 'estaCheio' CONFERE SE O VETOR ESTÁ CHEIO****
    public boolean estaCheio() {
        return this.ocupacoes == vetorInt.length;
    }

    // 1. Inserir um elemento em uma determinada posição
    public void insereElemento(int elemento, int i) {
        if (estaCheio()) {
            System.out.println("Vetor cheio!");
        }
        // Random random = new Random();
        // for (int j = 0; j < vetorInt.length; j++) {
        //     vetorInt[j] = random.nextInt(vetorInt.length * 1);
        // }
        this.vetorInt[i] = elemento;
        ocupacoes++;
    }

    // **utilizei BUBBLE SORT para ordenar os vetores e comparar os elementos semelhantes**
    public void bubbleSort() {
        for (int i = 1; i < vetorInt.length - 1; i++) {
            for (int j = 0; j < vetorInt.length - i; j++) {
                if (vetorInt[j] > vetorInt[j + 1]) {
                    int aux = vetorInt[j];
                    vetorInt[j] = vetorInt[j + 1];
                    vetorInt[j + 1] = aux;
                }
            }
        }
    }
    
    // 2. Verificar quantas vezes um elemento aparece no vetor
    public int buscaLinear(int x) {
        int contador = 0;

        for(int i = 0; i < vetorInt.length; i++){
            if (vetorInt[i] == x) {
                contador++;
            }
        }
        System.out.println("Numero de repetições: ");
        return contador;
    }
    
    // 3. Remover um elemento de uma determinada posição

    // 4. Remover a primeira ocorrência de um determinado elemento

    // 5. Remover todas as ocorrências de um determinado elemento

    @Override
    public String toString() {
        return Arrays.toString(vetorInt);
    }
}
