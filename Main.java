class Main {

  public static void main(String[] args) {

    // Create pet shop instance and print details
    PetStore shop = new PetStore("Littlest Pet Shop", 100.0);
    System.out.println(
        "Starting balance for " + shop.getShopName() + " is $" + shop.getCashBalance());
    System.out.println();

	// Create some pet instance
    Rabbit lola = new Rabbit("Lola", "Bunny", "Dwarf Lop", "3", Pet.Gender.FEMALE);
    Cat garfield = new Cat("Garfield", "Cat", "Domestic Shorthair", "10", Pet.Gender.MALE);
    Bird tweety = new Bird("Tweety", "Bird", "Budgie", "2", Pet.Gender.MALE);

	// Buy some pets for the shop
    shop.purchasePet(lola);
    shop.purchasePet(garfield);
    shop.purchasePet(tweety);
    shop.purchasePet(tweety);

	// Print out cash balance of shop
    System.out.println(
        "Balance for " + shop.getShopName() + " after buying pets is $" + shop.getCashBalance());

    // Personalities of all the pets in the shop
    shop.printPetDetails();

    // Try to sell a Pet
    shop.sellPet("Tweety");

   shop.sellPet("Garfield");

    shop.sellPet("Lola");

    // Print inventory details
    shop.printInventoryDetails();
    System.out.println();
  }
}
