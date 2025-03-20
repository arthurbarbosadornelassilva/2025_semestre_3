public class ListaSimplesCopia {
    private No primeiro;

    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int elemento) {
        No novo = new No(elemento);
        if(!estaVazia()) {
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio() {
        if(estaVazia())
            throw new RuntimeException("lista vazia, nao há o que remover!");
        int elemento = primeiro.getInfo();
        primeiro = primeiro.getProximo();
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
        else {
            No runner = primeiro;
            while (runner.getProximo() != null) { // vai a´te o último elemento da lista
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
}
