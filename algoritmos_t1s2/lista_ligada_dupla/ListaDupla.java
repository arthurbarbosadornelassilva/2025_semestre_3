public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    //o construtor é o padrão herdado de Object, isto é, primeiro e último são null
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if(listaVazia()) {
            primeiro = novo;
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim (int info) {
        NoDuplo novo = new NoDuplo(info);
        if(listaVazia()) {
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    // Se não houver o método do tipo override 'toString', é printado no terminal o valor de ponteiro da lista que for instanciada

    @Override
    public String toString(){ //método toString
        if (listaVazia()) return "lista vazia\n";
        String s = "\\\\ = ";
        NoDuplo runner = primeiro;
        while (runner != null) {
            s += runner + " = ";
            runner = runner.getProximo();
        }
        return s + "\\\\ \n";
    }
    public int removeInicio() { //removedor de lixo do inicio
        if (listaVazia())
            throw new RuntimeException("lista vazia, não há o quê remover");
        int info = primeiro.getInfo(); //CAI EM PROVA!!!! Para criar um ponteiro com info, SEMPRE utilizamos o método getInfo(), que irá coletar o endereço de memória do primeiro
        if (primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        }
        else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        return info;
    }
    public int removeFim() { //removedor de lixo do inicio
        if (listaVazia())
            throw new RuntimeException("lista vazia, não há o quê remover");
        int info = ultimo.getInfo(); //CAI EM PROVA!!!! Para criar um ponteiro com info, SEMPRE utilizamos o método getInfo(), que irá coletar o endereço de memória do primeiro
        if (primeiro == ultimo){
            primeiro = null;
            ultimo = null;
        }
        else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        return info;
    }
}
