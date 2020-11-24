from timeit import default_timer as timer


def problem_003():
    number = 600851475143
    i = 2

    while i * i < number:
        while number % i == 0:
            number //= i

        i += 1

    return number


if __name__ == '__main__':
    start = timer()
    answer = problem_003()
    elapsed_time = (timer() - start) * 1000
    print("Found {} in {} ms".format(answer, elapsed_time))
