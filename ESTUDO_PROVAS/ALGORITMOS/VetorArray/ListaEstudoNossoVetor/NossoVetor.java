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

    // ****MÉTODO 'estaVazio' CONFERE SE O VETOR ESTÁ VAZIO****
    public boolean estaVazio() {
        return this.ocupacoes == 0;
    }

    // 1. Inserir um elemento ao final do vetor
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
    public void removeElemento(int posicao) {
        if (estaVazio())
            System.out.println("Vetor está vazio!");
        for (int i = 0; i < vetorInt.length; i++) {
            if (vetorInt[i] == vetorInt[posicao]){
                for(int j = i; j < vetorInt.length - 1; j++){
                    vetorInt[j] = vetorInt[j + 1];
                }
            }
        }
    }
    
    // 4. Remover a primeira ocorrência de um determinado elemento
    public void removePrimeiraOcorrencia(int elemento) {
        if (estaVazio())
            System.out.println("Vetor está vazio!");
        for (int i = 0; i < vetorInt.length; i++) {
            if (vetorInt[i] == elemento){
                for(int j = i; j < vetorInt.length - 1; j++){
                    vetorInt[j] = vetorInt[j + 1];
                }
                break;
            }
        }
    }

    // 5. Remover todas as ocorrências de um determinado elemento
    public void removeTodosElementos(int elemento) {
        if (estaVazio())
            System.out.println("Vetor está vazio!");
        for (int i = 0; i < vetorInt.length; i++) {
            if (vetorInt[i] == elemento){
                for(int j = i; j < vetorInt.length - 1; j++){
                    vetorInt[j] = vetorInt[j + 1];
                }
            }
        }
    }

    // 6. Criar uma nova instância da classe, com as posições de ocorrência de um determinado elemento.

    // 7. Devolver o índice da primeira ocorrência de um determinado elemento

    // 8. Devolver o tamanho atual da lista de valores (quantos elementos ela tem)

    // 9. Esvaziar a lista

    // 10. Devolver uma cópia da lista

    // 11. Reduzir o vetor ao tamanho dele

    // 12. Receber 2 vetores de entrada e mesclá-los num único vetor.

    // 13. Somar os elementos do vetor

    // 14. Encontrar o maior elemento armazenado

    // 15. Encontrar a posição do maior elemento armazenado
    
    // 16. Encontrar o menor elemento armazenado e coloca-lo na posição 0 (fazer a troca)

    @Override
    public String toString() {
        return Arrays.toString(vetorInt);
    }
}
