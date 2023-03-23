
public class PetStore {

    private String shopName;
    private double cashBalance;

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



}
