public class ArvoreBinaria <T extends Comparable<T>> {
    private No<T> raiz;
    
    public ArvoreBinaria() {
        raiz = null;
    }
    public boolean arvoreVazia() {
        return raiz == null;
    }
    public void insere(T info) {
        No<T> novo = new No<>(info);
        if (arvoreVazia())
            raiz = novo;
        else
            insereRec(novo, raiz);
    }
    void insereRec(No<T> novo, No<T> atual) {
        if (novo.getInfo().compareTo(atual.getInfo()) > 0) {
            if (atual.getDiretia() == null)
                atual.setDireita(novo);
            else
                insereRec(novo, atual.getDiretia());
        }
        else {
            if (atual.getEquerda() == null)
                atual.setEsquerda(novo);
            else
                insereRec(novo, atual.getEquerda());
        }
    }
    //percurso em ordem simétrica para o toString
    @Override
    public String toString() {
        if (arvoreVazia()) return "árvore vazia.";
        return toStringRec(raiz);
    }
    String toStringRec(No<T> atual) {
        String s = "";
        if (atual.getEquerda() != null)
            s += toStringRec(atual.getEquerda());
        s += atual + "\n";
        if (atual.getDiretia() != null)
            s += toStringRec(atual.getDiretia());
        return s;
    }
}