import java.util.Random;

public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextBoolean())
                v.insere(i);
            // v.remove();
            else
                try { 
                    System.out.println(v.remove() + " foi removido"); 
                } catch(RuntimeException e){ 
                    System.out.println(e.getMessage()); 
                }
            System.out.println("tamanho = " + v.getTamanho());
            System.out.println(v);
        }
        if (v.contem(10)) 
        System.out.println("10 esta no vetor"); 
        else 
        System.out.println("10 nao esta no vetor"); 

        try { 
            int posicao = v.indiceDe(10); 
            System.out.println("10 encontrado na posicao " + posicao); 
        } 
        catch (RuntimeException e) { 
            System.out.println(e.getMessage()); 
        }
    }
}
