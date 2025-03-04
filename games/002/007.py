def get_numeric_input(message):
    try:
        return float(input(message).replace(",", "."))
    except ValueError:
        print("Só aceitamos números")
        return get_numeric_input(message)

def get_imc(weight, height):
    return weight / (height**2)

def main():
    weight = get_numeric_input("Qual é o seu peso? (kg) ")
    height = get_numeric_input("Qual é a sua altura? (m) ")

    imc = get_imc(weight, height)

    print("Seu IMC é: ", imc)
    if imc < 18.6:
        return print("Você está abaixo do peso")
    if imc < 25:
        return print("Peso ideal (parabéns)")
    if imc < 30:
        return print("Levemente acima do peso")
    if imc < 35:
        return print("Obesidade grau 1")
    if imc < 40:
        return print("Obesidade grau 2")

    return print("Obesidade grau 3")

main()
