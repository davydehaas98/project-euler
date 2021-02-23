from timeit import default_timer as timer


def problem_008():
    with open("problem_008.txt") as file:
        digits = [int(x) for x in ''.join(line.strip() for line in file)]

    length = 13
    index, highest_product = 0, 0

    for i in range(len(digits) - length):
        current_product = 1

        for j in range(length):
            current_product *= digits[i + j]

        if current_product > highest_product:
            highest_product = current_product

    return highest_product


if __name__ == '__main__':
    start = timer()
    answer = problem_008()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
