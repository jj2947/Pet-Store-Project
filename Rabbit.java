public class Rabbit extends Pet {
    
    private int price;
    private int costPrice;
    
    public Rabbit (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int getPrice() {
        price = 75;
        return price;
    } 

    @Override
    public int getCostPrice() {
        costPrice = 35;
        return costPrice;
    }

    @Override
    public void getPersonality() {
        System.out.println(name + " likes to eat carrots and hop around");
    }
}

