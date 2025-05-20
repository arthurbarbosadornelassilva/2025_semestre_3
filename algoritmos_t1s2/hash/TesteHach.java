public class TesteHach {
    
    public static void main(String[] args) {
        NossoHash<String, String> mapa = new NossoHash<>();
        mapa.put("12345", "aaaaaa");
        mapa.put("6789", "fghjk");
        mapa.put("23435", "hhhhh");
        mapa.put("7788", "jjjjj");
        mapa.put("44444", "ddddd");
        mapa.put("11111", "vvvvv");
        mapa.imprime();

        String retorno = mapa.get("6789");
        if (retorno != null) {
            System.out.println(retorno + " e o valor associado à sua chave");
        } else {
            System.out.println("Chave não encontrada!");
        }
    }
}
