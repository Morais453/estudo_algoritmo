Geral = []
Pessoa = {}
Maior = False
for c in range(20):
    Pessoa['Nome'] = input('Informe seu nome: ').capitalize().strip()
    Pessoa['Idade'] = int(input('Informe sua idade: '))
    Pessoa['Sexo'] = input('Informe seu sexo[M/F]: ').upper().strip()
    Geral.append(Pessoa.copy())

    if Pessoa['Idade'] >= 18:
        Maior = True

if Maior:
    print('As pessoas maiores de idade inseridas são: ')
    for i in range(Geral):
        if i["Idade"] >= 18:
            print(f'{i["Nome"]}, {i["Sexo"]} de {i["Idade"]} anos')
            
else:
    print('Das pesoas inseridas, nenhuma é maior de idade')

print(f'Foram listadas um total de {len(Geral)} pessoas')