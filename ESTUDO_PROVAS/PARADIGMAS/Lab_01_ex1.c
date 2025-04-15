#include <stdio.h>

int findConta(int *conta, int cc[1000], int n);
void openConta(int conta, float *saldo, int cc[1000], int *n);
float tomaValor(void);
void menu(int *p);

int main(void)
{
    int cc[1000], n = 0, i, op, conta;
    float saldo[1000], valor;

    for (i = 0; i < 1000; i++)
    {
        cc[i] = 0;
        saldo[i] = 0;
    }
    do
    {
        menu(&op);
        if (op == 1)
        {
            i = findConta(&conta, cc, n);
            if (i != n)
                printf("Esta conta corrente ja existe\n");
            else
                openConta(conta, saldo, cc, &n);
        }
        if (op == 2)
        {
            i = findConta(&conta, cc, n);
            if (i == n)
                printf("Numero de conta-corrente invalido\n");
            else
                printf("Saldo: %.2f\n", saldo[i]);
        }
        if (op == 3)
        {
            i = findConta(&conta, cc, n);
            if (i == n)
                printf("Numero de conta-corrente invalido\n");
            else
                fazerDeposito(saldo, i);
        }
        if (op == 4)
        {
            i = findConta(&conta, cc, n);
            if (i == n)
                printf("Numero de conta-corrente invalido");
            else
                fazerSaque(saldo, i);
        }
        if (op == 5)
        {
            i = findConta(&conta, cc, n);
            if (i == n)
                printf("Numero de conta-corrente invalido");
            else
                fazerPix(saldo, cc, i, n);
        }
    } while (op != 6);

    return 0;
}

void menu(int *p)
{
    printf("1) Abrir conta\n");
    printf("2) Verificar saldo\n");
    printf("3) Fazer Deposito\n");
    printf("4) Fazer Saque\n");
    printf("5) Fazer PIX\n");
    printf("6) Sair do sistema\n");
    scanf("%d", p);
}
int findConta(int *conta, int cc[1000], int n)
{
    int j;
    printf("numero da conta: ");
    scanf("%d", conta);
    for (j = 0; j < n && *conta != cc[j]; j++)
        ;
    return j;
}
void openConta(int conta, float *saldo, int cc[1000], int *n)
{
    float valor;
    printf("valor do deposito inicial: ");
    valor = tomaValor();
    cc[*n] = conta;
    saldo[*n] = valor;
    (*n)++;
    printf("operacao realizada com sucesso\n");
}
void fazerDeposito(float saldo[1000], int i)
{
    float valor;
    printf("valor do deposito: ");
    valor = tomaValor();
    saldo[i] = saldo[i] + valor;
    printf("operacao realizada com sucesso\n");
}
void fazerSaque(float saldo[1000], int i)
{
    float valor;
    printf("valor do saque: ");
    valor = tomaValor();
    saldo[i] = saldo[i] - valor;
    printf("operacao realizada com sucesso");
}
void fazerPix(float saldo[1000], int cc[1000], int i, int n)
{
    float valor;
    int conta, j;

    printf("Numero da conta de destino: ");
    scanf("%d", &conta);
    j = findConta(&conta, cc, n);
    if (j == n)
    {
        printf("Conta de destino invalida\n");
        return;
    }
    else
    {
        printf("valor do PIX: ");
        valor = tomaValor();
        if (saldo[i] >= valor)
        {
            saldo[i] -= valor;
            saldo[j] += valor;
            printf("operacao realizada com sucesso\n");
            return;
        }
        printf("Saldo insuficiente");
    }
}

float tomaValor(void)
{
    float valor;
    scanf("%f", &valor);
    while (valor <= 0)
    {
        printf("o valor deve ser positivo.\n");
        printf("valor: ");
        scanf("%f", &valor);
    }
    return valor;
}