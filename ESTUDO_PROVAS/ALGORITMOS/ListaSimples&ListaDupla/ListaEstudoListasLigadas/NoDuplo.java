public class NoDuplo {
    private int info;
    private NoDuplo proximo;
    private NoDuplo anterior;

    public NoDuplo() {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
    public NoDuplo getProximo() {
        return proximo;
    }
    public void setProximo(NoDuplo proximo) {
        this.proximo = proximo;
    }
    public NoDuplo getAnterior() {
        return anterior;
    }
    public void setAnterior(NoDuplo anterior) {
        this.anterior = anterior;
    }
}
