// Abstract class for all pets
public abstract class Pet {

  public enum Gender {
    FEMALE,
    MALE,
  }

  protected String name;
  protected int age;
  protected String species;
  protected String breed;
  protected Gender gender;
  private boolean adopted;

  // Constructor for Pet class
  public Pet(String name, String species, String breed, int age, Gender gender) {
    this.name = name;
    this.species = species;
    this.age = age;
    this.gender = gender;
    this.breed = breed;
    this.adopted = false;
  }

  // Prints the details of the pet
  public void printDetails() {
    System.out.println(
        name + "," + gender + " " + breed + " " + species + " " + age + " years old");
  }

  // Getters
  public String getSpecies() {
    return species;
  }

  public String getName() {
    return name;
  }

  public abstract int getPrice();

  public abstract int getCostPrice();

  public abstract void getPersonality();

  public boolean isSold() {
    return adopted;
  }

  public void sell() {
    this.adopted = true;
  }

  // Overrides object class' toString method
  @Override
  public String toString() {
    return species
        + " [Name: "
        + name
        + ", Breed: "
        + breed
        + ", Age: "
        + age
        + ", Gender: "
        + gender
        + "]";
  }
}
