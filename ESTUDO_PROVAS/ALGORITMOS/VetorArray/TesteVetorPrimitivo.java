public class TesteVetorPrimitivo {
    public static void main (String[] args) {
        VetorPrimitivo vetor = new VetorPrimitivo(5);
        
        System.out.println("Endereço de memória do vetor:\n" + vetor); //imprime o endereço de memória do vetor 'vetor'
        
        vetor.setElement(10.0); //método adiciona um novo elemento ao vetor
        vetor.setElement(20.0);

        vetor.getElement(); //método coleta os elementos no vetor e printa eles no terminal
    }
}
