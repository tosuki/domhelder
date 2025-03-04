from enum import Enum

class Quadranntes(Enum):
    TOP_LEFT = 2
    TOP_RIGHT = 1
    BOTTOM_LEFT = 3
    BOTTOM_RIGHT = 4

def get_quadrante(x, y):
    if y > 0:
        if x > 0:
            return Quadranntes.TOP_RIGHT
        else:
            return Quadranntes.TOP_LEFT
    else:
        if x > 0:
            return Quadranntes.BOTTOM_RIGHT
        else:
            return Quadranntes.BOTTOM_LEFT
    
def get_numeric_input(message):
    try:
        return int(input(message))
    except ValueError:
        print("Só aceitamos números")
        return get_numeric_input(message)

def get_coordinates():
    return {
        get_numeric_input("Digite o valor de X: "),
        get_numeric_input("Digite o valor de Y: ")
    }

x, y = get_coordinates()

print("O quadrante dessa coodernada é: ", get_quadrante(x, y).value)