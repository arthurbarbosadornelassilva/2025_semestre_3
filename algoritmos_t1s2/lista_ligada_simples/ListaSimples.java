public class ListaSimples {
    private No primeiro;
    private No ultimo;

    // CRIAÇÃO DE LISTA LIGADA:
    // vamos usar o construtor padrão: primeiro e último = null
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if(estaVazia()) {
            ultimo = novo;
        }
        novo.setProximo(primeiro);
    }
    public int removeInicio() {
        if(estaVazia())
            throw new RuntimeException("lista vazia, nao há o que remover!");
        int elemento = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (primeiro == null) {
            ultimo = null;
        }

        return elemento;
    }
    @Override
    public String toString() {
        String s = "lista: ";
        if (estaVazia()) {
            s += "está vazia";
        }
        else {
            No runner = primeiro;
            while (runner != null) { // vai até o final da lista
                s += runner + "->";
                runner = runner.getProximo();
            }
            s += "\\\\";
        }
        return s + "\n";
    }
    public void insereFim(int elemento) {
        No novo = new No(elemento);
        if (estaVazia()) {
            primeiro  = novo;
        }
        ultimo.setProximo(novo);
        
        ultimo = novo;
    }
    public int removeFim() {
        if (estaVazia()){
            throw new RuntimeException("Lista vazia, não há o quê remover");
        }
        int elemento = ultimo.getInfo();
        if (primeiro == ultimo) {
            primeiro = null;
            ultimo = null;
        }
        else {
            No runner = primeiro;
            while (runner.getProximo() != ultimo) {
                runner = runner.getProximo();
            }
            runner.setProximo(null);
            ultimo = runner;
        }
        return elemento;
    }
}