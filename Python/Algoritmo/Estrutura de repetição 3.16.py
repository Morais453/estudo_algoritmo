while True:

    Fatorial = int(input("Insira o número para obter o fatorial:  "))
    
    while Fatorial < 0:
        print('Erro valor inválido')
        Fatorial = int(input("Insira o número para obter o fatorial:  "))

    n = 1
    for i in range(Fatorial,0,-1):
        n *= i

    print(n)

    Escolha = input('Deseja continuar? [S/N]').upper()
    while Escolha not in 'SN':
        Escolha = input('Deseja continuar? [S/N]').upper()
    if Escolha in 'N':
        break
print('Programa encerrado')