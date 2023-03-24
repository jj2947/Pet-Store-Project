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

  public double getCashBalance() {
    return cashBalance;
  }

  public int getNumPets() {
    return Pets.size();
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
    if (alreadyHavePet(pet)) {
      System.out.println(pet.getName() + " already in stock, therefore won't purchase again.");
    } else {
      Pets.add(pet);
      cashBalance -= pet.getCostPrice();
      System.out.println("Added pet to shop: " + pet.toString());
    }
    System.out.println("There are " + getNumPets() + " at " + getShopName());
  }

  private boolean alreadyHavePet(Pet checkingIfInStock) {
    for (Pet petInStock : Pets) {
      if (petInStock == checkingIfInStock) {
        return true;
      }
    }
    return false;
  }

  public void printInventoryDetails() {
    System.out.println("Inventory details for " + shopName + ":");

    for (int i = 0; i < Pets.size(); i++) {
      Pet pet = Pets.get(i);
      System.out.print((i + 1) + ": ");
      if (pet.isSold()) {
        System.out.print("***SOLD*** ");
      } else {
        System.out.print("AVAILABLE  ");
      }
      System.out.println(pet);
    }

    System.out.println(
        "Balance for " + getShopName() + " after buying pets is $" + getCashBalance());

    double profit = getCashBalance() - this.initialBalance;

    System.out.println(getShopName() + " has made $" + profit);
  }

  public void printPetDetails() {
    for (Pet pet : Pets) {
      pet.getPersonality();
    }
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
