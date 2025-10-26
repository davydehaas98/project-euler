package nl.davydehaas.projecteuler;

import static nl.davydehaas.projecteuler.util.SolutionTimer.timeSolution;

public class Problem019 {

    void main() {
        timeSolution(Problem019::solve);
    }

    static int solve() {
        int[] startDate = new int[]{2, 1, 1, 1901};
        int[] endDate = new int[]{7, 31, 12, 2000};

        int[] currentDate = startDate;
        int counter = 0;

        while (currentDate[3] < endDate[3]
                || currentDate[2] < endDate[2]
                || currentDate[1] < endDate[1]) {
            int[] date = currentDate;
            // Count every Sunday that fell on the first of the month.
            if (date[0] == 7 && date[1] == 1) {
                counter += 1;
            }
            // Set weekday.
            if (date[0] > 6) {
                date[0] = 1;
            } else {
                date[0] += 1;
            }
            // Check for new year.
            if (date[1] == 31 && date[2] == 12) {
                date = new int[]{date[0], 1, 1, date[3] + 1};
            } else {
                // Check if day is the last of the month.
                if (date[1] < daysInMonth[date[2]]) {
                    date[1] += 1;
                } else {
                    // Check if it is February and a leap year
                    if (date[2] == 2 && date[1] == 28 && date[3] % 4 == 0) {
                        // Check if the year is a century.
                        if (String.valueOf(date[3]).endsWith("00")) {
                            // Check if the year is divisible by 400.
                            if (date[3] % 400 == 0) {
                                date[1] += 1;
                            } else {
                                // Set day back to 1.
                                date[1] = 1;
                                // Move to the next month.
                                date[2] += 1;
                            }
                        } else {
                            date[1] += 1;
                        }
                    } else {
                        // Set day back to 1.
                        date[1] = 1;
                        // Move to the next month.
                        date[2] += 1;
                    }
                }
            }
            currentDate = date;
        }

        return counter;
    }

    private static int[] daysInMonth = new int[]{
            0,  // Start at 1
            31, // January
            28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31, // December
    };
}
