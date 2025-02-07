soma = 0

while True:
    Num = int(input("Digite um valor para N (positivo e menor que 100) para mostrar a soma da sequência: "))
    if 0 < Num < 100:
        for i in range(1, Num + 1):
            sequencia = i**2 + 1
            #print(sequencia)
            soma += sequencia
        print(f"A soma dos primeiros {Num} valores da sequência é: {soma}")
        break
    else:
        print("Valor fora do intervalo permitido. Digite um valor positivo menor que 100.")
