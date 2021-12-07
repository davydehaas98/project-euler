from utils.code_runner import execute_code


def problem():
    with open("../resources/problem_013.txt") as file:
        digits = [int(line.rstrip('\n')) for line in file]

    current_sum = 0
    # Iterate through the digits
    for i in range(len(digits)):
        current_sum += digits[i]
    # Get the first ten digits
    first_ten_digits = str(current_sum)[0:10]

    return first_ten_digits


if __name__ == '__main__':
    execute_code(problem)
