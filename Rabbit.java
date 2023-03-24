public class Rabbit extends Pet {
    
    private int price;
    private int costPrice;
    
    public Rabbit (String name, String species, String breed, String age, Gender gender) {
        super(name, species, breed, age, gender);
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
        System.out.println(name + " the " +age+ " year old " +breed+ " " +species+" likes to eat carrots and hop around");
    }
}

