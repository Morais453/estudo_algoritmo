A = int(input('Indique o primeiro termo:  '))

B = int(input('indique o segundo termo:  '))

C = int(input('Indique o termo independente:  '))

Delta = B ** 2 - 4 * A * C

if B > 0 and C > 0:
    print(f' A função informada foi {A}x²+{B}x+{C}')

elif C>0:
    print(f' A função informada foi {A}x²{B}x+{C}')

elif B > 0:
    print(f' A função informada foi {A}x²+{B}x{C}')

else:
    print(f' A função informada foi {A}x²{B}x{C}')

print(f"Delta igual a {Delta}")

if Delta > 0:
    print('Raízes diferentes')
    x1 = (-B + Delta**(1/2)) / (2*A)
    x2 = (-B - Delta**(1/2)) / (2*A)
    print(f'As raízes encontradas são {x1} e {x2}')

elif Delta == 0:
    print('Raízes iguais')
    x = (-B + Delta**(1/2)) / (2*A)
    print(f'A raíz encontrada foi {x}')

else:
    print('Não há raiz real')
    