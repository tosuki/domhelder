def quicksort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        left = [x for x in arr[1:] if x < pivot]
        right = [x for x in arr[1:] if x >= pivot]
        return quicksort(left) + [pivot] + quicksort(right)

arr = quicksort([3, 1,2,3])

def get_input(message):
    try:
        value = int(input(message))

        return value
    except ValueError:
        print("Só aceitamos números")
        return get_input()

def get_boolean_value(message):
    value = input(message)
    
    if value.lower() in {"y", "yes", "s", "sim"}:
        return True
    else:
        return False

def get_inputs(acc = []):
    value = get_input("Digite um número: ")
    acc.append(value)
    
    if get_boolean_value("Você quer adicionnar mais um número? "):
        return get_inputs(acc)

    return acc

def is_even(value):
    return value % 2 == 0

def get_middle(list):
    size = len(list)

    if size <= 0:
        return None

    if is_even(size):
        return list[size/2]

    return list[(round((size-1)/2))]

def main():
    sorted_values = quicksort(get_inputs())

    if len(sorted_values) == 0:
        return print("Lista de números vazia")
    
    print("O maior número é: ", sorted_values[len(sorted_values) - 1])
    
    if len(sorted_values) > 2:
        print("O número do meio é: ", get_middle(sorted_values))
        
    print("O menor número é: ", sorted_values[0])

main()
