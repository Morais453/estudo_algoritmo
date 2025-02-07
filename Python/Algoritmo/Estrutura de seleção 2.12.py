ACELERACION = int(input('Insira a aceleração do veículo: m/s²'))
VELOCIDADE_INICIAL = int(input('Insira a velocidade inicial:  m/s'))
TEMPO = int(input('Insira o tempo de percurso: s'))
VELOCIDADE_MS = VELOCIDADE_INICIAL + ACELERACION * TEMPO

Km = VELOCIDADE_MS * 3.6

print(f'Sua velocida média de foi igual a {VELOCIDADE_MS}m/s ou {Km}Km/h')

if Km <= 40:
    print('Muito lento')

if 40 < Km <= 60:
    print('Velocidade permitida')

if 60 < Km <= 80:
    print('Velocidade de cruzeiro')

if 80 < Km <= 120:
    print('Sr. ta meio rápido, né?')

if Km > 120:
    print('Quer conhecer Jeusus mais cedo?')