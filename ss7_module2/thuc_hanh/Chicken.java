package ss7_module2.thuc_hanh;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeNoise() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
