from timeit import default_timer as timer


def problem_006():
    square, number = 0, 0

    for i in range(0, 101):
        square += i
        number += i * i

    difference = square * square - number

    return difference


if __name__ == '__main__':
    start = timer()
    answer = problem_006()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
