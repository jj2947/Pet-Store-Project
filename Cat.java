public class Cat extends Pet {

    private int price;

    public Cat (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int getPrice() {
        price = 250;
        return price;
    } 

    public void getPersonality() {
        System.out.println(name + " likes to chase mice and take long naps");
    }
}