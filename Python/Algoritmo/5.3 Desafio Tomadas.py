Total = -3
for i in range(4):
    t = int(input('Quantas tomadas há na régua? '))
    while t < 1 or t > 6:
        t = int(input('Valor incorreto informe entre 1 e 6. Quantas tomadas há na régua? '))
    Total += t

print(Total)