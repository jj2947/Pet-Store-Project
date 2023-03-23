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

  public Pet searchForPet(String animal) {
    for (Pet pet : Pets) {
      String petLower = pet.getPet().toLowerCase();
      animal = animal.toLowerCase();
      if (petLower.contains(animal)) {
        return pet;
      }
    }
    return null;
  }

  
}
