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

  public Pet(String name, String animal, String breed, String age, Gender gender) {
    this.name = name;
    this.animal = animal;
    this.age = age;
    this.gender = gender;
    this.breed = breed;
  }

  public void details() {
    System.out.println(name + "," + gender + " " + breed + " " + animal + " " + age + " years old");
  }

  public String getPet() {
    return animal;
  }

  abstract public int price();
}
