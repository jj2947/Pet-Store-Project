public class Dog extends Pet {

    private int price;
    private int costPrice;
    
    public Dog (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int getPrice() {
        price = 300;
        return price;
    } 

    @Override
    public int getCostPrice() {
        costPrice = 150;
        return costPrice;
    }

    @Override
    public String getPersonality() {
        return name + " likes to play fetch at the beach and go swimming";
    }
}
