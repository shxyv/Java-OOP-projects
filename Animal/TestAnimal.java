package Animal;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat=new Cat("Mesi");
        cat.greets();

        Dog dog=new Dog("Kuki");
        dog.greets();

        BigDog bigDog=new BigDog("df");
        bigDog.greets();


        Animal animal=new Cat("Mesi");
        animal.greets();

        Animal animal1=new Dog("ewrw");
        animal1.greets();

        Animal animal2=new BigDog("sda");
        animal2.greets();
    }
}
