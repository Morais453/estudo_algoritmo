PRODUTO_1 = float(input('Digite o valor do produto:  '))
PRODUTO_2 = float(input('Digite o valor do produto:  '))
PRODUTO_3 = float(input('Digite o valor do produto:  '))
PRODUTO_4 = float(input('Digite o valor do produto:  '))
PRODUTO_5 = float(input('Digite o valor do produto:  '))

Total = PRODUTO_1 + PRODUTO_2 + PRODUTO_3 + PRODUTO_4 + PRODUTO_5
print(f'Valor total a pagar R${Total:0.2f}')

PAGO= float(input('Insira o valor pago:  '))

print(f'O troco a ser devolvido é R${PAGO-Total:0.2f}')

#V2
TOTAL = 0
for c in range(1,6):
    Valor = float(input(f'Insira o valor do produto {c}'))
    TOTAL += Valor
print(f'Valor total a pagar R${TOTAL:0.2f}')

PAGAMENTO= float(input('Insira o valor pago:  '))

print(f'O troco a ser devolvido é R${PAGAMENTO-TOTAL:0.2f}')