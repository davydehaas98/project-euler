from timeit import default_timer as timer


def sieve_of_eratosthenes(number):
    # https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
    # https://www.geeksforgeeks.org/sieve-of-eratosthenes

    # Create a boolean array "prime[0..n]" and initialize
    #  all entries it as true. A value in prime[i] will
    # finally be false if i is Not a prime, else true.
    prime = [True for i in range(number + 1)]
    p = 2
    primes = []

    while p * p <= number:
        # If prime[p] is not changed, then it is a prime
        if prime[p]:
            # Update all multiples of p
            for i in range(p * p, number + 1, p):
                prime[i] = False
        p += 1
    # Add up all prime numbers
    for p in range(2, number + 1):
        if prime[p]:
            primes.append(p)

    return primes


def problem_010():
    total_sum, target = 0, 2000000
    # Get all primes below target
    primes = sieve_of_eratosthenes(target - 1)

    for prime in primes:
        total_sum += prime

    return total_sum


if __name__ == '__main__':
    start = timer()
    answer = problem_010()
    elapsed_time = (timer() - start) * 1000
    print(f"Found {answer} in {elapsed_time} ms")
