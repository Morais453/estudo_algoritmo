valor_1 = float(input('Insira um número:  '))
valor_2 = float(input('Insira um número:  '))
valor_3 = float(input('Insira um número:  '))
valor_4 = float(input('Insira um número:  '))
print('A média entre os 4 valores inseridos é {}'.format((valor_1 + valor_2 + valor_3 + valor_4) / 4))

soma = 0
for i in range(0,4):
    valor = float(input(f'Insira o valor {i+1}: '))
    soma += valor
print(f'A média dos valores inseridos corresponde a {soma/4}')