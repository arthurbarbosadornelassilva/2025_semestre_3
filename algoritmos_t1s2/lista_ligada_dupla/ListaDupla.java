public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //o construtor é o padrão herdado de Object, isto é, primeiro e último são null
    public boolean listaVazia() {
        return primeiro == null;
    }
}
