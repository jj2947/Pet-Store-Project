import java.util.ArrayList;

// PetStore class that stores the pets and cash balance
public class PetStore {

  private String shopName;
  private double cashBalance;
  private double initialBalance;

  // ArrayList to store the pets
  private ArrayList<Pet> Pets = new ArrayList<Pet>();

  // Constructor
  public PetStore(String shopName, double initialBalance) {
    this.shopName = shopName;
    this.cashBalance = initialBalance;
    this.initialBalance = initialBalance;
  }

  public String getShopName() {
    return shopName;
  }

  public void printCashBalance() {
    System.out.println(getShopName() + " cash balance is " + cashBalance + "\n");
  }

  private double getCashBalance() {
    return cashBalance;
  }

  // Searches for a pet by name in the ArrayList and returns it if found
  private Pet searchForPet(String name) {
    for (Pet pet : Pets) {
      String petLower = pet.getName().toLowerCase();
      name = name.toLowerCase();
      if (petLower.contains(name)) {
        return pet;
      }
    }
    return null;
  }

  /*  Adds a pet to the ArrayList if we don't already have enough of that species and we have enough cash
  to purchase the pet. The price of the pet is subtracted from the cash balance*/
  public void purchasePet(Pet pet) {
    if (!alreadyHaveEnoughPets(pet) && getCashBalance() > pet.getCostPrice()) {
      Pets.add(pet);
      cashBalance -= pet.getCostPrice();
      System.out.println("Added pet to shop: " + pet.toString());
    } else if (getCashBalance() < pet.getCostPrice()) {
      System.out.println("Not enough cash to purchase " + pet.getName());
    }
  }

  // Checks if there are already two of a particular species in the ArrayList
  private boolean alreadyHaveEnoughPets(Pet checkingIfInStock) {
    int numPets = 0;
    String species;

    for (Pet petInStock : Pets) {

      // If the species is the same as the pet we are checking and the pet is not sold, increment
      // the number of pets
      if (petInStock.getSpecies().equals(checkingIfInStock.getSpecies()) && !petInStock.isSold()) {
        species = petInStock.getSpecies();
        numPets++;

        // If there are already two of the same species, print a message and return true
        if (numPets >= 2) {
          System.out.println(
              "There are already 2 "
                  + species
                  + "s at "
                  + getShopName()
                  + ", so "
                  + checkingIfInStock.getName()
                  + " has not been purchased");
          return true;
        }
      }

      // If the pet is already in the ArrayList, print a message and return true
      if (petInStock == checkingIfInStock) {
        System.out.println(
            petInStock.getName()
                + ", is already at "
                + getShopName()
                + " so "
                + checkingIfInStock.getName()
                + " has not been purchased again");
        return true;
      }
    }

    // If the pet is not already in the ArrayList, and there are not already two of the
    // pet's species, return false
    return false;
  }

  // Prints the inventory details for the shop, including the number of pets sold and available,
  // cash balance and profit
  public void printInventoryDetails() {

    // Print the number of pets available
    if (getPetsAvailable() == 1) {
      System.out.println("There is " + getPetsAvailable() + " pet available");
    } else {
      System.out.println("There are " + getPetsAvailable() + " pets available");
    }

    // Loop through the ArrayList and print the details of each pet and whether it is sold or
    // available
    for (int i = 0; i < Pets.size(); i++) {
      Pet pet = Pets.get(i);
      System.out.print("  " + (i + 1) + ": ");
      if (pet.isSold()) {
        System.out.print("***SOLD*** ");

      } else {
        System.out.print("AVAILABLE  ");
      }
      System.out.println(pet);
    }

    // Print the number of pets sold
    if (getPetsSold() == 1) {
      System.out.println("There is " + getPetsSold() + " pet sold");
    } else {
      System.out.println("There are " + getPetsSold() + " pets sold");
    }

    // Print the cash balance and profit
    System.out.println("Balance for " + getShopName() + " is $" + getCashBalance());

    double profit = getCashBalance() - this.initialBalance;

    System.out.println(getShopName() + " has made $" + profit);
  }

  // Prints the personality of each pet in the ArrayList
  public void printPetDetails() {
    for (Pet pet : Pets) {
      pet.getPersonality();
    }
  }

  // Sells a pet by name if it is in the ArrayList and not already sold
  public void sellPet(String name) {
    Pet pet = searchForPet(name);
    if (pet != null && !pet.isSold()) {
      cashBalance += pet.getPrice();
      pet.sell();
      System.out.println("Sold pet: " + pet.getName());
    } else {
      System.out.println("Could not sell: " + name);
    }
  }

  private int getPetsSold() {
    int petsSold = 0;
    for (Pet pet : Pets) {
      if (pet.isSold()) {
        petsSold++;
      }
    }
    return petsSold;
  }

  private int getPetsAvailable() {
    int petsAvailable = 0;
    for (Pet pet : Pets) {
      if (!pet.isSold()) {
        petsAvailable++;
      }
    }
    return petsAvailable;
  }
}
