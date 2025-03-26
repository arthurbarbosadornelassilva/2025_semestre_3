#include <stdio.h>

void insere_valores() {
    int matriz_A[3][3];
    int matriz_B[3][3];
    int i = 0;
    
    printf("Insira os valores da matriz A: \n");
    while (i < 10) {
        scanf("%i \n", matriz_A);
        i++;
    }

    printf("Insira os valores da matriz B: \n");
    while (i < 10) {
        scanf("%i \n", matriz_B);
        i++;
    }
}

int main(void) {
    insere_valores();

    return 0;
}