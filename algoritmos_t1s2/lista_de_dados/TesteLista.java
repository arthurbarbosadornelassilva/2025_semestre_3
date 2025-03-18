public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("Lista criada: " + lista);
        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(20);
        System.out.println("Lista depois das inserções: " + lista);
        try {
            System.out.println(lista.removeInicio() + " foi removido");            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois da remoção:\n" + lista);
    }
}
