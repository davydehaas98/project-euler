from timeit import default_timer as timer


def problem_000():
    result = 0
    return result


if __name__ == '__main__':
    start = timer()
    answer = problem_000()
    elapsed_time = (timer() - start) * 1000
    print("Found {} in {} ms".format(answer, elapsed_time))
