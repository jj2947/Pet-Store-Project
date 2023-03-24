public class Bird extends Pet {

  private int price;
  private int costPrice;

  public Bird(String name, String species, String breed, String age, Gender gender) {
    super(name, species, breed, age, gender);
  }

  @Override
  public int getPrice() {
    price = 50;
    return price;
  }

  @Override
  public int getCostPrice() {
    costPrice = 25;
    return costPrice;
  }

  @Override
  public void getPersonality() {
    System.out.println(
        name + " the " +age+ " year old "+ breed + " " + species + " likes to be cheeky and imitate what you say");
  }
}
