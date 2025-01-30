public class Operator {
    public static void main(String[] args){
    double a = 20.00d;
    double b = 80.00d;
    double sum = (a + b)*100.00d;
    double remainder = sum%40.00d;
    boolean isRemainderZero = remainder == 0.00 ? true : false;
    System.out.println(isRemainderZero);
    if(!isRemainderZero){
        System.out.println("Got some remainder");
    }
    }
}
