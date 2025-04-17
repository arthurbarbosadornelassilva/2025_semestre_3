public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor vetor = new NossoVetor(10);

        vetor.insereElemento(2, 0);
        vetor.insereElemento(4, 1);
        vetor.insereElemento(3,2);
        vetor.insereElemento(1, 3);
        vetor.insereElemento(5, 4);

        System.out.println(vetor.toString());
        vetor.insereElemento(6, 5);
        vetor.insereElemento(5, 6);
        // vetor.bubbleSort();
        System.out.println(vetor.toString());
        System.out.println(vetor.buscaLinear(4));

        vetor.removePrimeiraOcorrencia(5);
        System.out.println(vetor.toString());
    }
}