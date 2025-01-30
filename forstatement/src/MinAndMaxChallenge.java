import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        Scanner myObject = new Scanner(System.in);
        while(1>0) {
            try {
                double testValue = Double.parseDouble(myObject.nextLine());
                if(testValue < min) {
                    min = testValue;
                }
                if(testValue > max) {
                    max = testValue;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Ez nem egy szám: " + nfe.getMessage());
                break;
            }
        }
        if(min!=Double.MAX_VALUE || max!=Double.MIN_VALUE) {
            System.out.println("A megadott legnagyobb érték: " + max + " A megadott legkisebb érték: " + min);
        }

    }
}
