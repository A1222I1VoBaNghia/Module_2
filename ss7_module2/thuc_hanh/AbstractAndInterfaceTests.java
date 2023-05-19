package ss7_module2.thuc_hanh;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for(Animal animal:animals){
            System.out.println(animal.makeNoise());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
