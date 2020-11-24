from timeit import default_timer as timer


def next_fibonacci(a, b):
    c = a + b
    return b, c


def problem_002():
    total_sum, a, b = 0, 1, 2
    target = 4000000

    while b <= target:
        if b % 2 == 0:
            total_sum += b

        a, b = next_fibonacci(a, b)

    return total_sum


if __name__ == '__main__':
    start = timer()
    answer = problem_002()
    elapsed_time = (timer() - start) * 1000
    print("Found {} in {} ms".format(answer, elapsed_time))
