public class Cat extends Pet {

    private int price;

    public Cat (String name, String animal, String breed, String age, Gender gender) {
        super(name, animal, breed, age, gender);
    }

    @Override
    public int price() {
        price = 250;
        return price;
    } 

    public void personality() {
        System.out.println(name + " like to chase mice and take long naps");
    }
}