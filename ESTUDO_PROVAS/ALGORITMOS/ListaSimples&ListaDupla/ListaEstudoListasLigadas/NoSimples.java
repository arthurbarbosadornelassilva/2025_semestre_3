public class NoSimples {
    private int info;
    private NoSimples proximo;

    public NoSimples(int info) {
        setInfo(info);
        setProximo(null);
    }
    public NoSimples getProximo() {
        return proximo;
    }
    public void setProximo(NoSimples proximo) {
        this.proximo = proximo;
    }
    public int getInfo() {
        return info;
    }
    public void setInfo(int info) {
        this.info = info;
    }
}
