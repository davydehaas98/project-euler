from timeit import default_timer as timer


def is_divisible(number):
    for i in range(2, 21):
        if number % i != 0:
            return False

    return True


def problem_005():
    current = 20

    while not is_divisible(current):
        current += 20

    return current


if __name__ == '__main__':
    start = timer()
    answer = problem_005()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
