LISTA = []
for i in range(0, 20):
    VALOR = int(input(f'Insira o valor {i+1}: '))
    LISTA.append(VALOR)
#print(LISTA)

CONSTANTE = int(input('Insira o valor que irá multiplicar os outros números: '))

for o in range(0, 20):
    LISTA[o] = LISTA[o] * CONSTANTE
print(LISTA)
