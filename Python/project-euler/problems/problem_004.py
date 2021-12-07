from utils.code_runner import execute_code


def problem():
    largest_palindrome = 0

    for i in range(999, 100, -1):
        for j in range(999, 100, -1):
            current = i * j
            if current > largest_palindrome:
                s = str(current)
                if s == s[::-1]:
                    largest_palindrome = current

    return largest_palindrome


if __name__ == '__main__':
    execute_code(problem)
