import java.util.Scanner;

public class SwitchWeekdays7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What day is it today? Sunday starts with 0, and " +
                "ends with 6 as Saturday : ");

        int weekDayValue = input.nextInt();

        while (weekDayValue < 0 || weekDayValue > 6) {
            System.out.println("Wrong input, try again");

            weekDayValue = input.nextInt();
        }

        System.out.println("Some days ahead : ");
        int daysAhead = input.nextInt();

        int weekDayValueAhead = (weekDayValue + daysAhead) % 7;

        findWeekDay(weekDayValueAhead);
    }

    static void findWeekDay(int weekdaysInNumbers) {

        switch (weekdaysInNumbers % 7) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");

        }
    }

}

