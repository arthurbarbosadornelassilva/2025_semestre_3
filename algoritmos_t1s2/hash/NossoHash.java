// package algoritmos_t1s2.hash;

public class NossoHash <K, V> {
    private Entrada<K, V>[] tabela;
    private int capacidade = 10;

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
    public boolean isEmpty() {
        for (int i = 0; i < capacidade; i++){
            Entrada<K, V> atual = tabela[i];
            if (atual != null) {
                return false;
            }
        }
        return true;
    }
    public boolean containsKey(K key) {
        int indice = hash(key);
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) {
            if (atual.key.equals(key)){
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
    public boolean containsValue(V value) {
        for (int i = 0; i < capacidade; i++) {
            System.out.println("posicao" + i);
            Entrada<K, V> atual = tabela[i];
            while (atual != null) {
                if (atual.value.equals(value)){
                    System.out.println("Valor:" + atual.value);
                    return true;
                }
                atual = atual.proximo;
            }
        }
        return false;
    }
    public V get(K key) {
        int indice = hash(key);
        Entrada<K, V> atual = tabela[indice];
        while (atual != null) { 
            if (atual.key.equals(key)) {
                return atual.value;
            }
            atual = atual.proximo;
        }
        return null;
    }
}

