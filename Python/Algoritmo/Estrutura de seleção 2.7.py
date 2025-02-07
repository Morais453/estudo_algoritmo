massa = float(input('Insira seu peso:  '))
altura = float(input('Insira sua altura:  '))

imc = massa / altura**2

if imc < 20:
    print(f'seu imc é {imc:0.2f} e você esta abaixo do peso')
elif 20 <= imc <= 25:
    print(f'seu imc é {imc:0.2f} e você esta no peso ideal')
else:
    print(f'seu imc é {imc:0.2f} e você esta acima do peso')