Num_1 = Num_2 = Num_3 = 1

print(f'{Num_1} => {Num_2} => {Num_3}', end=' => ')

for i in range(2,20):
    soma = Num_1 + Num_2 + Num_3

    print(soma, end=" => ")

    Num_1 = Num_2
    Num_2 = Num_3
    Num_3 = soma
