Num = int(input('Insira um número maior que zero: '))
while 0 >= Num:
    Num = int(input('Valor incorreto tente novamente: '))
    
print(f'O valor informado foi {Num}')