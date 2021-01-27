from timeit import default_timer as timer


def problem_004():
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
    start = timer()
    answer = problem_004()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
