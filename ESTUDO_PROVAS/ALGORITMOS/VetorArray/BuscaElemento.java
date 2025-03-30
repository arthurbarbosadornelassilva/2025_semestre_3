
import java.util.Arrays;

// ****BUSCA DE ELEMENTO NO VETOR****
public class BuscaElemento {

    private Integer numeros[];
    private int tamanho;

    public BuscaElemento(int cont) {    //construtor da classe
        this.numeros = new Integer[cont];
        this.tamanho = 0;
    }

    public boolean adiElemento(int elemento) {
        if (this.tamanho < this.numeros.length) {
            this.numeros[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public Integer buscador(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.numeros[posicao];   // retorna o elemento armazenado naquela posicao
    }

    // ****BUSCA SEQUENCIAL - verifica se o elemento existe no vetor (anda de posição em posição até encontrar o elemento)

    public Integer buscadorSequencial(int elemento) {
        for (int i = 0; i < this.numeros.length; i++){
            if (numeros[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(numeros);
    }
}
