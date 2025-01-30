public class OverloadChallenge {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0) return true;
            if (year % 400 == 0) return true;
            else return false;
        } else return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;

        return switch (month) {
            case 1 -> 31;
            case 2 -> {
                if (isLeapYear(year)) yield 29;
                else yield 28;
            }
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020)); // Output: 29
        System.out.println(getDaysInMonth(2, 2021)); // Output: 28
    }
}
