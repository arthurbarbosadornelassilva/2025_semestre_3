public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor vetor = new NossoVetor(10);

        vetor.insereElemento(1, 0);
        vetor.insereElemento(4, 1);
        vetor.insereElemento(2,2);
        vetor.insereElemento(4, 3);
        vetor.insereElemento(5, 4);

        System.out.println(vetor.toString());
        vetor.bubbleSort();
    }
}