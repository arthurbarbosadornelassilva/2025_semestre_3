public class No<T> {
    T valor;
    No<T> proximo;

    public No(T valor) {
        this.valor = valor;
        this.proximo = null;
    }
}