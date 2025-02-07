LISTA_INICIAL = []
LISTA_FINAL = []
for i in range(0, 20):
    n = int(input(f'Insira o valor {i+1}: '))
    LISTA_INICIAL.append(n)

CONSTANTE = int(input('Insira o valor que irá multiplicar os outros números: '))

for o in range(0, 20):
    LISTA_FINAL.append(LISTA_INICIAL[o] * CONSTANTE)

print(LISTA_INICIAL)
print(LISTA_FINAL)
