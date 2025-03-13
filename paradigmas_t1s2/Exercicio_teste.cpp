#include <iostream>
#include <algorithm>
using namespace std;

double vet1[10], vet2[10], vet3[10];
double calculoMedia() {
    double soma = 0;
    for (int n = 0; n < 10; n++) {
        soma += vet1[n];
    }
    return soma / 10;
}
double calculoMediana() {
    
    return (vet1[4] + vet1[5]) / 2;
}
double calculoModa() {
    NULL;
}

int main(void) {
    cout << "Digite 10 valores no vetor: \n";

    for (int n = 0; n < 10; n++) {
        cout << "Valor " << n << ": \n";
        cin >> vet1[n];
    }
    printf("\nVetor 1: \n");
    for (int n = 0; n < 10; n++) {
        cout << vet1[n] << endl;
    }
    printf("\nMedidas de tendência central do Vetor 1: \n");
    cout << "Média: " << calculoMedia() << endl;
    cout << "Mediana: " << calculoMediana() << endl;
    cout << "Moda: " << calculoModa() << endl;

    return 0;
}