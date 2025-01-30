public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Kiskutya","hatalmas",15);
        doAnimalStuff(animal,"gyorsan");
        Dog dog = new Dog();
        doAnimalStuff(dog,"speedy");
        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriever",64,"Floppy","Swimmer");
        doAnimalStuff(retriever,"slow");

        Fish goldie = new Fish("Goldfish",3,25,5);
        doAnimalStuff(goldie,"slow");
        doAnimalStuff(goldie,"fast");
    }
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }


}
