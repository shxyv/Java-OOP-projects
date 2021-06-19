package Animal;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Wooow");
    }

    @Override
    void greets(Dog another) {
        System.out.println("Wooooooow");
    }

    void greets(BigDog another){
        System.out.println("Wooooooooooooow");
    }
}
