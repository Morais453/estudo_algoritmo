Terceiro = int(input('Insira quantos clicks tiveram o terceiro link: '))
while Terceiro < 1 or Terceiro > 1000:
    print('Valor fora do limite, insira o valor entre 1 e 1000')
    Terceiro = int(input('Insira quantos clicks tiveram o terceiro link: '))

#Segundo = Terceiro * 2
Primeiro = Terceiro / (1/4)

print(Primeiro)