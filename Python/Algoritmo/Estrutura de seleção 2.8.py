a = int(input('Lado A:  '))
b = int(input('Lado B:  '))
c = int(input('Lado C:  '))

#Condição de existencia do triângulo
if (a < b + c and b < a + c and c < a + b):
    
    if (a == b and b == c):
        print('Triângulo equilátero')

    elif (a == b or a==c or b==c):
        print('Triângulo isósceles')

    else:
        print('Triângulo escaleno')
        
else:
    print("Triângulo não formado")