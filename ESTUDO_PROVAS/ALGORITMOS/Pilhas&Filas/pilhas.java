// Ciência da Computação – Estrutura de Dados 2025 / 1
// Exercícios para estudos sobre pilhas e filas.

// Instruções:

    // • Alguns exercícios desta lista devem ser resolvidos desenhando-se a estrutura, para o entendimento
    // sobre seu funcionamento;
    // • para outros considere as classes Pilha e Fila desenvolvidas nos labs da disciplina (todas as
    // implementações);
    // • alguns métodos devem manipular os atributos da classe diretamente, ou seja, serão métodos da
    // própria classe, nesse caso, faça para as duas implementações: sobre listas ligadas e sobre vetores;
    // outros devem ser desenvolvidos numa classe de aplicação, ou seja, utilizam os métodos das classes
    // estrutura;
    // • definir os parâmetros e os tipos de retorno faz parte da solução;
    // • você pode procurar a professora para tirar dúvidas, bem como os monitores.


// Parte I - Pilhas

// 1. Suponha uma pilha implementada sobre vetores, para a qual tenham sido executadas 25
// inserções, 12 exibições de tamanho, 10 remoções, das quais 3 geraram resultado vazia. Qual a
// posição do topo ao final das operações?

// 2. Considere uma pilha vazia, qual sua configuração após as operações: empilha 5, empilha 3,
// desempilha, empilha 2, empilha 8, desempilha, desempilha, empilha 9, empilha 1, desempilha,
// empilha 7, empilha 6, desempilha, empilha 10, desempilha, empilha 4, desempilha,
// desempilha.

// 3. Duas pilhas sequenciais numéricas estão ordenadas crescentemente a partir do topo.
// Desenvolver um método que transfere os elementos dessas pilhas para uma terceira pilha,
// inicialmente vazia, de modo que ela fique ordenada decrescentemente, ou seja, com o maior
// valor no topo.

// 4. Dado o estado inicial das pilhas p1, p2 e p3 na figura a seguir, mostre por meio de desenho, o
// estado final delas após as operações descritas no código a seguir. Considere que p1, p2 e p3
// sejam objetos da classe Pilha vista em aula:

    // int temp = p1.desempilha ();
    // p2.empilha (temp);
    // p3.empilha (p1.desempilha());
    // p2.empilha (p1.desempilha());
    // temp = p1.desempilha ();
    // p3.empilha (temp);
    // p1.empilha (p2.desempilha());
    // p3.empilha (p2.desempilha());
    // p3.empilha (p1.desempilha());

// 5. Construir um método que transfere os dados de uma pilha p1 para uma pilha p2, utilizando os
// métodos da classe Pilha, de maneira que eles mantenham a ordem original. Sugestão: Use
// uma pilha auxiliar.

// 6. Escrever um método para verificar se um determinado item está presente em uma pilha. Em
// caso positivo, a função devolve a posição do item na pilha, levando o topo como posição 1.
// Caso o elemento não esteja presente, a função devolve 0. A pilha deve permanecer a
// mesma após a execução do procedimento.

// 7. Uma palavra é um palíndromo se tem a mesma sequência de letras, quer seja lida da esquerda
// para a direita ou da direita para a esquerda (exemplo: raiar). Escrever um método para
// verificar se uma palavra é um palíndromo, usando pilha(s).

// 8. Escrever um método para encontrar o maior elemento de uma pilha

// 9. Escrever um método para encontrar o menor elemento de uma pilha

// 10. Escrever um método para encontrar o maior elemento de uma pilha e colocá-lo na base da
// pilha.

// 11. Escrever um método para encontrar o menor elemento de uma pilha e colocá-lo no topo da
// pilha.

// 12. Considere que você tem duas pilhas p1 e p2 e uma delas deve ser esvaziada, ou seja, os
// elementos de uma delas devem ser empilhados na outra.
    // a. Qual você escolheria para esvaziar de maneira a fazer o menor número de operações
    // possível?

    // b. Desenvolver um método que realiza esta operação.
