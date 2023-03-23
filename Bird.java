public class Bird extends Pet{
    
    public Bird (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int price() {
        price = 50;
        return price;
    } 

    public void personality() {
        System.out.println(name + " likes to be cheeky and imitate what you say");
    }
}
