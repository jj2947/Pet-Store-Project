public class Rabbit extends Pet {
    
    private int price;
    
    public Rabbit (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int price() {
        price = 75;
        return price;
    } 

    public void personality() {
        System.out.println(name + " likes to eat carrots and hop around");
    }
}

