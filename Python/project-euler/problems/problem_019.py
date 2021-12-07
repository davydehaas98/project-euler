from utils.code_runner import execute_code


def problem():
    days_in_month = [
        0,   # Start index at 1
        31,  # January
        28,  # February
        31,  # March
        30,  # April
        31,  # May
        30,  # June
        31,  # July
        31,  # August
        30,  # September
        31,  # October
        30,  # November
        31,  # December
    ]

    # weekday, day, month, year
    start_date = [2, 1, 1, 1901]
    end_date = [7, 31, 12, 2000]
    counter = 0
    current_date = start_date

    while current_date[3] < end_date[3] or current_date[2] < end_date[2] or current_date[1] < end_date[1]:
        date = current_date
        # Count every Sunday that fell on the first of the month
        if date[0] == 7 and date[1] == 1:
            counter += 1
        # Set weekday
        if date[0] > 6:
            date[0] = 1
        else:
            date[0] += 1
        # Check for new year
        if date[1] == 31 and date[2] == 12:
            date = [date[0], 1, 1, date[3] + 1]
        else:
            # Check if day is the last of the month
            if date[1] < days_in_month[date[2]]:
                date[1] += 1
            else:
                # Check if it is February and a leap year
                if date[2] == 2 and date[1] == 28 and date[3] % 4 == 0:
                    # Is the year a century
                    if str(date[3]).endswith("00"):
                        # Is divisible by 400 and therefore a leap year
                        if date[3] % 400 == 0:
                            date[1] += 1
                        # Is not divisible by 400 and therefore not a leap year
                        else:
                            date[1] = 1  # Set day back to 1
                            date[2] += 1  # Move to the next month
                    else:
                        date[1] += 1
                else:
                    date[1] = 1  # Set day back to 1
                    date[2] += 1  # Move to the next month

        current_date = date

    return counter


if __name__ == '__main__':
    execute_code(problem)
