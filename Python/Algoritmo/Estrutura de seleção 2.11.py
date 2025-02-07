PESO = float(input('Insira seu peso:  '))
SEXO = input('Informe seu sexo: [M/F]  ')
ALTURA = float(input('Informe sua altura:  '))

imc = PESO / ALTURA**2
print(f'Seu IMC é {imc}')

if SEXO in 'F':
    if imc < 19:
        print('Abaixo do peso')
    elif 19 <= imc < 24:
        print('Peso adequado')
    else:
        print('Acima do peso')

if SEXO in 'M':
    if imc < 20:
        print('Abaixo do peso')
    elif 20 <= imc < 25:
        print('Peso adequado')
    else:
        print('Acima do peso')