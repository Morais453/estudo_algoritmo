LISTA = []

for i in range(0,10):
    Num = int(input(f'Insira o valor {i+1}: '))
    LISTA.append(Num)

LISTA.reverse()

print(LISTA)
