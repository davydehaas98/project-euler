from utils.code_runner import execute_code


zero_to_nineteen = [
    0,
    len("one"),
    len("two"),
    len("three"),
    len("four"),
    len("five"),
    len("six"),
    len("seven"),
    len("eight"),
    len("nine"),
    len("ten"),
    len("eleven"),
    len("twelve"),
    len("thirteen"),
    len("fourteen"),
    len("fifteen"),
    len("sixteen"),
    len("seventeen"),
    len("eighteen"),
    len("nineteen"),
]

tenths = [
    len("twenty"),
    len("thirty"),
    len("forty"),
    len("fifty"),
    len("sixty"),
    len("seventy"),
    len("eighty"),
    len("ninety"),
]


def below_100_length(number):
    if number < 20:
        return zero_to_nineteen[number]

    return tenths[int(number / 10 - 2) | 0] + zero_to_nineteen[number % 10]


def problem():
    target = 1000
    total_sum = 0

    for current in range(1, target + 1):
        if current < 100:
            total_sum += below_100_length(current)
        else:
            thousand = current // 1000
            hundred = current // 100 % 10
            and_number = current % 100

            if current > 999:
                total_sum += below_100_length(thousand) + len("thousand")
            if hundred > 0:
                total_sum += zero_to_nineteen[hundred] + len("hundred")
            if and_number > 0:
                total_sum += len("and") + below_100_length(and_number)

    result = total_sum

    return result


if __name__ == '__main__':
    execute_code(problem)
