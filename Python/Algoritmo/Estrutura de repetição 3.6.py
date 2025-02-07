X = int(input('Insira o valor para obter a tabuada: '))

while True:
    if X <= 0:
        X = int(input('Valor inserido incorreto\ninsira um valor positivo para obter a tabuada: '))

    else:
        print('Insira o intervalo da tabuada. O primeiro valor para o menor número e o segundo para o maior:')
        A = int(input('Menor valor: '))
        B = int(input('Maior valor: '))

        if A >= B:
            B = int(input('O segundo valor tem que ser maior que o primeiro\nInsira novamente o segundo valor: '))
        
        else:
            print('-'*15)
            for I in range(B, A - 1, -1):
                print(f'{X} x {I} = {X * I}')
            print('-' * 15)
            break
