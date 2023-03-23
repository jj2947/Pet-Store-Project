public class Bird extends Pet{

    private int price;
    
    public Bird (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int getPrice() {
        price = 50;
        return price;
    } 

    public void getPersonality() {
        System.out.println(name + " likes to be cheeky and imitate what you say");
    }
}
