vetor = []
QUANT_INSERIR = int(input('Quantos valores você quer inserir(no máximo 20)? '))
while QUANT_INSERIR < 1 or QUANT_INSERIR > 20:
    print("Quantidade inválida. Escolha entre 1 e 20.")
    QUANT_INSERIR = int(input('Quantos valores você quer inserir: '))

for i in range(QUANT_INSERIR):
    valor = int(input(f"Digite o valor {i + 1}: "))
    vetor.append(valor)

while True:
    numero = int(input("Digite um número para consultar sua posição: "))

    for i in range(len(vetor)):
        if vetor[i] == numero:
            print(f'Número {numero} foi encontrado na posiçção {i} do vetor OU {i+1} na ordem de inserção')
        if (i+1 == len(vetor)) and (vetor[i] != numero):
            print('Valor não encontrado!')

    continuar = input('Deseja continuar[S/N]').upper()
    if continuar != 'S':
        break
