QJ = int(input('Quantos jogos joão jogou? '))
Jogos = []
Rec = ContadorM = Pior = PJ = 0

for i in range(QJ):
    Pontos = int(input(f'Quantos pontos João fez no jogo {i+1}? '))
    Jogos.append(Pontos)
    if i == 0:
        Rec = Pontos
    elif i > 0 and Rec < Pontos:
        Rec = Pontos
        ContadorM += 1
    if i == 0 or Pontos < Pior:
        Pior = Pontos
        PJ = i
print(f'João bateu {ContadorM} o seu record e o seu pior jogo foi o {PJ + 1}°')
        
    

