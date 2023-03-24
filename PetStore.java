import java.util.ArrayList;

public class PetStore {

  private String shopName;
  private double cashBalance;

  private ArrayList<Pet> Pets = new ArrayList<Pet>();

  public PetStore(String shopName, double initialBalance) {
    this.shopName = shopName;
    this.cashBalance = initialBalance;
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
      cashBalance -= pet.getPrice();
      System.out.println("Added pet to shop: " + pet.toString());
    }
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
        "Balance for "
            + getShopName()
            + " after buying pets is $"
            + getCashBalance());
  }

  public void printPetDetails() {
    for (Pet pet : Pets) {
        pet.getPersonality();
    }
  }

  public boolean sellPet(String name) {
    Pet pet = searchForPet(name);
    if (pet != null && !pet.isSold()) {
      cashBalance += pet.getCostPrice();
      pet.sell();
      return true;
    }
    return false;
  }

}
