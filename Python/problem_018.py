from timeit import default_timer as timer


def problem_000():
    with open("problem_018.txt") as file:
        digits = [line.rstrip('\n') for line in file]

    for i in range(len(digits)):
        digits[i] = digits[i].strip().split(' ')
        digits[i] = [int(x) for x in digits[i]]

    counter = 0


    result = 0
    return result


if __name__ == '__main__':
    start = timer()
    answer = problem_000()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")