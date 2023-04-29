// Bird class extending abstract Pet class
public class Bird extends Pet {

  private int price;
  private int costPrice;

  // Constructor for Bird class
  public Bird(String name, String species, String breed, int age, int costPrice, Gender gender) {
    super(name, species, breed, age, gender);
    this.costPrice = costPrice;
  }

  // Overrides abstract class methods
  @Override
  public int getPrice() {
    price = 50;
    return price;
  }

  @Override
  public int getCostPrice() {
    return costPrice;
  }

  @Override
  public void getPersonality() {
    System.out.println(
        name + " the " +age+ " year old "+ breed + " " + species + " likes to be cheeky and imitate what you say");
  }
}
