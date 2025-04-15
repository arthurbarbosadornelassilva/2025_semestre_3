public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor vetor = new NossoVetor(10);

        vetor.insereElemento(4, 0);
        vetor.insereElemento(4, 1);
        vetor.insereElemento(4,2);
        vetor.insereElemento(4, 3);
        vetor.insereElemento(4, 4);

        System.out.println(vetor.toString());
        vetor.insereElemento(6, 5);
        // vetor.bubbleSort();
        System.out.println(vetor.toString());
        System.out.println(vetor.buscaLinear(4));

    }
}