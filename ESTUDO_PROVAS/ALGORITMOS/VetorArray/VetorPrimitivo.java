
public class VetorPrimitivo {

    // ****VETOR PRIMITIVO****:

    private Double[] VetorTempDia; //declarando o vetor
    
    public VetorPrimitivo(int capacidade){ //construtor
        this.VetorTempDia = new Double[capacidade]; //parâmetro define a capacidade do vetor
    }
    public void setElement(Double elemento) { //método que permite adicionar elementos ao vetor, avaliando o seu tamanho, cada um dos espaços com valor 'null' e atribuindo o elemento a este espaço (método relativamente ineficiente)
        for(int i = 0; i < this.VetorTempDia.length; i++){ 
            if (VetorTempDia[i] == null){
                VetorTempDia[i] = elemento;
                break; //parar de adicionar novos elementos ao vetor
            }
        }
    }
    public Double getElement() {    // método retorna os valores armazenados em 'VetorTempDia'
        for (Double elemento: this.VetorTempDia){ // uso do FOR APRIMORADO
            System.out.println("" + elemento);
        }
        return null; //retorna nada
    }    
}