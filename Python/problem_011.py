from timeit import default_timer as timer


def problem_011():
    with open("problem_011.txt") as file:
        grid = [line.rstrip('\n') for line in file]

    for i in range(len(grid)):
        grid[i] = [int(x) for x in grid[i].strip().split(' ')]

    total_rows, total_columns, size = len(grid), len(grid[0]), 4
    largest_product = 0

    for x in range(total_rows):
        for y in range(total_columns - size + 1):
            horizontal_vertical_value = \
                max(grid[x][y] * grid[x][y + 1] * grid[x][y + 2] * grid[x][y + 3],
                    grid[y][x] * grid[y + 1][x] * grid[y + 2][x] * grid[y + 3][x])

            diagonal_value = 0

            if x <= total_rows - size:
                diagonal_value = \
                    max(grid[x][y] * grid[x + 1][y + 1] * grid[x + 2][y + 2] * grid[x + 3][y + 3],
                        grid[x][y + 3] * grid[x + 1][y + 2] * grid[x + 2][y + 1] * grid[x + 3][y])

            largest_product = max(largest_product, horizontal_vertical_value, diagonal_value)

    return largest_product


if __name__ == '__main__':
    start = timer()
    answer = problem_011()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
