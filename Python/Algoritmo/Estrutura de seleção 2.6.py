Valor_1 = int(input('Insira o valor:  '))
Maior = Valor_1

Valor_2 = int(input('Insira o valor:  '))
if Valor_2 > Maior:
    Maior = Valor_2

Valor_3 = int(input('Insira o valor:  '))
if Valor_3 > Maior:
    Maior = Valor_3

print(Maior)


Valor_1 = int(input('Insira o valor:  '))
Valor_2 = int(input('Insira o valor:  '))
Valor_3 = int(input('Insira o valor:  '))

Lista = [Valor_1, Valor_2, Valor_3]

print(max(Lista))