from timeit import default_timer as timer


def alphabetic_score(name):
    letters = list(name)

    letters = [ord(letter) - 64 for letter in letters]

    return sum(letters)


def problem_022():
    total_score = 0

    with open("problem_022.txt") as file:
        names = file.read().split(',')
    # Remove trailing " symbols
    names = [name.strip("\"") for name in names]
    # Sort names into alphabetical order
    names.sort()

    for i in range(len(names)):
        total_score += alphabetic_score(names[i]) * (i + 1)

    return total_score


if __name__ == '__main__':
    start = timer()
    answer = problem_022()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
