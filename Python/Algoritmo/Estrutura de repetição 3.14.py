MAIOR = MENOR = soma = media = POSITIVO = NEGATIVO = 0

Quant = int(input('Quantos valores você quer informar? '))

while 0 > Quant or Quant > 20:
    Quant = int(input('Quantos valores você quer informar? '))

for i in range(Quant):

    NUMERO = int(input(f'Insira o valor {i + 1}: '))

    if NUMERO > 20:
        print('Valor incorreto, insira um valor positivo.')
        continue

    soma += NUMERO
    media = soma / (i + 1)

    if NUMERO > MAIOR:
        MAIOR = NUMERO

    if NUMERO < MENOR or i == 0:
        MENOR = NUMERO

    if NUMERO > 0:
        POSITIVO += 1
    if NUMERO < 0:
        NEGATIVO += 1

print(f'O MAIOR número foi {MAIOR} e o MENOR foi {MENOR}'
      f'\nDos números {(POSITIVO/(Quant))*100}% deles são positivos e {(NEGATIVO/(Quant))*100}% são negativos'
      f'\nA soma entre os números informados foi {soma} e a média foi {media}')
