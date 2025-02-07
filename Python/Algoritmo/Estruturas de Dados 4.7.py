Geral = []
Maior = []
Pessoa = {}

for c in range(0,20):
    Pessoa['Nome'] = input('Informe seu nome: ').capitalize().strip()
    Pessoa['Idade'] = int(input('Informe sua idade: '))
    Pessoa['Sexo'] = input('Informe seu sexo[M/F]: ').upper().strip()
    Geral.append(Pessoa.copy())
    if Pessoa['Idade'] >= 18:
        Maior.append(Pessoa.copy())

if len(Maior) > 0:
    print('As pessoas maiores de idade inseridas são: ')
    for i in Maior:
        print(f'{i["Nome"]}, {i["Sexo"]} de {i["Idade"]} anos')
    print(f'Foram listadas um total de {len(Maior)} pessoas maiores de idade\n'
          f'E esse valor representa {(len(Maior)/len(Geral))*100}% da quantidade de pessoas')
else:
    print('Das pesoas inseridas, nenhuma é maior de idade')