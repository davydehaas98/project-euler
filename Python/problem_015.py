from timeit import default_timer as timer


def problem_015():
    rows = 20
    columns = 20
    grid = [[0 for c in range(columns + 1)] for r in range(rows + 1)]

    for r in range(len(grid)):
        for c in range(len(grid[0])):
            if r == 0 | c == 0:
                # The sides are always 1
                grid[r][c] = 1
            else:
                grid[r][c] = grid[r - 1][c] + grid[r][c - 1]
    # Get the result from the last number in the bottom right
    highest_number = grid[len(grid) - 1][len(grid[0]) - 1]

    return highest_number


if __name__ == '__main__':
    start = timer()
    answer = problem_015()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
