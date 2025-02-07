CONTADOR = 3
#n = int(input('Quantos números da sequência Fibonacci você quer exibir:'))
Num_1 = 0
Num_2 = 1
print(f'{Num_1} -> {Num_2}', end=' -> ')
while CONTADOR <= 30:
    Soma = Num_1 + Num_2
    print(f'{Soma}', end=' -> ')
    Num_1 = Num_2
    Num_2 = Soma
    CONTADOR += 1
print('Fim')
