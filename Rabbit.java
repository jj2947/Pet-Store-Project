// Rabbit class extends Pet class
public class Rabbit extends Pet {
    
    private int price;
    private int costPrice;
    
    // Constructor for Rabbit class
    public Rabbit (String name, String species, String breed, int age, int costPrice, Gender gender) {
        super(name, species, breed, age, gender);
        this.costPrice = costPrice;
    }

    // Overrides abstract class methods
    @Override
    public int getPrice() {
        price = 75;
        return price;
    } 

    @Override
    public int getCostPrice() {
        return costPrice;
    }

    @Override
    public void getPersonality() {
        System.out.println(name + " the " +age+ " year old " +breed+ " " +species+" likes to eat carrots and hop around");
    }
}

