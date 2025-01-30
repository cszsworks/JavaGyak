public class ThePrimeNumberChallenge {

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber == 1)return false;
        for(int i = 2; i < wholeNumber/2; i++) {
            if(wholeNumber % i == 0)return false;
        }
        return true;
    }

    public static void main(String[] args){

        int primeNumberCounter = 0;
        for (int i = 1 ; i < 850 ; i++){
        if(isPrime(i)){
            primeNumberCounter++;
        }
        if(primeNumberCounter == 3){
            System.out.println("Rreached 3 prime numbers after : " + i + " iterations " );
        }
        }

    }
}
