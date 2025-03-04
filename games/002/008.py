def get_discount(value):
    if value < 101:
        return 0
    if value < 201:
        return 10
    if value < 301:
        return 20
    if value < 401:
        return 30

    return 40

# 302 = 100
#  x = 30

# 32*30 = 100x

def get_porcentage(total, porcentage):
    return total*porcentage / 100

def get_final_value(amount):
    return amount - get_porcentage(amount, get_discount(amount))

def get_numeric_input(message):
    try:
        return int(input(message))
    except ValueError:
        print("Só aceitamos números")
        return get_numeric_input(message)

amount = get_numeric_input("Quantos parafusos você vai comprar? ")

print("O valor final fica: ", get_final_value(amount))