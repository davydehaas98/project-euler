from utils.code_runner import execute_code


def problem():
    n = 100
    factorial = 1
    total_sum = 0
    # n! means n × (n − 1) × ... × 3 × 2 × 1
    # Get the product of all positive integers less than or equal to n
    for current_factorial in range(n, 0, -1):
        factorial *= current_factorial
    # Put the factorial in an int array and sum it up
    for digit in [int(x) for x in str(factorial)]:
        total_sum += digit

    return total_sum


if __name__ == '__main__':
    execute_code(problem)
