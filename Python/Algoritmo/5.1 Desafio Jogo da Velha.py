matriz = [['', '', ''], ['', '', ''], ['', '', '']]
while True:
    # DEFINIR NOME DOS PLAYERS
    player1 = str(input('Informe seu nome: '))
    player2 = str(input('Informe seu nome: '))

    # VARIAVEIS PARA MARCAÇÃO E CONTROLE
    V_Controle = True
    simbolo = 'X'
    Jogador = 'i'

    # JOGO EM SI, LAÇO CONT COM O N° MÁXIMO DE JOGADAS POSSIVEIS
    for i in range(9):
        if i % 2 == 0:  # DEFINIÇÃO DE NOME E SIMBOLO DE JOGADOR
            simbolo = 'X'
            Jogador = player1
        if i % 2 == 1:  # DEFINIÇÃO DE NOME E SIMBOLO DE JOGADOR
            simbolo = 'O'
            Jogador = player2

        print(f'É a vez de {Jogador}:')

        # LAÇO CONTINUO
        while V_Controle:

            # DEFINIÇÃO DA JOGADA, LINHA E COLUNA
            linha = int(input('Informe onde adicionar seu simbolo na linha[1,2,3]: ')) - 1
            coluna = int(input('Informe onde adicionar seu simbolo na coluna [1,2,3]: ')) - 1
            if matriz[linha][coluna] == '':  # VERIFICAÇÃO SE A MATRIZ ESTÁ DISPONIVEL OU NÃO, SE SIM ADICIONA O SIMBOLO EQUIVALENTE AO JOGADOR E QUEBRA O LAÇO CONTINUO
                matriz[linha][coluna] = simbolo
                break

            # SE NÃO ESCREVE QUE JÁ TEM ITEM E CONTINUA PEDINDO UMA COORDENADA PARA O SIMBOLO
            else:
                print('Já contém item, tente novamente')

        # MOSTRA O TABULEIRO A CADA RODADA
        print(f'''{matriz[0][0]:^3}|{matriz[0][1]:^3}|{matriz[0][2]:^3}\n---|---|---\n{matriz[1][0]:^3}|{matriz[1][1]:^3}|{matriz[1][2]:^3}\n---|---|---\n{matriz[2][0]:^3}|{matriz[2][1]:^3}|{matriz[2][2]:^3}''')

        # VERIFICAR CONDIÇÃO DE VITÓRIA A PARTIR DA QUINTA JOGADA
        if i > 4:

            for l in range(0, 3):
                # VERIFICA LINHA
                if matriz[l][0] == matriz[l][1] == matriz[l][2] != '':
                    print(f'A vitória foi de {Jogador} na linha {l + 1}')
                    V_Controle = False  # INTERROMPE O LAÇO CONTINUO
                    break  # INTERROMPE O 'FOR'

                # VERIFICA COLUNA
                elif matriz[0][l] == matriz[1][l] == matriz[2][l] != '':
                    print(f'A vitória foi de {Jogador} na coluna {l + 1}')

                    V_Controle = False
                    break

                # VERIFICA AS DIAGONAIS
                elif matriz[0][0] == matriz[1][1] == matriz[2][2] or matriz[0][2] == matriz[1][1] == matriz[2][0]:
                    print(f'A vitória foi de {Jogador}')
                    V_Controle = False
                    break

                # SE CHEGAR A 9 JOGADAS SEM VITÓRIA DECLARAR EMPATE
                else:
                    if i == 9:
                        print('Empate')
                        break
        # SE A VARIAVEL DE CONTROLE RECEBER FALSE ANTES DO LOOP PRINCIPAL ACABAR, INTERROMPER O LOOP
        if V_Controle == False:
            break
    Esc = input('Voce quer continuar com uma nova partida?[S/N]').upper()
    while Esc not in 'SN':
        Esc = input('Voce quer continuar com uma nova partida?[S/N]').upper()
    if Esc in 'S':
        matriz = [['', '', ''], ['', '', ''], ['', '', '']]
        continue
    else:
        break
