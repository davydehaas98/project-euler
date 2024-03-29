from utils.code_runner import execute_code


def next_fibonacci(a, b):
    c = a + b
    return b, c


def problem():
    total_sum, a, b = 0, 1, 2
    target = 4000000

    while b <= target:
        if b % 2 == 0:
            total_sum += b

        a, b = next_fibonacci(a, b)

    return total_sum



if __name__ == '__main__':
    execute_code(problem)
