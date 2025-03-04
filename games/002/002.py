def get_password():
    passw = input("Defina uma senha: ")

    return passw

password = get_password()

def get_passport(secret):
    password_entry = input("Digite uma senha: ")

    if password_entry == secret:
        return print("ACESSO PERMITIDO")
    else:
        print("Senha incorreta, tente novamente")
        return get_passport(secret)

get_passport(password)
