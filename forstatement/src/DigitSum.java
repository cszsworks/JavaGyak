public class DigitSum {
        public static boolean isPalindrome(int number){
            if(number < 0)number = Math.abs(number);
            int reverseNum = number%10;
            int originalNumber = number/10;
            while (originalNumber>0){
                reverseNum *=10;
                reverseNum += originalNumber%10;
                originalNumber /= 10;
            }

            System.out.println("Eredeti szám:" + number + "Forditott szám:" + reverseNum);
            if (reverseNum == number){
                return true;
            }
            else return false;
        }

    public static void main(String[] args) {
    System.out.println("A visszatérő érték: " + isPalindrome(-222));
    }
}
