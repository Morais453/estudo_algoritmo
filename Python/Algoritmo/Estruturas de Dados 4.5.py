GERAL_PESSOAS = []
PESSOAS = {}
Mulher = False
for c in range(0,20):
    PESSOAS['Nome'] = input('Informe seu  NOME: ').capitalize().strip()
    PESSOAS['Idade'] = input('Informe sua idade: ').strip()
    PESSOAS['Sexo'] = input('Informe seu sexo[M/F]: ').upper().strip()
    GERAL_PESSOAS.append(PESSOAS.copy())

    if PESSOAS['Sexo'] in 'F':
        Mulher = True

if Mulher:
    print('As mulheres listadas são: ')
    for i in GERAL_PESSOAS:
        if i['Sexo'] in 'F':
            print(f'{i["Nome"]} com {i["Idade"]} anos')
else:
    print('Nenhuma mulher foi listada')