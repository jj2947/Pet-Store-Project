
class Main {

	public static void main(String[] args) {

		// Create BookSeller instance and print details
		PetStore shop = new PetStore("Toys 'r' Us", 100.0); 
		System.out.println("Starting balance for " + shop.getShopName() + "is $ " shop.getCashBalance()); 
		System.out.println();
	}

}