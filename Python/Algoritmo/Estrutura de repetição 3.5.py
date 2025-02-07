NUMERO = int(input('Insira o valor para obter a tabuada: '))
while NUMERO <= 0:
    NUMERO = int(input('Valor inserido incorreto, informe apenas números positivos: '))
for c in range(1, 11):
    print(f'{NUMERO} x {c} = {NUMERO*c}')
