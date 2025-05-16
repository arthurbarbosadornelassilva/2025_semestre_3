
public class Entrada<K, V> {
    public K key;
    public V value;
    public Entrada<K, V> proximo;

    public Entrada(K key, V value) {
        this.key = key;
        this.value = value;
        this.proximo = null;
    }
}
