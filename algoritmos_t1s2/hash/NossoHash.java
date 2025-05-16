// package algoritmos_t1s2.hash;

public class NossoHash <K, V> {
    private Entrada<K, V>[] tabela;
    private int capacidade = 16;

    @SuppressWarnings("unchecekd")  // em suppress não temos ';'
    public NossoHash() {
        tabela = new Entrada[capacidade];
    }
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacidade;
    }
    public void put(K key, V value) {
        int indice = hash(key);
        Entrada<K, V> entrada = new Entrada<>(key, value);
            entrada.proximo = tabela[indice];
            tabela[indice] = entrada;
    }
    public void imprime() {
        for (int i = 0; i < capacidade; i++) {
            System.out.println("posicao" + i);
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                System.out.println("{chave: }" + atual.key + ", valor: " + atual.value + "}");
                atual = atual.proximo;
            }
        }
    }
}

