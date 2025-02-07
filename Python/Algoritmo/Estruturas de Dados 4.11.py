lista = []
for c in range(0,20):
    nome = input('Insira seu nome: ').capitalize()
    sexo = input('Informe seu sexo[M/F]: ').upper()
    idade = int(input('Insira sua idade: '))
    if sexo in 'F':
        sexo = 'Mulher'
    if sexo in 'M':
        sexo = 'Homem'

    lista.append([idade,nome,sexo])
lista.sort()

print('A partir dos dados informados a lista em ordem crescente de idade é:')

for i in lista:
    print(f'Temos {i[1]}, {i[2]} com {i[0]} anos')