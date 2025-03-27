# Definição da sequência de Fibonacci: Fn = Fn-1 + Fn-2
# Os dois primeiros valores da sequência são os mesmos, ou seja, F1 = 1 & F2 = 1

def fibonacci(j):
    # n = [1, 1]

    # for j in range(n[j]):
    #     y = n[j] + n[j - 1]
    #     n.append(y)

    # print(y, " ", n)
    # return y
    n = [1, 1]
    if j < 2:
        return n[j]
    else:
        while (len(n) + 1) <= j:
            y = n[-1] + n[-2]
            n.append(y)
        print(n)
        return n[j - 1]

print(fibonacci(1))
print(fibonacci(11))