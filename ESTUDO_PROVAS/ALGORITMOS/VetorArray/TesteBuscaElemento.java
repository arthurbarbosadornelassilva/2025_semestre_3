public class TesteBuscaElemento {
    public static void main (String[] args) {
        BuscaElemento vetor = new BuscaElemento(3);

        vetor.adiElemento(1);
        vetor.adiElemento(2);
        vetor.adiElemento(3);

        System.out.println(vetor.toString());
        System.out.println(vetor.buscador(0)); // retorna o elemento armazenado naquela posicao do vetor
        System.out.println(vetor.buscadorSequencial(3)); // retorna a posicao do vetor que armazena o elemento
    }
}