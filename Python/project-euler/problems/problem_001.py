from utils.code_runner import execute_code


def problem():
    target, total_sum = 1000, 0

    for i in range(target):
        if i % 3 == 0 or i % 5 == 0:
            total_sum += i

    return total_sum


if __name__ == '__main__':
    execute_code(problem)
