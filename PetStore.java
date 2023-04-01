import java.util.ArrayList;

public class PetStore {

  private String shopName;
  private double cashBalance;
  private double initialBalance;

  private ArrayList<Pet> Pets = new ArrayList<Pet>();

  public PetStore(String shopName, double initialBalance) {
    this.shopName = shopName;
    this.cashBalance = initialBalance;
    this.initialBalance = initialBalance;
  }

  public String getShopName() {
    return shopName;
  }

  public void printCashBalance() {
    System.out.println(getShopName() +" cash balance is "+cashBalance+"\n");
  }

  public double getCashBalance() {
    return cashBalance;
  }

  public Pet searchForPet(String name) {
    for (Pet pet : Pets) {
      String petLower = pet.getName().toLowerCase();
      name = name.toLowerCase();
      if (petLower.contains(name)) {
        return pet;
      }
    }
    return null;
  }

  public void purchasePet(Pet pet) {
    if (!alreadyHaveEnoughPets(pet)) {
      Pets.add(pet);
      cashBalance -= pet.getCostPrice();
      System.out.println("Added pet to shop: " + pet.toString());
    }
  }

  private boolean alreadyHaveEnoughPets(Pet checkingIfInStock) {
    int numPets = 0;
    String species;

    for (Pet petInStock : Pets) {
      if (petInStock.getSpecies().equals(checkingIfInStock.getSpecies()) && !petInStock.isSold()) {
        species = petInStock.getSpecies();
        numPets++;
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

    return false;
  }

  public void printInventoryDetails() {
    System.out.println("\nInventory details for " + shopName + ":\n");

    int petsInStock = 0;
    int petsSold = 0;

    for (int i = 0; i < Pets.size(); i++) {
      Pet pet = Pets.get(i);
      System.out.print((i + 1) + ": ");
      if (pet.isSold()) {
        System.out.print("***SOLD*** ");
        petsSold++;
      } else {
        System.out.print("AVAILABLE  ");
        petsInStock++;
      }
      System.out.println(pet);
    }

    System.out.println("\n" + petsSold + " pets have been sold");
    System.out.println("There are " + petsInStock + " pets available");

    System.out.println("\nBalance for " + getShopName() + " is $" + getCashBalance());

    double profit = getCashBalance() - this.initialBalance;

    System.out.println(getShopName() + " has made $" + profit);
  }

  public void printPetDetails() {
    System.out.println();
    for (Pet pet : Pets) {
      pet.getPersonality();
    }
    System.out.println();
  }

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
}
