import java.util.Scanner;

public class TestePessoa {
    public static void main(String [] args) {
        Scanner sn = new Scanner(System.in);
        int id = sn.nextInt();
        sn.nextLine(); // consumindo o <enter> da leitura anterior
        String nome = sn.nextLine();
        Pessoa p = new Pessoa(id, nome);
        System.out.println(p);
        sn.close();
    }
}