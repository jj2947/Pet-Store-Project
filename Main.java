/* A program that simulates a pet shop, where pets can be purchased and sold. The program
tracks the cash balance of the shop and inventory of the store. The store can not have more
than 2 pets that are the same species. */

import java.util.*;

class Main {

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    Scanner details = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    Scanner choice = new Scanner(System.in);

    System.out.println("\n╔═╗┌─┐┌┬┐  ╔═╗┌┬┐┌─┐┬─┐┌─┐");
    System.out.println("╠═╝├┤  │   ╚═╗ │ │ │├┬┘├┤ ");
    System.out.println("╩  └─┘ ┴   ╚═╝ ┴ └─┘┴└─└─┘");

    System.out.print("Pet Store Name: ");
    String shopName = userInput.nextLine();
    System.out.print("Pet Store initial balance: ");
    int shopBalance = userInput.nextInt();

    if (shopBalance < 0) {
      System.out.println("Invalid balance. Balance set to 0.");
      shopBalance = 0;
    }

    PetStore shop = new PetStore(shopName, shopBalance);

    System.out.println("\nBUY_PET                              Buy a pet from a supplier");
    System.out.println("SELL_PET                             Sell a pet to a custome");
    System.out.println("PRINT_INVENTORY                      Print the inventory of the store");
    System.out.println("PET_DETAILS                          Print the details of a pet");
    System.out.println("EXIT                                 Exit the program");
    System.out.println("HELP                                 Print the list of commands");

    while (true) {

      final String COMMAND_PREFIX = "pet store system> ";
      System.out.print(COMMAND_PREFIX);
      String userChoice = choice.next();

      // Implement the user input here
      switch (userChoice) {
        case "BUY_PET":
          System.out.print("Enter pet name: ");
          String petName = details.next();
          // Makes sure the name is in title case
          petName = petName.toLowerCase();
          petName = petName.replace(petName.charAt(0), Character.toUpperCase(petName.charAt(0)));

          System.out.print("Enter pet species (Dog/Cat/Rabbit/Bird): ");
          String petSpecies = details.next();
          // Makes sure the species is in title case
          petSpecies = petSpecies.toLowerCase();
          petSpecies =
              petSpecies.replace(petSpecies.charAt(0), Character.toUpperCase(petSpecies.charAt(0)));

          System.out.print("Enter pet breed: ");
          String petBreed = details.next();
          // Makes sure the breed is in title case
          petBreed = petBreed.toLowerCase();
          petBreed =
              petBreed.replace(petBreed.charAt(0), Character.toUpperCase(petBreed.charAt(0)));

         

          System.out.print("Enter pet age: ");
          int petAge = details.nextInt();

          System.out.print("Enter pet gender (Female/Male): ");
          String petGender = details.next();
          petGender = petGender.toUpperCase();

          Pet pet = PetFactory.createPet(petName, petBreed, petSpecies, petAge, petGender);
          shop.purchasePet(pet);
          break;

        case "SELL_PET":
          System.out.print("Enter pet name: ");
          String petName2 = name.nextLine();
          petName2 = petName2.toLowerCase();
          petName2 = petName2.replace(petName2.charAt(0), Character.toUpperCase(petName2.charAt(0)));
          shop.sellPet(petName2);
          break;

        case "PRINT_INVENTORY":
          shop.printInventoryDetails();
          break;

        case "PRINT_PET_DETAILS":
          shop.printPetDetails();
          break;

        case "HELP":
          System.out.println("BUY_PET");
          System.out.println("SELL_PET");
          System.out.println("PRINT_INVENTORY");
          System.out.println("PRINT_PET_DETAILS");
          System.out.println("EXIT");
          System.out.println("HELP");
          break;

        case "EXIT":
          System.exit(0);
          details.close();
          name.close();
          userInput.close();
          choice.close();
          break;

        default:
          System.out.println("Invalid command. Please try again.");
          break;
      }
    }
  }
}
