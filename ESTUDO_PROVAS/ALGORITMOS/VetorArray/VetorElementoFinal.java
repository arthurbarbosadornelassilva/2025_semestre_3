
// VETOR ELEMENTO FINAL -  TAMANHO & EXCEPTION

// import java.util.Arrays;

public class VetorElementoFinal {
    private String[] elementos;
    private int tamanho;

    public VetorElementoFinal(int capacidade) {
        elementos = new String[capacidade];
        tamanho = 0;
    }
    public void setElement(String elemento) throws Exception { // Podemos substituir a excessão por returns com valor booleano:
        if (this.tamanho < this.elementos.length ){
            elementos[tamanho] = elemento;
            tamanho++;  // return true
        } else {
            throw new Exception("Vetor cheio!"); // return false
        }
    }
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        String s = "Vetor de tamanho " + this.tamanho + "\n Elementos: ";

        for (int i = 0; i < this.tamanho; i++){
            s += elementos[i] + ", ";
        }

        // return Arrays.toString(elementos); // Utilizar a classe Arrays dispensa a necessidade de criar um loop para percorrer todo o vetor. Em caso de 'ah, preciso retornar os valores do vetor', pode-se usar somente este método
        return s.toString();
    }
}