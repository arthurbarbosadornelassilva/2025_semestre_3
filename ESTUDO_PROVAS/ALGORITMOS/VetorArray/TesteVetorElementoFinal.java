public class TesteVetorElementoFinal {
    public static void main(String[] args) {
        VetorElementoFinal vetor = new VetorElementoFinal(2);
        try {

            vetor.setElement("elemento 1");
            vetor.setElement("elemento 2");
            // vetor.setElement("elemento 3");

            System.out.println("Tamanho do vetor: " + vetor.getTamanho());
            System.out.println(vetor.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}