public class WhileChallenge {
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0)return true;
        else return false;
    }
    public static void main(String[] args) {
        int i = 5;
        int totalEven = 0;
        int totalOdd = 0;
        while(i <= 20){
            if(isEvenNumber(i)){
                totalEven++;
                System.out.println("Megfelel a feltételeknek: " + i);
            }
            else totalOdd++;
            i++;
        }
        System.out.println("Összes páros szám : "+ totalEven + " Összes páratlan szám : "+ totalOdd);
    }
}
