// Diferença entre procedimento estruturado e orientado a objetos:
// o procedimento estruturado não cira 'pacotes' que chamamos de classes que são trabalhados em orientação a objetos (que armazenam atributos e métodos)

// Relembrando definição de 'Classe' e 'Objeto':
//
// Classe: modelo
// Objeto: instância desse modelo (abstração do modelo)

// Relembrando níveis de acesso do Java (do mais aberto ao mais privado):
//
//              Classe  Pacote  Herdeiros   Mundo
// PUBLIC/         x       x        x         x 
// PROTECTED/      x       x        x
// DEFAULT/        x       x
// PRIVATE/        x



public class NossoVetor {
    private int[] vetor;
    private int ocupacao;

    // criação do Construtor da classe
    public NossoVetor (int tamanho) {
        vetor = new int[tamanho];
        //por clareza
        ocupacao = 0;
    }
    // vetor tem padrão de ocupação 10
    public NossoVetor() {
        // vetor = new int[10];
        // ocupacao = 0
        this(10);
    }
    public void insere (int i) {
        if (!estaCheio())
            vetor[ocupacao] = i;
            ocupacao++;
    }
    public boolean estaCheio() {
        // MAIS ETAPAS
        // if (ocupacao == vetor.length)
        //     return true;
        // return false;

        // MENOS ETAPAS
        return ocupacao == vetor.length;
    }
    @Override
    public String toString() {
        String s = "ocupacao = " + ocupacao + "\n";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s + "\n";
    }
}