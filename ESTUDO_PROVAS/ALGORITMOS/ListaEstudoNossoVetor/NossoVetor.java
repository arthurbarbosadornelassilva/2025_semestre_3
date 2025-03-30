public class NossoVetor {
    private String vetorStrings[];
    private int ocupacoes;

    public NossoVetor(int tamanho){
        this.vetorStrings = new String[tamanho];
        this.ocupacoes = 0;
    }
    // ****MÉTODO 'estaCheio' CONFERE SE O VETOR ESTÁ CHEIO****
    public boolean estaCheio() {
        return this.ocupacoes == vetorStrings.length;
    }

    // 1. Inserir um elemento em uma determinada posição
    public void insereElemento(String elemento, int i) {
        if (estaCheio()){
            System.out.println("Vetor cheio!");
        }
        this.vetorStrings[i] = elemento;
        ocupacoes++;
    }

    // 2. Verificar quantas vezes um elemento aparece no vetor

    // 3. Remover um elemento de uma determinada posição

    // 4. Remover a primeira ocorrência de um determinado elemento

    // 5. Remover todas as ocorrências de um determinado elemento
}