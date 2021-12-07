from utils.code_runner import execute_code


def d(n):
    total_sum = 0

    for i in range(1, n):
        if n % i == 0:
            total_sum += i

    return total_sum


def problem():
    max_range = 10000
    total_sum = 0

    for a in range(1, max_range):
        b = d(a)
        # Is amicable
        if a != b and d(b) == a:
            total_sum += a
    # Divide the total sum by 2 because every number was added twice.
    return total_sum


if __name__ == '__main__':
    execute_code(problem)
