import java.util.Scanner;

public class CalendarDisplay {

    // method to get month name
    public static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June",
                           "July","August","September","October","November","December"};
        return months[month - 1];
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // method to get number of days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    // method to get first day of month using Zeller’s Congruence
    public static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int k = year % 100;
        int j = year / 100;
        int day = (1 + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (day + 6) % 7; // 0=Sunday
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // calculating days and first day
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        // displaying the result
        System.out.println("\nCalendar for " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }

        scanner.close();
    }
}
