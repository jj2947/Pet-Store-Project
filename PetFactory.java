public class PetFactory {

  public static Pet createPet(String name, String breed, String species, int age, int costPrice, String gender) {

    switch (species) {
      case "Dog":
        return new Dog(name, species, breed, age, costPrice, Pet.Gender.valueOf(gender));
      case "Cat":
        return new Cat(name, species, breed, age, costPrice, Pet.Gender.valueOf(gender));
      case "Bird":
        return new Bird(name, species, breed, age, costPrice, Pet.Gender.valueOf(gender));
      case "Rabbit":
        return new Rabbit(name, species, breed, age, costPrice, Pet.Gender.valueOf(gender));
      default:
        System.out.println("Invalid species");
        System.exit(0);
    }
    return null;
  }
}
