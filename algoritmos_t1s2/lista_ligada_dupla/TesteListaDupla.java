public record TesteListaDupla() {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        System.out.println("lista instanciada\n" + listaDupla);
        try {
            listaDupla.removeFim();
        } catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }

        listaDupla.insereInicio(10);
        listaDupla.insereInicio(20);
        listaDupla.insereInicio(25);
        listaDupla.insereInicio(30);
        System.out.println("lista instanciada depois das inserções" + listaDupla);

        listaDupla.insereFim(15);
        listaDupla.insereFim(25);
        listaDupla.insereFim(20);
        listaDupla.insereFim(35);
        System.out.println("lista instanciada depois das inserções" + listaDupla);

        listaDupla.removeInicio();
        System.out.println("lista instanciada depois das remoção do início" + listaDupla);

        listaDupla.removeFim();
        System.out.println("lista instanciada depois das remoção do fim" + listaDupla);
    }
    // Se não houver o método do tipo override 'toString', é printado no terminal o valor de ponteiro da listaDupla definida acima
}
