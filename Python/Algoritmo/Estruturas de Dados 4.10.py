lista = []
for c in range(0,20):
    nome = input('Insira um nome: ').upper()
    lista.append(nome)
lista.sort()
print('Os nomes informados organizados em ordem alfabetica são:',lista)