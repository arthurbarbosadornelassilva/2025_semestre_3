import java.util.Scanner;

public class TesteVetor {
    static Scanner s;

    static int menu() {
        System.out.println("Menu: (escolha uma opção)");
        System.out.println("1 - Inserir");
        System.out.println("2 - Remover");
        System.out.println("3 - Exibir");
        System.out.println("0 - Sair");
        // Scanner s = new Scanner(System.in);
        // int op = s.nextInt();
        // s.close();
        // return op; // return cancela o método menu quando este é finalizado após return, portanto criamos uma variável para armazenar o valor de op (s.nextInt())

        return s.nextInt();
    }
    public static void main (String[] args) {
        NossoVetor v1 = new NossoVetor();
        NossoVetor v2 = new NossoVetor(6);
        s = new Scanner(System.in);

        // TESTANDO O ATRIBUTO INTEIRO DE CLASSE PRIVADA 'NossoVetor.ocupacao'
        // Ocorre erro porque o atributo 'ocupacao' é privado e não pode ser acessado diretamente
        // v1.ocupacao = 23;

        // int i=10;
        // while (!v2.estaCheio()) {
        //     System.out.println(i);
        //     v2.insere(i++);
        // }
        // System.out.println(v2);
        // System.out.println();
        // while (!v1.estaCheio()) {
        //     v1.insere(i++);
        // }
        // System.out.println(v1);

        int opcao  = menu();
        while (opcao > 0) {
            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    // Scanner s = new Scanner(System.in);
                    System.out.println("Digite um número: ");
                    v1.insere(s.nextInt());
                    // s.close();
                    break;
                case 2:
                    if (!v1.estaVazio())
                        System.out.println("Removido: " + v1.remove());
                    else
                        System.out.println("Vetor vazio!");
                    break;
                case 3:
                    System.out.println(v1);

                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            opcao = menu();
        }
        System.out.println("Obrigado por usar nosso programa!");
        s.close();
    }
}
// Variável de ponteiro: variável que armazena o endereço de memória de outra variável (variável que aponta para outras variáveis). As variáveis v1 e v2 são variáveis de ponteiro.