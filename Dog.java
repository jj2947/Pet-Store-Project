// Dog class extends abstract Pet Class
public class Dog extends Pet {

    private int price;
    private int costPrice;
    
    // Constructor for Dog class
    public Dog (String name, String species, String breed, int age, int costPrice, Gender gender) {
        super(name, species, breed, age, gender);
        this.costPrice = costPrice;
    }

    // Overrides abstract class methods
    @Override
    public int getPrice() {
        price = 300;
        return price;
    } 

    @Override
    public int getCostPrice() {
        return costPrice;
    }

    @Override
    public void getPersonality() {
        System.out.println(name + " the " +age+ " year old " +breed+ " " +species+" likes to play fetch at the beach and go swimming");
    }
}
