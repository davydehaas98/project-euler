from timeit import default_timer as timer


def swap(a, b, array):
    # Save first character
    c = array[a]

    array[a] = array[b]
    array[b] = c

    return array


def problem_024():
    digits = [0, 1, 2, 3]
    permutations = [digits.copy()]

    for i in range(len(digits)):
        # current_digits = swap(0, i, digits.copy())
        # permutations.append(current_digits)

        for j in range(i):
            current_digits = swap(i, i - j, digits.copy())
            permutations.append(current_digits)

    print(permutations)
    return 0


if __name__ == '__main__':
    start = timer()
    answer = problem_024()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
