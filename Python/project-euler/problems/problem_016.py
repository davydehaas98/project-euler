from utils.code_runner import execute_code


def problem():
    current_number = 1
    number = 2
    total_power = 1000
    # Calculate the power
    for i in range(total_power):
        current_number *= number
    # Calculate the sum of the digits of the number
    digits = [int(x) for x in str(current_number)]
    total_sum = 0

    for digit in digits:
        total_sum = total_sum + digit

    return total_sum


if __name__ == '__main__':
    execute_code(problem)
