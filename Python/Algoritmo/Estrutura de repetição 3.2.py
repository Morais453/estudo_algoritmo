print('Insira 2 valores os quais o segundo deve ser MAIOR que o primeiro')

Valor_1 = int(input('Insira o primeiro valor: '))
Valor_2 = int(input('Insira o segundo valor: '))

while Valor_1 >= Valor_2:
    print('O segundo valor tem que ser maior que o primeiro')
    Valor_2 = int(input('Insira o segundo valor novamente: '))

print(f'Excelente, o primeiro valor informado foi {Valor_1} e o segundo {Valor_2}')