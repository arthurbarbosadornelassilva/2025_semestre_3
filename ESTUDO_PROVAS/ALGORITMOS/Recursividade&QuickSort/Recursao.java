// Testando a lógica de uma função recursiva

public class Recursao {
    public int fatorial(int n) { // Nessa recursao, testamos um fatorial recursivo
        if (n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }
    public int fibonacci(int p) {
        if (p == 1)
            return 0;
        else if (p == 2)
            return 1;
        return fibonacci(p - 1) + fibonacci(p - 2);
    }
}