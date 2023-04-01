public abstract class Pet {

  protected enum Gender {
    FEMALE,
    MALE
  }

  protected String name;
  protected String age;
  protected String species;
  protected String breed;
  protected Gender gender;
  private boolean adopted;

  public Pet(String name, String species, String breed, String age, Gender gender) {
    this.name = name;
    this.species = species;
    this.age = age;
    this.gender = gender;
    this.breed = breed;
    this.adopted = false;
  }

  public void printDetails() {
    System.out.println(name + "," + gender + " " + breed + " " + species + " " + age + " years old");
  }

  public String getSpecies() {
    return species;
  }

  public String getName() {
    return name;
  }

  abstract public int getPrice();

  abstract public int getCostPrice();

  abstract public void getPersonality();

  public boolean isSold() {
    return adopted;
  }

  public void sell() {
    this.adopted = true;
  }

  @Override
  public String toString() {
    return species + " [Name: "+name+", Breed: "+breed+", Age: "+age+", Gender: "+gender+"]";
  }
}
