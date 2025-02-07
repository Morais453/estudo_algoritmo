import math
GRAUS = int(input('Insira o valor em graus:  '))

print(f'De acordo com o valor inserido temos que:\no seno do grau desejado é {math.sin(GRAUS)}rad\n'
      f'o coseno é {math.cos(GRAUS)}\na tangente é {math.tan(GRAUS)}\na secante {1/math.cos(GRAUS)}')