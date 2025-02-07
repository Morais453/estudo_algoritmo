from math import log

x = int(input('Digite o valor da base:  '))

y= int(input('Agora diga o expoente:  '))

exp= x**y

print(f'{x} elevado a  {y} é igual a {exp}')

print(f'log de {exp} na base {x} é {log(exp, x)}')
