from timeit import default_timer as timer


def problem_001():
    target, total_sum = 1000, 0

    for i in range(target):
        if i % 3 == 0 or i % 5 == 0:
            total_sum += i

    return total_sum


if __name__ == '__main__':
    start = timer()
    answer = problem_001()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
