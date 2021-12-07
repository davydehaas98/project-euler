from utils.code_runner import execute_code


def swap(a, b, array):
    # Save first character
    c = array[a]

    array[a] = array[b]
    array[b] = c

    return array


def problem():
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
    execute_code(problem)
