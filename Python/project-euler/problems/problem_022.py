from utils.code_runner import execute_code


def alphabetic_score(name):
    letters = list(name)
    # ord() gives the ASCII value of the character.
    # Because all the characters in the text file are in capitals,
    # and the capitalized characters in ASCII start at 65, subtract 64
    letters = [ord(letter) - 64 for letter in letters]

    return sum(letters)


def problem():
    total_score = 0

    with open("../resources/problem_022.txt") as file:
        names = file.read().split(',')
    # Remove trailing " symbols
    names = [name.strip("\"") for name in names]
    # Sort names into alphabetical order
    names.sort()

    for i in range(len(names)):
        total_score += alphabetic_score(names[i]) * (i + 1)

    return total_score


if __name__ == '__main__':
    execute_code(problem)
