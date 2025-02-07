Valor_1 = float(input('Insira um valor: '))
Valor_2 = float(input('Insira outro: '))

if Valor_1 == Valor_2:
    print('-'*36)
    print('Os valores identificados são iguais!')
    print('-' * 36)
elif Valor_1 > Valor_2:
    print(f'O valor {Valor_1} é maior')
else:
    print(f'O valor {Valor_2} é maior')