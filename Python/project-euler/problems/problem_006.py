from utils.code_runner import execute_code


def problem():
    square, number = 0, 0

    for i in range(0, 101):
        square += i
        number += i * i

    difference = square * square - number

    return difference


if __name__ == '__main__':
    execute_code(problem)
