from utils.code_runner import execute_code


def problem():
    with open("../resources/problem_018.txt") as file:
        digits = [line.rstrip('\n') for line in file]

    for i in range(len(digits)):
        digits[i] = [int(x) for x in digits[i].strip().split(' ')]
    # Iterate from the digits array by -1 until 0
    for x in range(len(digits) - 1, 0, -1):
        for y in range(0, x):
            # Get the highest sum of the two possible paths
            digits[x - 1][y] += max(digits[x][y], digits[x][y + 1])

    total_sum = digits[0][0]

    return total_sum


if __name__ == '__main__':
    execute_code(problem)