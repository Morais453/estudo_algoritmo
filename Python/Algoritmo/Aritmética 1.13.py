VELOCIDADE_INICIAL = int(input('Insira a valocidade inicial do veículo m/s:  '))

ACELERACION = int(input('Insira a aceleração do veículo em m/s²:  '))

TEMPO = int(input('insira o tempo em segundos:  '))

VELOCIDADE_FINAL = VELOCIDADE_INICIAL + ACELERACION * TEMPO #m/s

print(f'A velocidade final do veiculo a partir dos dados informados é {VELOCIDADE_FINAL*3.6:0.1f}Km/h')