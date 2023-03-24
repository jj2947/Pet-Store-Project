public class Dog extends Pet {

    private int price;
    private int costPrice;
    
    public Dog (String name, String species, String breed, String age, Gender gender) {
        super(name, species, breed, age, gender);
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
    public void getPersonality() {
        System.out.println(name + " the " +age+ " year old " +breed+ " " +species+" likes to play fetch at the beach and go swimming");
    }
}
