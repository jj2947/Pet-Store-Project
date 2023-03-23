public abstract class Pet {

  protected enum Gender {
    FEMALE,
    MALE
  }

  protected String name;
  protected String age;
  protected String animal;
  protected String breed;
  protected Gender gender;
  protected static int id;
  private boolean adopted;

  public Pet(String name, String animal, String breed, String age, Gender gender) {
    this.name = name;
    this.animal = animal;
    this.age = age;
    this.gender = gender;
    this.breed = breed;
    this.adopted = false;
  }

  public void printDetails() {
    System.out.println(name + "," + gender + " " + breed + " " + animal + " " + age + " years old");
  }

  public String getPet() {
    return animal;
  }

  public String getName() {
    return name;
  }

  abstract public int getPrice();

  public boolean isSold() {
    return adopted;
  }

  public void sell() {
    this.adopted = true;
  }

  @Override
  public String toString() {
    return "Pet [name = "+name+", animal = "+animal+", breed = "+breed+", age = "+age+", gender = "+gender+"]";
  }
}
