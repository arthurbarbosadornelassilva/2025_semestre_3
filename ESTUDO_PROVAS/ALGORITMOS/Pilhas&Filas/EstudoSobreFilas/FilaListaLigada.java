public class FilaListaLigada<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public FilaListaLigada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void enfileirar(T valor) {
        No<T> novoNo = new No<>(valor);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        tamanho++;
        System.out.println(valor + " foi enfileirado. Tamanho: " + tamanho);
    }

    public T desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            // Em um cenário real, poderia lançar uma exceção:
            // throw new NoSuchElementException("A fila está vazia.");
            return null;
        }
        T valorRemovido = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) { // Se a fila ficou vazia
            fim = null;
        }
        tamanho--;
        System.out.println(valorRemovido + " foi desenfileirado. Tamanho: " + tamanho);
        return valorRemovido;
    }

    public T frente() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return null;
        }
        return inicio.valor;
    }

    public void imprimirFila() {
        if (estaVazia()) {
            System.out.println("Fila: [] (vazia)");
            return;
        }
        System.out.print("Fila: [INÍCIO] ");
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + (atual.proximo != null ? " -> " : ""));
            atual = atual.proximo;
        }
        System.out.println(" [FIM]");
    }
}