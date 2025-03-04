def get_value(message):
    try:
        return int(input(message))
    except ValueError:
        print("Só aceitamos números, tente novamente")
        return get_value(message)


def main():
    value = get_value("Digite um número: ")

    if value == 0:
        return print(value)
    if value > 0:
        return print("1")

    return print("-1")

main()

