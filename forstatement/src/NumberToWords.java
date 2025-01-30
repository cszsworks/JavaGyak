public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0)System.out.println("Invalid Value");
        if(number == 0)System.out.println("Zero");
        int testedNumber = reverse(number);
        int extraZeroIteration = getDigitCount(number)-getDigitCount(reverse(number));

        while (testedNumber > 0) {
            int currentDigit = testedNumber % 10;
            testedNumber /= 10;
            System.out.println(switch (currentDigit){
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Hiba";
            });
        }

        for (int i = 0; i < extraZeroIteration; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int input){
        int testedNum = input;
        int reversedNumber = 0;
        while(testedNum != 0) {
            int currentDigit = testedNum % 10;
            reversedNumber *= 10;
            reversedNumber +=currentDigit;
            testedNum /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int input){
        if(input < 0)return -1;
        if(input == 0)return 1;
        int digitCount = 0;
        while(input>0){
            digitCount++;
            input /= 10;
        }
        return digitCount;
    }

    public static void main(String[] args) {
        System.out.println("Visszatérő érték a reverseneke: "+ reverse(-1535));
        numberToWords(5);
    }
}
