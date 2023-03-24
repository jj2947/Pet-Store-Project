class Main {

  public static void main(String[] args) {

    // Create pet shop instance and print details
    PetStore shop = new PetStore("Littlest Pet Shop", 100.0);
    System.out.println(
        "Starting balance for " + shop.getShopName() + " is $" + shop.getCashBalance());
    System.out.println();

    Rabbit lola = new Rabbit("Lola", "Bunny", "Dwarf Lop", "3", Pet.Gender.FEMALE);
    Cat garfield = new Cat("Garfield", "Cat", "Domestic Shorthair", "10", Pet.Gender.MALE);
    Bird tweety = new Bird("Tweety", "Bird", "Budgie", "2", Pet.Gender.MALE);

    shop.purchasePet(lola);
    shop.purchasePet(garfield);
    shop.purchasePet(tweety);
    shop.purchasePet(tweety);

    System.out.println(
        "Balance for " + shop.getShopName() + " after buying pets is $" + shop.getCashBalance());

    // Personalities of all the pets in the shop
    shop.printPetDetails();

    // Try to sell a Pet
    boolean success = shop.sellPet("Tweety");
    if (success) {
      System.out.println("Sold pet: " + tweety.getName());
    } else {
      System.out.println("Could not sell: " + tweety.getName());
    }

    // Try to sell a Pet
    success = shop.sellPet("Garfield");
    if (success) {
      System.out.println("Sold pet: " + garfield.getName());
    } else {
      System.out.println("Could not sell: " + garfield.getName());
    }

    // Try to sell a Pet
    success = shop.sellPet("Lola");
    if (success) {
      System.out.println("Sold pet: " + lola.getName());
    } else {
      System.out.println("Could not sell: " + garfield.getName());
    }

    // Print inventory details
    shop.printInventoryDetails();
    System.out.println();
  }
}
