from utils.code_runner import execute_code


def problem():
    target_divisors = 500
    current_divisors = 0
    current_triangle = 1
    current = 0

    while current_divisors <= target_divisors:
        current += current_triangle
        square_root = 0

        for i in range(1, current + 1):
            square = i * i
            # print(f"i: {i}")
            # print(f"square: {square}")
            # print(f"current: {current}")
            if square > current:
                square_root = i
                # print(f"square_root: {square_root}")
                break

        current_divisors = 1

        for i in range(1, square_root + 1):
            if current % i == 0:
                if current / i == i:
                    current_divisors += 1
                else:
                    current_divisors += 2

        current_triangle += 1

    return current


if __name__ == '__main__':
    execute_code(problem)
