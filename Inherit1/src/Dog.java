public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt","Big",15);
    }

    public Dog(String type, double weight) {
        this(type,weight,"Perky","Curled");
    }

    public Dog(String type,double weight, String earShape, String tailShape) {
        super(type, (weight < 15 ? "small" : (weight < 35) ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void makeNoise() {
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    private void bark() {
        System.out.print("Woof! ");
    }

    private void run() {
        System.out.print("Dog running ! ");
    }

    private void walk() {
        System.out.print("Dog walking ! ");
    }

    private void wagTail() {
        System.out.print("Tail wagging ");
    }
}
