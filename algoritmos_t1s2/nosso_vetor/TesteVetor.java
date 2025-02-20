public class TesteVetor {
    public static void main (String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(6);

        // TESTANDO O ATRIBUTO INTEIRO DE CLASSE PRIVADA 'NossoVetor.ocupacao'
        // Ocorre erro porque o atributo 'ocupacao' é privado e não pode ser acessado diretamente
        // v1.ocupacao = 23;

        int i=10;
        while (!v2.estaCheio()) {
            System.out.println(i);
            v2.insere(i++);
        }
        System.out.println(v2);
        System.out.println();
        while (!v1.estaCheio()) {
            v1.insere(i++);
            // System.out.println(i);
        }
    }
}

// Variável de ponteiro: variável que armazena o endereço de memória de outra variável (variável que aponta para outras variáveis). As variáveis v1 e v2 são variáveis de ponteiro.