class Main {

  public static void main(String[] args) {

    // Create pet shop instance and print details
    PetStore shop = new PetStore("Littlest Pet Shop", 100.0);
    shop.printCashBalance();

    // Create some pet instance
    Rabbit lola = new Rabbit("Lola", "Bunny", "Dwarf Lop", "3", Pet.Gender.FEMALE);
    Cat garfield = new Cat("Garfield", "Cat", "Domestic Shorthair", "10", Pet.Gender.MALE);
    Bird tweety = new Bird("Tweety", "Bird", "Budgie", "2", Pet.Gender.MALE);
    Dog sam = new Dog("Sam", "Dog", "German Shepherd", "4", Pet.Gender.MALE);
    Bird bigBird = new Bird("Big Bird", "Bird", "Rainbow Lorikeet", "6", Pet.Gender.FEMALE);
    Bird chickie = new Bird("Chickie", "Bird", "Cockatoo", "38", Pet.Gender.FEMALE);

    // Buy some pets for the shop
    shop.purchasePet(lola);
    shop.purchasePet(garfield);
    shop.purchasePet(tweety);
    shop.purchasePet(tweety);
    shop.purchasePet(sam);
    shop.purchasePet(chickie);
    shop.purchasePet(bigBird);

    shop.printInventoryDetails();

    // Personalities of all the pets in the shop
    shop.printPetDetails();

    // Try to sell a Pet
    shop.sellPet("Tweety");

    shop.sellPet("Garfield");

    shop.sellPet("Lola");

    // Print inventory details
    shop.printInventoryDetails();
  }
}
