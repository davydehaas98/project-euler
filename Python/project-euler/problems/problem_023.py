from utils.code_runner import execute_code
import math


def sum_divisors(n):
    if n == 1:
        return 1

    sqrt_n = math.ceil(math.sqrt(n))
    divisor = 2
    total_sum = 1

    while divisor < sqrt_n:
        if n % divisor == 0:
            total_sum += divisor
            total_sum += n // divisor

        divisor += 1
    # Check for root divisor of square number
    if sqrt_n ** 2 == n:
        total_sum += sqrt_n

    return total_sum


def is_abundant(n):
    """
    Abundant: if the sum of its proper divisors is higher than n.
    Deficient: if the sum of its proper divisors is less than n.
    Perfect: If the sum of its proper divisors exactly equals to n.
    """
    if n < 12:  # Smallest abundant number is 12.
        return False

    return sum_divisors(n) > n


def is_sum_of_two_abundant_numbers(n, abundant_numbers):
    for abundant in abundant_numbers:
        difference = n - abundant

        if difference in abundant_numbers:
            return True

    return False


def problem():
    # All abundant number greater than the upper limit
    # can be written as the sum of two abundant numbers.
    upper_limit = 28123
    total_sum = 0
    abundant_numbers = []
    # Get the sum of all the positive integers
    # that cannot be written as the sum of two abundant numbers.
    for i in range(0, upper_limit + 1):
        # Add i to abundant list if it is abundant
        if is_abundant(i):
            abundant_numbers.append(i)
        # Check if i can be summed up with two abundant numbers.
        if not is_sum_of_two_abundant_numbers(i, abundant_numbers):
            total_sum += i
    return total_sum


if __name__ == '__main__':
    execute_code(problem)
