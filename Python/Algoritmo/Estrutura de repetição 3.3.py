S = input('Insira o sexo: [M/F] ').upper()

while S not in 'MF':
    S = input('Informação incorreta, tente novamente: [M/F] ').upper()

if S in 'F':
    S = 'Feminino'
else:
    S = 'Masculino'

print(f'O genero selecionado foi {S}')
