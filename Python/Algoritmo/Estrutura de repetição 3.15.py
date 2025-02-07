maior = menor = soma = media = POSITIVOS = NEGATIVOS = 0
Quant = int(input('Quantos valores você quer informar? '))

while 0 > Quant or Quant > 20:
    Quant = int(input('Quantos valores você quer informar? '))

while True:
    for i in range(Quant):

        NUMERO = int(input(f'Insira o valor {i + 1}: '))

        soma += NUMERO
        media = soma / (i + 1)

        if NUMERO > maior or i == 0:
            maior = NUMERO

        if NUMERO < menor or i == 0:
            menor = NUMERO

        if NUMERO > 0:
            POSITIVOS += 1
        if NUMERO < 0:
            NEGATIVOS += 1

    print(f'O maior número foi {maior} e o menor foi {menor}.'
          f'\nDos {Quant} valores inseridos:'
          f'\n{(POSITIVOS/(Quant))*100:.1f}% deles são positivos'
          f'\n{(NEGATIVOS/(Quant))*100:.1f}% são negativos'
          f'\na soma entre os números informados foi {soma} e a média foi {media:0.1f}')

    print('-'*40)
    Escolha = input('Quantos valores você ainda quer somar? [S/N]').upper()
    while Escolha not in 'SN':
        Escolha = input('Quantos valores você ainda quer somar? [S/N]').upper()
    if Escolha in 'N':
        break
    
    else:
        maior = menor = soma = media = POSITIVOS = NEGATIVOS = 0
        Quant = int(input('Insira quantos valores você quer: '))
    print('-' * 40)

print('Programa encerrado volte sempre')
