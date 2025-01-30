import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int loopCount = 0;
        Scanner scanner = new Scanner(System.in);

        while(1>0){
        try{
            int number = Integer.parseInt(scanner.nextLine());
            loopCount++;
            sum += number;
        }catch(Exception NumberFormatException){
            break;
        }
        }

        if(loopCount==0)System.out.println("SUM = " + sum + " AVG = 0");
        else {
            double average = (double)sum / (double)loopCount;
            System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        }

    }
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();

    }
}
