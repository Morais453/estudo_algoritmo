P1 = int(input('Informe a nota da sua primeira avaliação: '))

P2 = int(input('Informe a nota da sua segunda avaliação: '))

media = (P1 + 2*P2) / 3

print(f'Sua média foi {media:.1f}')

if media >= 5:
    print('Você foi aprovado')
else:
    print('Reprovado')