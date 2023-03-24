public class Cat extends Pet {

    private int price;
    private int costPrice;

    public Cat (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

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
        System.out.println(name + " the " +age+ " year old " +breed+ " " +animal+" likes to chase mice and take long naps");
    }
}