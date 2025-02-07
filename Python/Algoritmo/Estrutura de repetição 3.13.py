maior = soma = media = 0

for i in range(10):

    n = int(input(f'Insira o valor {i + 1}: '))

    if n <= 0:
        print('Valor incorreto, insira um valor positivo.')
        continue

    soma += n
    media = soma / (i + 1)

    if n > maior:
        maior = n

print(f'O maior número foi {maior}, a soma entre os números informados foi {soma} e a média foi {media}')
