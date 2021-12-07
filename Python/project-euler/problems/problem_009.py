from utils.code_runner import execute_code


def problem():
    target = 1000

    for a in range(1, int(target / 3)):
        for b in range(1, int(target / 2)):
            c = target - a - b

            if a < b < c:
                if a ** 2 + b ** 2 == c ** 2:
                    return a * b * c


if __name__ == '__main__':
    execute_code(problem)
