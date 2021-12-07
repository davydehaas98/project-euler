from utils.code_runner import execute_code


def is_divisible(number):
    for i in range(2, 21):
        if number % i != 0:
            return False

    return True


def problem():
    current = 20

    while not is_divisible(current):
        current += 20

    return current


if __name__ == '__main__':
    execute_code(problem)
