class Date:
    def __init__(self, day, month, year):
        self.day = day
        self.month = month
        self.year = year

def validate_month(month):
    if month > 12 or month < 1:
        return False

    return True

def validate_year(year):
    # if year < 1:
    #     return False

    # if year > 2025:
    #     return False
    if year != 2025:
        return False

    return True

def is_day_greater(day, max_days):
    return day > max_days

def validate_day(day, month):
    if day < 1:
        return False

    if month == 2:
        return not is_day_greater(day, 28)
    if month in [1, 3, 5, 7, 8, 10, 12]:
        return not is_day_greater(day, 31)
    
    return not is_day_greater(day, 30)

def get_segments(dateInput):
    try:
        raw_segments = dateInput.split("/")
        
        if len(raw_segments) != 3:
            return None

        return [int(raw_segments[0]), int(raw_segments[1]), int(raw_segments[2])]
    except ValueError:
        return None

def get_date_input():
    dateInput = input("Digite uma data: ")

    segments = get_segments(dateInput)

    if segments is None:
        print("Data invalida, por favor tente nnovamente")
        return get_date_input()

    if not validate_year(segments[2]):
        print("DATA INVALIDA! O ano é diferente de 2025")
        return get_date_input()
    if not validate_month(segments[1]):
        print("MÊS INVALIDO!")
        return get_date_input()
    if not validate_day(segments[0], segments[1]):
        print("DIA INVALIDO!")
        return get_date_input()
    return Date(segments[0], segments[1], segments[2])

date = get_date_input()

print("Data valida!")