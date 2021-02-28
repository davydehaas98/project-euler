from timeit import default_timer as timer


def calculate_chain(n, iteration):
    iteration += 1

    if n == 1:
        return iteration
    if n % 2 == 0:
        n = n / 2
    else:
        n = 3 * n + 1

    return calculate_chain(n, iteration)


def problem_014():
    max_number = 1000000
    longest_chain = 0
    longest_number = 0

    for current_number in range(2, max_number):
        # Recursion
        current_chain = calculate_chain(current_number, 0)
        # Check if current_chain is longer than longest_chain
        if current_chain > longest_chain:
            longest_chain = current_chain
            longest_number = current_number

    result = longest_number
    return result


if __name__ == '__main__':
    start = timer()
    answer = problem_014()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
