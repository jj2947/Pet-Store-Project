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

}
