public class TesteLista {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();
        System.out.println("Lista criada: " + lista);
        lista.insereInicio(5);
        lista.insereInicio(8);
        lista.insereInicio(20);
        System.out.println("Lista depois das inserções de início: " + lista);
        try {
            System.out.println(lista.removeInicio() + " foi removido");      
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois da remoção de início:\n" + lista);
        
        lista.insereFim(30);
        lista.insereFim(40);
        System.out.println("Lista depois da inserção de fim: " + lista);

        try {
            System.out.println(lista.removeFim() + " foi removido do final");            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("lista depois da remoção de fim:\n" + lista);

    }
}
