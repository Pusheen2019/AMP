# Python program to swap two variables

x = input('Valor de x: ')
y = input('Valor de y: ')

# create a temporary variable and swap the values
temp = x
x = y
y = temp

print('O valor de x depois da troca é: {}'.format(x))
print('O valor de y depois da troca é: {}'.format(y))