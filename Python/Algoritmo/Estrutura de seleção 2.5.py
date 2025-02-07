BASE = float(input('Insira o valor da base do terreno:  '))
ALTURA = float(input('Insira o valor da altura do terreno:  '))

AREA = BASE * ALTURA
if AREA > 100:
    print(f'Terreno grande com área igual a {AREA}')
else:
    print(f'Terreno pequeno de área {AREA}')