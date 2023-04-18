// Cat class extending abstract class Pet
public class Cat extends Pet {

    private int price;
    private int costPrice;

    // Constructor for Cat class
    public Cat (String name, String species, String breed, int age, Gender gender) {
        super(name, species, breed, age, gender);
    }

    // Overrides abstract class methods
    @Override
    public int getPrice() {
        price = 250;
        return price;
    } 

    @Override
    public int getCostPrice() {
        costPrice = 100;
        return costPrice;
    }

    @Override
    public void getPersonality() {
        System.out.println(name + " the " +age+ " year old " +breed+ " " +species+" likes to chase mice and take long naps");
    }
}