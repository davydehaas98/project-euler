from timeit import default_timer as timer


def is_prime(number):
    if number <= 1:
        return False
    if number == 2:
        return True
    if number % 2 == 0:
        return False

    counter = 3

    while counter * counter <= number:
        if number % counter == 0:
            return False

        counter += 2

    return True


def problem_007():
    target = 10001

    number_of_primes, number = 1, 1

    while number_of_primes < target:
        number += 2
        if is_prime(number):
            number_of_primes += 1

    return number


if __name__ == '__main__':
    start = timer()
    answer = problem_007()
    elapsed_time = (timer() - start) * 1000
    print("Found {} in {} ms".format(answer, elapsed_time))
