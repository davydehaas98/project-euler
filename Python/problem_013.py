from timeit import default_timer as timer


def problem_013():
    with open("problem_013.txt") as file:
        digits = [int(line.rstrip('\n')) for line in file]

    current_sum = 0

    # Iterate through the digits
    for i in range(len(digits)):
        current_sum += digits[i]

    # Get the first ten digits
    first_ten_digits = str(current_sum)[0:10]

    return first_ten_digits


if __name__ == '__main__':
    start = timer()
    answer = problem_013()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
