a= int(input('Lado a:  '))

b= int(input('Lado b:  '))

c= int(input('Lado c:  '))

if (a**2 == b**2 + c**2 or b**2 == a**2 + c**2 or c**2 == a**2 + b**2):
    print('Condição verdadeira o triângulo é retângulo')

else:
    print('O valor informado não é um triângulo retângulo')