vetor = []
for c in range(0,10):
    valor = int(input(f'Insira o valor {c+1}:  '))
    vetor.append(valor)
    
vetor.sort(reverse=True)

print(vetor)