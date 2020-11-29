from timeit import default_timer as timer


def problem_009():
    target = 1000

    for a in range(1, int(target / 3)):
        for b in range(1, int(target / 2)):
            c = target - a - b

            if a < b < c:
                if a ** 2 + b ** 2 == c ** 2:
                    return a * b * c


if __name__ == '__main__':
    start = timer()
    answer = problem_009()
    elapsed_time = (timer() - start) * 1000
    print("Found {} in {} ms".format(answer, elapsed_time))
