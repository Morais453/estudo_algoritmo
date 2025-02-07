import math
DIAMETRO = int(input('Insira o diâmetro da esfera: '))
RAIO = DIAMETRO/2
VOLUME = 4/3 * math.pi * RAIO**3
print(f'O volume da esfera é igual a {VOLUME:0.2f}')