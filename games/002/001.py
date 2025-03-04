def is_even(value):
    return value % 2 == 0

def get_value():
    value = int (input("Digite um valor: "))

    if value < 1:
        print("O valor precisa ser maior que 0")
        return get_value()
    return value

value = get_value()

if is_even(value):
    print("O valor é par")
else:
    print("O valor é impar")