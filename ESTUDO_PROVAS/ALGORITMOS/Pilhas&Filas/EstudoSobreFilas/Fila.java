public class Fila {
    int[] dados;
    int primeiro, ultimo, ocupacao; // primeiro (início da fila), ultimo (próxima ocupação disponível)

    public Fila(int capacidade) { // Construtor para definir o tamanho, se o valor for omisso, a capacidade será 10 por padrão
        primeiro = 0;
        ultimo = 0;
        ocupacao = 0;
        dados = new int[capacidade];
    }

    public Fila() {
        this(10);
    }

    public boolean filaVazia() { // retorna true se a fila estiver vazia
        return ocupacao == 0;
    }

    public boolean filaCheia() { // retorna true se a fila estiver vazia
        return ocupacao == dados.length;
    }

    private int proximaPosicao(int posicao) { // Esse método serve pra fazer a fila funcionar como uma estrutura circular, reaproveitando os espaços que ficaram livres no início do vetor depois de chamadas do desenfileira().
        /*
         * Vamos supor que dados.length = 5 (capacidade do vetor = 5):
         * 
         * | `posicao` | `(posicao + 1) % 5` | Explicação |
         * | --------- | ------------------- | --------------------------------- |
         * | 0         | 1                   | Próximo normal                    |
         * | 1         | 2                   | Próximo normal                    |
         * | 4         | (4 + 1) % 5 = 0     | ***Volta pro início*** (circular) |
         */
        return (posicao + 1) % dados.length;
    }  

    public void enfileira(int e) { // pega o elemento que irá ser adicionado
        if (filaCheia()) { // Verifica se a fila está cheia e trata o erro
            throw new RuntimeException("Falha na inserção");
        }
        dados[ultimo] = e; // adiciona o elemento na ultima posição da fila
        ultimo = proximaPosicao(ultimo); // ultimo recebe a próxima posição da fila ou volta para o início
        ocupacao++; // incrementa a ocupação
    }

    public int desenfileira() {
        if (filaVazia()) {
            throw new RuntimeException("Falha na remoção");
        }
        int aux = dados[primeiro]; // pega o valor do primeiro elemento da fila
        primeiro = proximaPosicao(primeiro); // Move a posição de primeiro para o próximo
        ocupacao--; // diminui a ocupação da fila (quanto elementos tem nela)
        return aux; // retorna o valor removido
    }

    @Override
    public String toString() {
        if (filaVazia()) {
            return "fila vazia";
        }
        String s = "";
        for (int i = primeiro, cont = 0; cont < ocupacao; i = proximaPosicao(i), cont++) {
            // Vai da posição primeiro até completar ocupacao, dando a volta se precisar.
            // O toString() percorre a fila de maneira lógica, independentemente de onde
            // está o primeiro no vetor, usando ocupacao e proximaPosicao() pra não errar a
            // ordem.
            s = s + dados[i] + " ";
        }
        return s;
    }

    public String stringVetor() {
        int i;
        String s = "";
        if (filaVazia()) {
            for (i = 0; i < dados.length; i++) {
                s = s + "_ ";
            } // _ _ _ _ _
        } else if (filaCheia()) {
            for (i = 0; i < dados.length; i++) {
                s = s + dados[i] + " ";
            } // 2 4 5 3 2
        }
        /*
         * dados = [ _, _, 10, 20, _ ]
         * primeiro = 2
         * ultimo = 4
         * ocupacao = 2
         */
        else if (primeiro < ultimo) {
            for (i = 0; i < primeiro; i++) {
                s = s + "_ ";
            }
            for (i = primeiro; i < ultimo; i++) {
                s = s + dados[i] + " ";
            }
            for (i = ultimo; i < dados.length; i++) {
                s = s + "_ ";
            }
        } // _ _ 10 20 _

        /*
         * dados = [70, 80, _, _, 40, 50]
         * primeiro = 4
         * ultimo = 2
         * ocupacao = 4
         */
        else {
            for (i = 0; i < ultimo; i++) {
                s = s + dados[i] + " ";
            } // i = 0 até i = 1 → pega 70 80
            for (i = ultimo; i < primeiro; i++) {
                s = s + "_ ";
            } // i = 2 até i = 3 → posições vazias → _ _
            for (i = primeiro; i < dados.length; i++) {
                s = s + dados[i] + " ";
            } // i = 4 até 5 → pega 40 50
        } // 70 80 _ _ 40 50
        return s;
    }
}

/*
 * Exemplo prático
 * Capacidade do vetor: 5
 * Estado inicial:
 * 
 * primeiro = 0
 * ultimo = 0
 * ocupacao = 0
 * 
 * 1. Enfileira 5 elementos:
 * 
 * enfileira(10); // ultimo = 1
 * enfileira(20); // ultimo = 2
 * enfileira(30); // ultimo = 3
 * enfileira(40); // ultimo = 4
 * enfileira(50); // ultimo = 0 ← Aqui é onde ele "volta"
 * 
 * Veja o que aconteceu:
 * ultimo estava em 4
 * proximaPosicao(4) → (4 + 1) % 5 = 0
 * O ponteiro ultimo voltou para a posição 0
 * MAS: nesse momento ocupacao == 5, ou seja, a fila está cheia
 * Você não pode enfileirar mais até remover alguém da frente
 * 
 * 2. Agora, desenfileira 2 vezes:
 * 
 * desenfileira(); // remove 10
 * desenfileira(); // remove 20
 * 
 * 
 * Agora:
 * primeiro = 2
 * ocupacao = 3
 * As posições 0 e 1 estão liberadas
 * 
 * 3. Agora você pode enfileirar mais!
 * 
 * enfileira(60); // entra em dados[0]
 * ultimo = 1
 * enfileira(70); // entra em dados[1]
 * ultimo = 2
 * 
 * O ultimo deu a volta no vetor sem sobrescrever nada, porque os valores antigos já tinham sido removidos.
 * 
 * 
 */