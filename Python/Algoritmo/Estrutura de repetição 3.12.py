soma = 0

while True:
    Num = int(input("Digite um valor para N (positivo e menor que 50): "))

    if 0 < Num < 50:
        for i in range(1, Num+1):
            sequencia = (pow(i,2) + 1) / pow(i, 3)
            #print(sequencia)
            soma += sequencia
        print(f"A soma dos primeiros {Num} valores da sequência é: {soma:.2f}")
        break

    else:
        print("Valor fora do intervalo permitido. Digite um valor positivo menor que 50.")
