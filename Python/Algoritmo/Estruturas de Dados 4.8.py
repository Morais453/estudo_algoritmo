vetor = []
for c in range(0,20):
    valor = int(input(f'Insira o valor {c+1}:  '))
    vetor.append(valor)
    
vetor.sort()
print(vetor)