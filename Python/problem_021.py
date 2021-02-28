from timeit import default_timer as timer


def d(n):
    total_sum = 0

    for i in range(1, n):
        if n % i == 0:
            total_sum += i

    return total_sum


def problem_021():
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
    start = timer()
    answer = problem_021()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
