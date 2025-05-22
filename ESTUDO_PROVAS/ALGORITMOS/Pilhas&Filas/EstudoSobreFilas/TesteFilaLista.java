public class TesteFilaLista {
    public static void main(String[] args) {
        FilaListaLigada<Integer> filaDeInteiros = new FilaListaLigada<>();

        System.out.println("Fila está vazia? " + filaDeInteiros.estaVazia());
        filaDeInteiros.imprimirFila();

        filaDeInteiros.enfileirar(10);
        filaDeInteiros.imprimirFila();
        filaDeInteiros.enfileirar(20);
        filaDeInteiros.imprimirFila();
        filaDeInteiros.enfileirar(30);
        filaDeInteiros.imprimirFila();

        System.out.println("Frente da fila: " + filaDeInteiros.frente());
        System.out.println("Tamanho da fila: " + filaDeInteiros.tamanho());
        System.out.println("Fila está vazia? " + filaDeInteiros.estaVazia());

        System.out.println("Desenfileirando: " + filaDeInteiros.desenfileirar());
        filaDeInteiros.imprimirFila();
        System.out.println("Frente da fila: " + filaDeInteiros.frente());

        filaDeInteiros.enfileirar(40);
        filaDeInteiros.imprimirFila();

        System.out.println("Desenfileirando: " + filaDeInteiros.desenfileirar());
        filaDeInteiros.imprimirFila();
        System.out.println("Desenfileirando: " + filaDeInteiros.desenfileirar());
        filaDeInteiros.imprimirFila();
        System.out.println("Desenfileirando: " + filaDeInteiros.desenfileirar());
        filaDeInteiros.imprimirFila();

        System.out.println("Tentando desenfileirar de fila vazia: " + filaDeInteiros.desenfileirar());
        System.out.println("Frente da fila vazia: " + filaDeInteiros.frente());
        System.out.println("Tamanho da fila: " + filaDeInteiros.tamanho());
    }
}