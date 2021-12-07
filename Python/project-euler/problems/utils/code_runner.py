from timeit import default_timer as timer

def execute_code(problem):
    start = timer()
    answer = problem()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
