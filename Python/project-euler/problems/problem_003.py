from utils.code_runner import execute_code


def problem():
    number = 600851475143
    i = 2

    while i * i < number:
        while number % i == 0:
            number //= i

        i += 1

    return number


if __name__ == '__main__':
    execute_code(problem)
