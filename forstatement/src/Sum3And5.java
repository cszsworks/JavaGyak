public class Sum3And5 {

    public static void main (String[] args) {
        for (int i = 1 ; i < 1000 ; i++) {
            for (int j = 1 ; j < 1000 ; j++) {
                if(i%j==0 && j%i==0 && j!=i)System.out.print("ez egy olyan szam: "+i);
            }
        }
    }
}
